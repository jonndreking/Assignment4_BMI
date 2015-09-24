/********************************************************************************************
 * File Name: BMI.java
 * Due Date: 9/25/15 
 * 
 * Author:  Jonndre King
 * 
 * Program Description:  
 * Body Mass Index (BMI) is a person’s (w) weight divided by (h) height.  
 * A high BMI can be an indicator of high body fatness.  BMI can be used to screen for 
 * weight categories that may lead to health problems but it is not diagnostic of the body 
 * fatness or health of an individual.  
 * *******************************************************************************************/

import java.util.Scanner;

public class BMI
{
  public static void main(String[] args)
  {
    //Declare variables
    String fullname; 
    int feet;
    int inches;
    int totalheight; 
    int weight;
    double bmi;
      
    //Declare Scanner object to Accept Keyboard Input
     Scanner keyboard = new Scanner(System.in);
      
      
      
    /******************************************************************************
    /                    Display Header for BMI Application (code below)
    /*****************************************************************************/
           
      System.out.println ("******************************************************************************");
      System.out.println ("\n");
      System.out.println ("Welcome to the adult BMI Calculator!");
      System.out.println ("\n");
      System.out.println ("******************************************************************************");
 

    /******************************************************************************
    /                        User Interaction (code below)
    /      Ask and Read the user name, height(feet), height(inches), and weight
    /******************************************************************************/
     
        System.out.println ("\n");
      
     System.out.println ("Please enter your name then press enter."); 
     fullname = keyboard.nextLine();
      
      System.out.println ("\n");
      
     System.out.println ("Please enter your height (feet) then press enter.");
     feet = keyboard.nextInt();
      
      System.out.println ("\n");
      
     System.out.println ("Please enter your height (inches) then press enter.");
     inches = keyboard.nextInt(); 
      
      System.out.println ("\n");
      
     System.out.print ("Please enter your weight (round) then press enter.");
     weight = keyboard.nextInt();
      
      System.out.println ("\n");  
    
      
      
      
      
      
    /*******************************************************************************
    /                          Convert and Calculate BMI
    /******************************************************************************/
    totalheight = (feet * 12) + inches;
    bmi = (weight / Math.pow(totalheight, 2)) * 703;
      
      
      
          
          
    /********************************************************************************
    /                   Display the Calculation AND Thank you message
    /********************************************************************************/
System.out.println ("******************************************************************************");
  
System.out.println ("\n");      
      
System.out.print(fullname + " your BMI score is: " +bmi);
      
System.out.println ("\n");      
      
System.out.println ("******************************************************************************");
        
System.out.println ("\n");
      
System.out.print("Thanks for using the Adult BMI Calculator! For more information about the importance of a healthy diet and physical activity in reaching a healthy weight, visit: http://www.cdc.gov/healthyweight/index.html");      
      
System.out.println ("\n");      
      
  }//end of main
    
}//end of BMI class