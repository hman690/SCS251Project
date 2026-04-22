// CSC-251 Project 3, insurance PolicyHolder Class to be used in project 3, subclass of Policy class
// by Hayden Myers
// Date 4/22/2026
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class PolicyHolder extends Policy{

  private String pHolderFName;
  private String pHolderLName;
  private int pHolderAge;
  private String pHolderSmokeStatus; //smoker or non-smoker
  private double pHolderHeight; //in inches
  private double pHolderWeight; //in pounds
  
   public PolicyHolder(){
      pHolderFName = "ERROR";
      pHolderLName = "ERROR";
      pHolderAge = -1;
      pHolderSmokeStatus = "ERROR";
      pHolderHeight = -1;
      pHolderWeight = -1;
   }
   
   public PolicyHolder(String fName, String lName, int age, String smokeStatus, double height, double weight){
      pHolderFName = fName;
      pHolderLName = lName;
      pHolderAge = age;
      pHolderSmokeStatus = smokeStatus;
      pHolderHeight = height;
      pHolderWeight = weight;
   }
   
   
   //setters
   
   /**
      sets the pHolderFName String from the class
      @param the policy holder's first name pHolderFName as a String
   */
   public void setPHolderFName(String pHolFName){
      pHolderFName = pHolFName;
   }
   
   /**
      sets the pHolderLName String from the class
      @param the policy holder's last name pHolderLName as a String
   */
   public void setPHolderLName(String pHolLName){
      pHolderLName = pHolLName;
   }
   
   /**
      sets the pHolderage int from the class
      @param the policy holder's age pHolderage as a int
   */
   public void setPHolderAge(int age){
      pHolderAge = age;
   }
   
   /**
      sets the pHolderSmokeStatus String from the class
      @param the policy holder's smoke status pHolderSmokeStatus as a String
   */
   public void setPHolderSmokeStatus(String smoker){
      smoker = smoker.toLowerCase();
      pHolderSmokeStatus = smoker;
   }
   
   /**
      sets the pHolderHeight double from the class
      @param the policy holder's height pHolderHeight as a double
   */
   public void setPHolderHeight(double height){
      pHolderHeight = height;
   }

   /**
      sets the pHolderWeight double from the class
      @param the policy holder's weight pHolderWeight as a double
   */
   public void setPHolderWeight(double weight){
      pHolderWeight = weight;
   }
   
   //Getters

   /**
      accesses the pHolderFName String from the class
      @return the policy holder's last name pHolderFName as a String 
   */
   public String getPHolderFName(){
      return pHolderFName;
   }

   /**
      accesses the pHolderLName String from the class
      @return the policy holder's last name pHolderLName as a String 
   */
   public String getPHolderLName(){
      return pHolderLName;
   }

   /**
      accesses the pHolderAge int from the class
      @return the policy holder's age pHolderage as a int 
   */
   public int getPHolderAge(){
      return pHolderAge;
   }

   /**
      accesses the pHolderSmokeStatus String from the class
      @return the policy holder's smoke status pHolderSmokeStatus as a String 
   */
   public String getPHolderSmokeStatus(){
      return pHolderSmokeStatus;
   }

   /**
      accesses the pHolderWeight double from the class
      @return the policy holder's weight pHolderHeight as a double 
   */
   public double getPHolderHeight(){
      return pHolderHeight;
   }

   /**
      accesses the pHolderWeight double from the class
      @return the policy holder's weight pHolderWeight as a double 
   */
   public double getPHolderWeight(){
      return pHolderWeight;
   }
   
   //calculations

   /**
      the getBMI method calculates the BMI of the user, obtains height and weight from getPHolderHeight and getPHolderWeight
      @return the calculated BMI (weight*703)/(height*height) as a double
   */
   public double getBMI(){
      double BMI;
      double height = getPHolderHeight();
      double weight = getPHolderWeight();
   
      BMI = (weight * 703)/(height*height);
      return BMI;
   }

   /**
      the calcPrice method calculates the final price of the policy for the user by comparing age, smoke status, and BMI
         in relation to a set of fees
      @return the double finalFee
   */
   public double calcPrice(){
      double finalFee;
      final double BASE_FEE = 600;
      final int AGE_CUTOFF = 50;
      final double AGE_FEE = 75;
      final double SMOKER_FEE = 100;
      double BMIFee;
      double BMI = getBMI();
      final double BMI_CUTOFF = 35;
      int age = getPHolderAge();
      String smokeStatus = getPHolderSmokeStatus();
      final String SMOKER = "smoker";
      
      finalFee = BASE_FEE;
      if (age > AGE_CUTOFF){
         finalFee += AGE_FEE;
      }
      if (smokeStatus == SMOKER){
         finalFee += SMOKER_FEE;
      }
      if (BMI > BMI_CUTOFF){
         BMIFee = (BMI - BMI_CUTOFF)*20;
         finalFee += BMIFee;
      }
      return finalFee;
   }
   
   /**
      Reads a text file and adds its contents to the class's objects
      @param a Scanner object reading a file
   */

   public void readFile(Scanner inputFile) throws IOException{
      
      setPolicyNum(inputFile.nextInt());
      inputFile.nextLine();
      setProviderName(inputFile.nextLine());
      setPHolderFName(inputFile.nextLine());
      setPHolderLName(inputFile.nextLine());
      setPHolderAge(inputFile.nextInt());
      inputFile.nextLine();
      setPHolderSmokeStatus(inputFile.nextLine());
      setPHolderHeight(inputFile.nextDouble());
      setPHolderWeight(inputFile.nextDouble());
   
   }
}
