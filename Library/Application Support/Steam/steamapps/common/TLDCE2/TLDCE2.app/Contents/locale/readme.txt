            'THE LAST DOOR' SEASON TWO
                Collector's Edition

             User Created Translations

We wanted to provide a way for user to easily create
custom translations for the game. If you want to 
translate the game into your language for other players
to be able to enjoy it, please read these instructions
carefully.

The game will load and display languages placed in the
folder:

 [instalation_folder]\Locale

These languages must be valid XML files, including all
the translations for all the texts in the game.

The process to create a new language for the game is:

- Create a copy of the file:  
  [instalation_folder]\Locale\ex.xml.example
  (this file contains the original texts of the game 
  in english) and rename the file with the language 
  code plus the .xml extension, for example:
  [instalation_folder]\Locale\pt-BR.xml

- Now, use a text editor capable of handling the XML 
  format to edit each of the texts found within 
  this file.

- We recommed you start translating this element:
 
  <string id="OPTS_LANGUAGE_NAME">English</string>

  since it's the string which gives name to the 
  language in the Options menu, i.e:

  <string id="OPTS_LANGUAGE_NAME">Português</string>

- At any point, you can save the changes on the XML 
  file and boot up the game. If everything went OK,
  you should be able to select the new language in
  the OPTIONS menu, and test the progress of your 
  translation inside the game.

- During the game, use F10 on your keyboard to display 
  a panel that shows the Package and Id of the last 
  phrases requested by the game. This way, if you spot
  a mistake in your translation you know what to look 
  for in the XML file.

Have fun!

The Game Kitchen, 2016


