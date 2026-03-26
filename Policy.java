// CSC-251 Project 1, insurance Policy Class to be used in project 1
// by Hayden Myers
// Date 3/26/2026

public class Policy{
   
   private int policyNum;
   private String providerName;
   private String pHolderFName;
   private String pHolderLName;
   private int pHolderAge;
   private String pHolderSmokeStatus; //smoker or non-smoker
   private double pHolderHeight; //in inches
   private double pHolderWeight; //in pounds
   
   public Policy(){ //initializes class with error placeholder values
      policyNum = -1;
      providerName = "ERROR";
      pHolderFName = "ERROR";
      pHolderLName = "ERROR";
      pHolderAge = -1;
      pHolderSmokeStatus = "ERROR";
      pHolderHeight = -1;
      pHolderWeight = -1;
   }
   
   public Policy(int num, String proName, String fName, String lName, int age, String smokeStatus, double height, double weight){ //initializes class with intentional values
      policyNum = num;
      providerName = proName;
      pHolderFName = fName;
      pHolderLName = lName;
      pHolderAge = age;
      pHolderSmokeStatus = smokeStatus;
      pHolderHeight = height;
      pHolderWeight = weight;
   }
   
   //setters
   public void setPolicyNum(int pNum){
      policyNum = pNum;
   }
   
   public void setProviderName(String pName){
      providerName = pName;
   }
   
   public void setPHolderFName(String pHolFName){
      pHolderFName = pHolFName;
   }
   
   public void setPHolderLName(String pHolLName){
      pHolderLName = pHolLName;
   }
   
   public void setPHolderAge(int age){
      pHolderAge = age;
   }
   
   public void setPHolderSmokeStatus(String smoker){
      smoker = smoker.toLowerCase();
      pHolderSmokeStatus = smoker;
   }
   
   public void setPHolderHeight(double height){
      pHolderHeight = height;
   }
   
   public void setPHolderWeight(double weight){
      pHolderWeight = weight;
   }

   //Getters
   public int getPolicyNum(){
      return policyNum;
   }
   
   public String getProviderName(){
      return providerName;
   }
   
   public String getPHolderFName(){
      return pHolderFName;
   }
   
   public String getPHolderLName(){
      return pHolderLName;
   }
   
   public int getPHolderAge(){
      return pHolderAge;
   }
   
   public String getPHolderSmokeStatus(){
      return pHolderSmokeStatus;
   }
   
   public double getPHolderHeight(){
      return pHolderHeight;
   }
   
   public double getPHolderWeight(){
      return pHolderWeight;
   }
   
   //calculations
   
   public double getBMI(){
      double BMI;
      double height = getPHolderHeight();
      double weight = getPHolderWeight();
   
      BMI = (height * 703)/(height*height);
      return BMI;
   }
   
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
} 