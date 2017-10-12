/*
    Yonatan Mengesha
    october 11
    Creating a project from scratch
    Java Boot Camp


 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Declare the height ,width,result and ans
         double height;
         double width;
         double result;
         String ans;
         //Create a scanner object called scan
      Scanner scan = new Scanner (System.in);

      //create a do while loop to ask the user if they want to insert another record
      do{
          //Ask the user to Enter  the height in inch
          System.out.println ("Enter the height of the roof in inch:" );
          height=scan.nextInt ();
          scan.nextLine ();

          //Ask the user to Enter the width in inch
          System.out.println ("Enter the width of the roof in inch:" );
          width=scan.nextInt ();
          scan.nextLine ();
            //Convert the height and width in to inch by multiplying the height by 12
          height=height*12;
          width=width*12;
          //calculate the result and convert it in to gallon by dividing it by 231
          result=(width*height*1)/231;


        //Round off the result in to two decimals places
          double roundoffresult=(double)Math.round ( result*100 )/100;

        // Display  out the result in gallon
          System.out.println ("amount of rainfall that runs off my roof in gallons is: " +roundoffresult +" Gallon");

          //Ask the user if they want to add a record
          System.out.println ("Do you want to Add another Record?(Yes/No)" );
            ans= scan.nextLine();

      }while(ans.equalsIgnoreCase ( "yes" ));




    }
}
