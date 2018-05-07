// Mohan Jia
// mojia
// 12B
// 01/18/2018
// recursion
// prints the min and max elements

class Recursion{
    
    private static void reverseArray1(int[] X, int n, int[] Y){
        if (n == 0)
        {
        }
        else{
            Y[Y.length - (n)] = X[n - 1];
            reverseArray1(X, n - 1, Y);
        }
    }
    
    private static void reverseArray2(int[] X, int n, int[] Y){
        if (n == 0)
        {
            
        }
        else{
            Y[n - Y.length] = X[n - 1];
            reverseArray1(X, n - 1, Y);
        }
    }
    
    private static void reverseArray3(int[] X, int i, int j){
        if (j == X.length/2)
        {
            
        }
        else{
            int temp = X[i];
            X[i] = X[j];
            X[j] = temp;
            
            reverseArray3(X, i + 1, j - 1);
        }
    }
    
    static int maxArrayIndex(int[] X, int p, int r){
        int q;
        if(r-p == 0)
            return (p);
        else
            q = (p+r)/2;
        int a = maxArrayIndex(X, p, q);
        int b = maxArrayIndex(X, q+1, r);
        if(X[a]>X[b])
            return a;
        else
            return b;
    }
    
    static int minArrayIndex(int[] X, int p, int r){
        int q;
        if(r-p == 0)
            return (p);
        else
            q = (p+r)/2;
        int a = minArrayIndex(X, p, q);
        int b = minArrayIndex(X, q+1, r);
        if(X[a]<X[b])
            return a;
        else
            return b;
    }
    
    public static void main(String[] args){
        
        int[] A = {-1, 2, 6, 12, 9, 2, -5, -2, 8, 5, 7};
        int[] B = new int[A.length];
        int[] C = new int[A.length];
        int minIndex = minArrayIndex(A, 0, A.length-1);
        int maxIndex = maxArrayIndex(A, 0, A.length-1);
        
        for(int x: A) System.out.print(x+" ");
        System.out.println();
        
        System.out.println( "minIndex = " + minIndex );
        System.out.println( "maxIndex = " + maxIndex );
        
        reverseArray1(A, A.length, B);
        for(int x: B) System.out.print(x+" ");
        System.out.println();
        
        reverseArray2(A, A.length, C);
        for(int x: C) System.out.print(x+" ");
        System.out.println();
        
        reverseArray3(A, 0, A.length-1);
        for(int x: A) System.out.print(x+" ");
        System.out.println();
        
    }
}
