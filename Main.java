
import java.util.Scanner;

class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your words as follows - adjective,adjective,common noun,adjective,common noun,proper noun,proper noun,adjective,adjective. Be sure to seperate each word with commas. ");
    String userInput = sc.nextLine(); //takes user input
  
/*
sets the variable for the word equal to the substring of userInput from the begining of 
the input to the index of the comma. Then the word that has been read and the comma are
removed so the next word can be read the same way.
*/

    String word1 = userInput.substring(0,userInput.indexOf(","));
    userInput = userInput.replaceFirst(word1 + ",", " ");

    String word2 = userInput.substring(0,userInput.indexOf(","));
    userInput = userInput.replaceFirst(word2 + ",", " ");

    String word3 = userInput.substring(0,userInput.indexOf(","));
    userInput = userInput.replaceFirst(word3 + ",", " ");

    String word4 = userInput.substring(0,userInput.indexOf(","));
    userInput = userInput.replaceFirst(word4 + ",", " ");

    String word5 = userInput.substring(0,userInput.indexOf(","));
    userInput = userInput.replaceFirst(word5 + ",", " ");

    String word6 = userInput.substring(0,userInput.indexOf(","));
    userInput = userInput.replaceFirst(word6 + ",", " ");
   
   String word7 = userInput.substring(0,userInput.indexOf(","));
    userInput = userInput.replaceFirst(word7 + ",", " ");

    String word8 = userInput.substring(0,userInput.indexOf(","));
    userInput = userInput.replaceFirst(word8 + ",", " ");

    String word9 = userInput;  //doesn't clear as it is unnessesary

    System.out.println("Your words were: \n " + word1 + "\n"  //print back user input
                                          + word2 + "\n"
                                          + word3 + "\n"
                                          + word4 + "\n"
                                          + word5 + "\n"
                                          + word6 + "\n"
                                          + word7 + "\n"
                                          + word8 + "\n"
                                          + word9 + "\n");


    String madLib = "The Tyrannosaurus Rex was one of the most -1- dinosaurs to live. Its name meant -2- -3-. It was a meat eater, or carnivore. The T-rex's jaws were very -4- and many -5-s feared it. The T-rex was about 20 feet high, which is as tall as -6-!. It is also over 15000 pounds, which is as heavy as about 7 -7-s! When T-Rex walked, it used its two -8- legs. Even though it was large and scary, its arms were very -9-.";  //sets madLib to the mad lib
    String madLib2 = madLib.replaceAll("-1-", word1);  //replace markers within madlib
    madLib2 = madLib2.replaceAll("-2-", word2);
    madLib2 = madLib2.replaceAll("-3-", word3);
    madLib2 = madLib2.replaceAll("-4-", word4);
    madLib2 = madLib2.replaceAll("-5-", word5);
    madLib2 = madLib2.replaceAll("-6-", word6);
    madLib2 = madLib2.replaceAll("-7-", word7);
    madLib2 = madLib2.replaceAll("-8-", word8);
    madLib2 = madLib2.replaceAll("-9-", word9);
    System.out.print(madLib2);   //print the final madlib
    

  }
}