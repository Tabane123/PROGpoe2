/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepartone;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class POEpartOne {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
  
 System.out.println("Welcome");
   System.out.println(" ===========================");
   System.out.println("  PLEASE ENTER YOUR DETAILS ");
   System.out.println("  ==========================  ");
                                                    
    String name;
    String Lastname;
    String Username = null;
    String Password = null;
    String CellPhoneNumber =  null;
    
    
        while (true) {
   // rules give to the user to Enter the correct Ditails for Username t
        System.out.println("==Username Rules==");
        System.out.println("Must contain an underscore(_)");
        System.out.println("Must be no more than 5 characters");
        
        System.out.print("Enter Username: ");
        Username = input.nextLine();
       
    if( Username.contains("_") && Username.length() <=5){
        System.out.print("Username Successfully added");
        break;
    }
  
    else {
        System.out.print("Enter the correct uername format");
    }
    }
    
    
  while (true) {
     
       // Rules give to User to Enter the Correct Password Ditails
         System.out.println("\n Password Rules:");  
         System.out.println("Must have a capital Letter");
         System.out.println("must have a sepecial char");
         
         System.out.print("Enter Password: ");
         Password = input.nextLine();
         
         boolean mustHaveUpperCase = Password.matches(".*[A-Z].*");
    boolean mustHaveANumber = Password.matches(".*\\d.*");
    boolean mustHaveSymbol = Password.matches(".*[12#$%6&*()_+=\\-\\[\\]{};':\"\\\\|,.<>/?].*");
       
       
       if(mustHaveUpperCase && mustHaveANumber && mustHaveSymbol)
       if(Password.length() <=8){
           System.out.print("Pasword successfully captured");
           break;
       } 
       else{
            System.out.println(" Pasword unsuccessfully cpatured, Try Again");
       }
          
          System.out.println("Registration Successfull");
  }    
  while (true){
      System.out.println("rulse");
      System.out.println("Must start with the country internation code");
      System.out.println("must be length of 9");
      
      System.out.println("Cell phon numbers:");
      CellPhoneNumber =  input.nextLine();
  
  if (CellPhoneNumber.matches("//+27//"))
  if  (CellPhoneNumber.length() ==9 ){
  System.out.println("numbers successfully added");
  break;
  }
  else {
      System.out.println("numbers Unsuccessfully added,  enter thre correct format");
          }
  }
  
 System.out.print("Enter Name:");
 name = input.nextLine();
 
 System.out.println("Enter lastname: ");
 Lastname = input.nextLine();
 
          //After the use enter the correct ditail coe will welcom the User
   System.out.println("Welcome"  +name   + Lastname);
   System.out.println("--PLEASE ENTER YOUR LOGIN details--");
    
   
   System.out.print("Enter Username: ");
     String   LoginUsername = input.nextLine();
     
       System.out.print("Enter Password: ");
      String LoginPassword = input.nextLine();
            
     if (LoginUsername.equals(Username) && LoginPassword.equals(Password)){
         System .out.println("Login Successful");
     }else{
         System .out.println("Incorrect username or password, Please enter the corret Details ");
     }
          
  }
    }
