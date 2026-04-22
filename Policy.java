// CSC-251 Project 1, insurance Policy Class to be used in project 1
// by Hayden Myers
// Date 3/26/2026

// CSC-251 Project 2, updated Class to be used in project 2
// by Hayden Myers
// Date 4/11/2026

// CSC-251 Project 3, updated Class to be a SuperClass to be used in PolicyHolder SubClass
// by Hayden Myers
// Date 4/22/2026

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Policy{
   
   private int policyNum;
   private String providerName;
   
   public Policy(){ //initializes class with error placeholder values
      policyNum = -1;
      providerName = "ERROR";
   }
   
   public Policy(int num, String proName){ //initializes class with intentional values
      policyNum = num;
      providerName = proName;
   }
   
   //setters

   /**
      sets the policyNum String from the class
      @param the policy number policyNum as a int
   */
   public void setPolicyNum(int pNum){
      policyNum = pNum;
   }

   /**
      sets the providerName String from the class
      @param the provider's name providerName as a String
   */
   public void setProviderName(String pName){
      providerName = pName;
   }


   //Getters

   /**
      accesses the policyNum int from the class
      @return the policy number policyNum as a int 
   */
   public int getPolicyNum(){
      return policyNum;
   }

   /**
      accesses the providerName String from the class
      @return the policy provider name providerName as a String 
   */
   public String getProviderName(){
      return providerName;
   }
   
} 

