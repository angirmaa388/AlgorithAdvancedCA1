/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ca1;

/**
 *
 * @author angirmaa
 */
public class OnlyDigitException extends Exception{
    protected String message = "It was only digit, Please try again";
   
   public OnlyDigitException (){
       //
    }
   
   public OnlyDigitException (String inMessage){
       super(inMessage);
       message = inMessage;
       //
    }
   
   
   public String getOnlyDigitException(){
       return message; 
    }
}
