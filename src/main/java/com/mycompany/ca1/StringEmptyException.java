/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ca1;

/**
 *
 * @author angirmaa
 */
public class StringEmptyException extends Exception{
    protected String message = "It was Empty, Please try again";
   
   public StringEmptyException (){
       //
    }
   
   public StringEmptyException (String inMessage){
       super(inMessage);
       message = inMessage;
       //
    }
   
   
   public String getStringEmptyException(){
       return message; 
    }
    
}
