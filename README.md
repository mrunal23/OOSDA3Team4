# OOSDA3Team4

##About

  This is the third assignment of the project from Object Oriented Software Development(OOSD) course.
  The members of this team are Mrunal Lele(Me), Rohith Nednurni, Ankit Sadana and Yash Ketkar.
  The project was to build a breaking brick game(https://en.wikipedia.org/wiki/Breakout_(video_game)) with features listed below:

  1. A game timer.
  2. To Pause/STOP/Replay a game.
  3. To SAVE/LOAD a game.

##Technolgies used

    The project is developed using Java Swing. The code uses Java 7.0.
  
##Implementation details

    The project includes an implementation of breakout game, along with additional features mentioned above.
  
###Design Patterns
  
    The features were to be implemented with the use of java design patterns. The design patterns used are specified below:
#### Observer Design pattern : 
    For synchronizing movement of ball with respect to clock in the game.(https://en.wikipedia.org/wiki/Observer_pattern)
#### Command Design Pattern : 
    To execute replay, undo, start and stop functionality in the game. (https://en.wikipedia.org/wiki/Observer_pattern)
#### Strategy Design Pattern : 
    To change the layout of buttons in the game menu. (Click on the Layout button to see changes. https://en.wikipedia.org/wiki/Strategy_pattern)

###Controls
    The program uses left and right arrow keys for paddle movement.

##Running the code

You can run the code either from command prompt or directly from the jar file. The below instructions are for Windows machine. Mac/Linux users can use the same commands and replace the '\' in file path with '/'.

###Command Prompt

  Compile the code 
  
    javac com\p532\brickout\main\Main.java
  
  Run the program
  
    java com.p532.brickout.main.Main

###Jar file

  Run the following command to run java file
  
    java -jar A3_team4-master\jarFile\A3_team4.jar



