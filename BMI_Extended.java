/********************************************************************************************
 * File Name: BMI_Extended.java
 * Due Date: 9/25/15 
 * 
 * Author: Jonndre King
 * 
 * Program Description:  
 * Body Mass Index (BMI) is a person’s (w) weight divided by (h) height.  
 * A high BMI can be an indicator of high body fatness.  BMI can be used to screen for 
 * weight categories that may lead to health problems but it is not diagnostic of the body 
 * fatness or health of an individual.  
 * *******************************************************************************************/

import java.util.Scanner;

public class BMI_Extended
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
      
     
      
    if(bmi < 18.5) {
        System.out.println(", indicating your weight is in the Underweight category for adults of your height.");
         
        System.out.println ("\n"); 
        System.out.println ("For your height, a normal weight range would be from 115 to 154 pounds."); 
        System.out.println ("\n");
        System.out.println ("Talk with your healthcare provider to determine possible causes of underweight and if you need to gain weight."); 
        
    }
      
    if(bmi > 18.5 && bmi < 24.9) { 
        System.out.println(", indicating your weight is in the Normal category for adults of your height.");
         
        System.out.println ("\n"); 
        System.out.println ("For your height, a normal weight range would be from 115 to 154 pounds."); 
        System.out.println ("\n");
        System.out.println ("Maintaining a healthy weight may reduce the risk of chronic diseases associated with overweight and obesity. For information about the importance of a healthy diet and physical activity in maintaining a healthy weight, visit Preventing Weight Gain."); 
    }
    if(bmi > 25 && bmi < 29.9) {
        System.out.println(", indicating your weight is in the Overweight category for adults of your height.");
        
        System.out.println ("\n");
        System.out.println ("For your height, a normal weight range would be from 115 to 154 pounds. People who are overweight or obese are at higher risk for chronic conditions such as high blood pressure, diabetes, and high cholesterol. Anyone who is overweight should try to avoid gaining additional weight. Additionally, if you are overweight with other risk factors (such as high LDL cholesterol, low HDL cholesterol, or high blood pressure), you should try to lose weight. Even a small weight loss (just 10% of your current weight) may help lower the risk of disease. Talk with your healthcare provider to determine appropriate ways to lose weight. For information about the importance of a healthy diet and physical activity in reaching a healthy weight, visit Healthy Weight."); 
    }
    if(bmi > 30) {
       System.out.println(", indicating your weight is in the Obese category for adults of your height.");
         
        System.out.println ("\n"); 
        System.out.println ("For your height, a normal weight range would be from 115 to 154 pounds.Anyone who is overweight should try to avoid gaining additional weight. Additionally, if you are overweight with other risk factors (such as high LDL cholesterol, low HDL cholesterol, or high blood pressure), you should try to lose weight. Even a small weight loss (just 10% of your current weight) may help lower the risk of disease. Talk with your healthcare provider to determine appropriate ways to lose weight. For information about the importance of a healthy diet and physical activity in reaching a healthy weight, visit Healthy Weight."); 
    } 
      
System.out.println ("\n");      
      
System.out.println ("******************************************************************************");
        
System.out.println ("\n");
      
System.out.print("Thanks for using the Adult BMI Calculator! For more information about the importance of a healthy diet and physical activity in reaching a healthy weight, visit: http://www.cdc.gov/healthyweight/index.html");      
      
System.out.println ("\n");      
      
  }//end of main
    
}//end of BMI class