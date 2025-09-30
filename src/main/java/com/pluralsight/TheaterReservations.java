package com.pluralsight;

import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        System.out.println("== Theater Reservations ==");
        System.out.print("Please Enter Your Name?: ");
        String name = scan.nextLine().trim();
        System.out.print("What Date Will you be coming? (MM/dd/yyyy): ");
        String dateinput = scan.nextLine().trim();
        System.out.print("How many tickets would you like?: ");
        int ticket = scan.nextInt();

       if (ticket > 3 ){
           System.out.println( ticket + " Tickets Reserved for " + dateinput  + " Under " + name );
       } else if (ticket == 1 ) {
           System.out.println( ticket + " Ticket Reserved for " + dateinput  + " Under " + name );
       }else {
           System.out.println("Invalid Entry Please Try Again Thank You ");
       }
    }
}
