The new launcher replaces most of the need for command line arguments listed below.  If you want to ignore the launcher and still use the arguments explained below please add "-no_launcher" to the list of arguments.

To re-enable the launcher if you've unchecked "Show Launcher on Startup" hold your SHIFT key while launching Braid.

Here are some useful command-line options for Braid; to use them you can put these arguments in the "Target" section of a Shortcut's properties, or run Braid from a command prompt.

Example:

braid.exe -60fps -windowed -no_post
(Run Braid with the frame rate forced to 60 frames per second, in a window, without postprocessing).


The options are:

-windowed : Run Braid in a window, rather than full-screen.  (If you don't specify this option, you can switch between fullscreen and windowed at runtime by pressing Alt-Enter.)

-60fps :
-30fps :
-20fps :
-15fps :
-12fps :
-10fps : Bypass Braid's startup frame-rate check and force the game to try and run at this many frames per second.  If the number is too high for your computer, action in the game will be slowed down.  Because you are skipping the startup test, postprocessing will always be on.  If you want to turn it off (and thus possibly hit the frame rate target you are going for), use -no_post below.  If you press the 0 key in-game, you'll get some HUD text telling you what frame rate the game is trying to hit, how fast it is actually going, and whether postprocessing is turned on.

-no_post : Do not perform postprocessing effects.  This may make the game run more quickly on your graphics hardware, but time-oriented visual effects will be much simpler.  

-universe universe_name : Run someone's modifications that have been previously installed (changes to levels, graphics, etc).  Instructions on how to create mods will be posted separately.

-editor : Enable the in-game editor.  If you use this command-line option, pressing F11 will open the editor to the level you are currently playing.

-no_music : disable music.

-no_vsync : The game will not synch to the vertical refresh.  This may allow the game to run a little faster, but you will see tearing in the image.


-language english :
-language french :
-language german :
-language italian :
-language spanish :
-language portuguese :
-language japanese :
-language korean :
-language tchinese :  Run Braid in the designated language.  If you do not use one of these options, Braid will read the appropriate language setting from Windows (or from Steam if you are using Steam).




Here are some useful keypresses:

Print Screen : Take a screenshot and save it in the Braid folder.  You must have write permission to the Braid folder for this to work.

0 : Toggle the frame rate display.

F11 : Open and close the editor (if enabled with -editor).

There are a lot of key commands for the editor; they will be documented separately.
