package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter A Game Score ? ");
        String input = scanner.nextLine().trim();

        // First we Parce the Home:visitor | 21:9 the score

        String [] firstpart = input.split("\\|");

        String team = firstpart [0];
        String score = firstpart [1];

       // System.out.println(team + score);//
        // okay now after dividing  | here we need to divide :

        String [] teamlist = team.split(":");
        String home = teamlist [0];
        String Visitor = teamlist [1];
        // here i have divided the home and visitor moving on the score ':'


        /// here we are conversting to int we willbe using pare int
        String [] scorelist = score.split(":");
        int score1 = Integer.parseInt(scorelist[0]);
        int score2 = Integer.parseInt(scorelist[1]);

        //System.out.println(home);
       // System.out.println(Visitor);
      //  System.out.println(score1);
      //  System.out.println(score2);

       // System.out.println(home + "Score " +score1);
        //System.out.println(Visitor + "Score " + score2);

        if (score1 > score2){
            System.out.println("winner : " + home);
        }else if (score2 > score1){
            System.out.println("winner : " + Visitor);
        }else {
            System.out.println(" Error Wrong Entry !!! ");
        }




























    }
}
//Home:Visitor|21:9↵
//Home:Visitor|21:9
//Based on the user input, you should determine which team had the higher score
//and display the name of the winning team.
//Hint: You will have to split the user input multiple times to get all of the
//information
//- one split will be on the pipe ( | )
//- one split will be on the colon ( : )
//A sample trace of your program output is shown below. Bolded code is what the
//user entered.
//Please enter a game score: Home:Visitor|21:9↵
//Winner: Home
//A different trace would be:
//Please enter a score: Slytherin:Gryffindor|23:59↵
//Winner: Gryffindor
//Step 2
//1. Ensure all your changes are committed and pushed to GitHub
//2. Send your repository URL to your Instructor//