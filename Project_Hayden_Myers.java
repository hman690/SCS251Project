// CSC-251 Project 1
// by Hayden Myers
// Date 3/26/2026

import java.util.Scanner;

public class Project_Hayden_Myers{
   
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      int num;
      String proName;
      String fName;
      String lName;
      int age;
      String smokeStatus;
      double height;
      double weight;
      
      num = getPolicyNumber();
      proName = getProviderName();
      fName = getPHolderFName();
      lName = getPHolderLName();
      age = getPHolderAge();
      smokeStatus = getPHolderSmokeStatus();
      height = getPHolderHeight();
      weight = getPHolderWeight();
      
      Policy policyClass = new Policy(num, proName, fName, lName, age, smokeStatus, height, weight);
      
      displayInformation(policyClass);
   }
   
   private static int getPolicyNumber(){
      Scanner keyboard = new Scanner(System.in);
      int num;
      
      System.out.print("Please enter the Policy Number: ");
      num = keyboard.nextInt();
      return num;
   }
   
   private static String getProviderName(){
      Scanner keyboard = new Scanner(System.in);
      String name;
      
      System.out.print("Please enter the Provider Name: ");
      name = keyboard.nextLine();
      return name;
   }
   
   private static String getPHolderFName(){
      Scanner keyboard = new Scanner(System.in);
      String fName;
      
      System.out.print("Please enter the Policyholder's First Name: ");
      fName = keyboard.nextLine();
      return fName;
   }
   
    private static String getPHolderLName(){
      Scanner keyboard = new Scanner(System.in);
      String lName;
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      lName = keyboard.nextLine();
      return lName;
   }
   
   private static int getPHolderAge(){
      Scanner keyboard = new Scanner(System.in);
      int age;
      
      System.out.print("Please enter the Policyholder's Age: ");
      age = keyboard.nextInt();
      return age;
   }
   
   private static String getPHolderSmokeStatus(){
      Scanner keyboard = new Scanner(System.in);
      String status;
      final String SMOKER = "smoker";
      final String NON_SMOKER = "non-smoker";
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      status = keyboard.nextLine();
      status = status.toLowerCase();
      while (!status.equals(SMOKER) && !status.equals(NON_SMOKER)){
         System.out.print("Invalid Entry. Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
         status = keyboard.nextLine();
         status = status.toLowerCase();
      }
      return status;
   }
   
   private static double getPHolderHeight(){
      Scanner keyboard = new Scanner(System.in);
      double height;
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      height = keyboard.nextDouble();
      return height;
   }
   
   private static double getPHolderWeight(){
      Scanner keyboard = new Scanner(System.in);
      double weight;
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      weight = keyboard.nextDouble();
      return weight;
   }
   
   private static void displayInformation(Policy pClass){
      System.out.println("Policy Number: " + pClass.getPolicyNum());
      System.out.println("Provider Name: " + pClass.getProviderName());
      System.out.println("Policyholder's First Name: " + pClass.getPHolderFName());
      System.out.println("Policyholder's Last Name: " + pClass.getPHolderLName());
      System.out.println("Policyholder's Age: " + pClass.getPHolderAge());
      System.out.println("Policyholder's Smoking Status: " + pClass.getPHolderSmokeStatus());
      System.out.println("Policyholder's Height: " + pClass.getPHolderHeight() + " inches");
      System.out.println("Policyholder's Weight: " + pClass.getPHolderWeight() + " pounds");
      System.out.printf("Policyholder's BMI: %,.2f%n", pClass.getBMI());
      System.out.printf("Policy Price: $%,.2f%n", pClass.calcPrice());
   }
}
