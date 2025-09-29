package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter A Game Score ? ");
        String input = scanner.nextLine();

        String []parts = input.split("\\|");

        System.out.println(parts);




        //String [] newinput = input.split (Pattern.quote(":"));
        //String [] newinput1 = input.split (Pattern.quote("\\|"));


       // String name1 = newinput [0];
        //String name2 = newinput [1];
        //int first = Integer.parseInt(newinput[2]);
        //int second = Integer.parseInt(newinput[3]);

        //System.out.println(name1 + name2 + first);










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