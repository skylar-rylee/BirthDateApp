//
// Name: Atacador, Skylar
// Homework: #4
// Due: 10/15/2024
// Course: cs-1400-05-f24
//
// Description:
// Asks user for their birthdate and returns the day of the week they are born

import java.io.IOException;
import java.util.Scanner;

public class BirthDateApp
{
     public static void main (String []args) throws IOException
     { 
          Scanner keyboard = new Scanner(System.in);
          System.out.println("Birth Date by S. Atacador");
          System.out.println();
          System.out.print("Enter your birth date month day year? ");
          
          int monthInput = keyboard.nextInt();
          int dayInput = keyboard.nextInt();
          int yearInput = keyboard.nextInt();
          
          System.out.println();

          int dayNumber = getDayOfTheWeek(dayInput, monthInput, yearInput);
          String dayName = getDayName(dayNumber);
          String monthName = getMonthName (monthInput);

          System.out.println("You were born on " + dayName + ", " + monthName + " " + dayInput + ", " + yearInput + ".");
          System.out.println();
     }
     public static int getDayOfTheWeek (int day, int month, int year) {
          int a = (14 - month)/12;
          int y = year - a;
          int m = month + 12*a - 2;
          return (day + y + (y/4) - (y/100) + (y/400) + (31*m)/12) % 7;
     }

     public static String getDayName (int day) {
          switch (day) {
               case 0:
                    return "Sunday";
               case 1:
                    return "Monday";
               case 2:
                    return "Tuesday";
               case 3:
                    return "Wednesday";
               case 4:
                    return "Thursday";
               case 5:
                    return "Friday";
               case 6:
                    return "Saturday";
               default:  
                    return "Invalid";
          }
     }  
     
     public static String getMonthName (int month) {
         return switch (month) {
             case 1 -> "January";
             case 2 -> "February";
             case 3 -> "March";
             case 4 -> "April";
             case 5 -> "May";
             case 6 -> "June";
             case 7 -> "July";
             case 8 -> "August";
             case 9 -> "September";
             case 10 -> "October";
             case 11 -> "November";
             case 12 -> "December";
             default -> "Invalid";
         };
     }
}