/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ca1;

import java.util.ArrayList;

/**
 *
 * @author angirmaa
 */
public class MyArrayList<ElementType> extends ArrayList<ElementType> {
    
    public void bubbleSort() {
        int i, j;
        Comparable elemj, elemjPlus;
        boolean swap;
        for (i = 0; i < size(); i++) {   /*this loop is checking how many times the array list will be checked*/
            for (j = 0; j < size() - 1 - i; j++) { /*this loop for compare first element to next element*/
                elemj = (Comparable) get(j);
                elemjPlus = (Comparable) get(j + 1); /*here comparing the values using comparable*/
                                                     /* I declared those variable previously comparable*/
                if (elemj.compareTo(elemjPlus) > 0) {  
                    
                    swap(j, j + 1);             /*if the value is greater than other it'll swap those*/  
                    swap = true; 
                     if (swap == false)
                break;
                }
            }
           
        }
    }
    
    public void swap(int pos1, int pos2) {

     ElementType elemPos1 = get(pos1); /*here it's storing pos1 and pos2 in elemPos*/
     ElementType elemPos2 = get(pos2); 
     
     remove(pos1);
     add(pos1, elemPos2); /*In this part this changing the posintion*/
     remove(pos2);
     add(pos2, elemPos1);
        
    }

    public void simpleBubbleSort() {
             
    boolean swaps = true;      
    while(swaps == true){ /*here it's using while loop to check the loop around*/ 
        swaps = false;    /*until the there is no swaping it will continue */
        for(int i=0; i < size() - 1; i++){ /*here using for loop it is checking the values*/
            Comparable elemI = (Comparable) get(i);  /*and using comparable method to compare those values */
            Comparable elemIPlus = (Comparable) get(i + 1);
            if(elemI.compareTo(elemIPlus) > 0){
                swap(i, i + 1);   /*here it's using swap method, one I coded previously*/
                swaps = true;
            }
            
        } 
    }
    
    }
    
   
    public int binarySearch_nonRecursive (long lSearchFor, int start, int end){
        
    int middle = -1;    /*here I declaring a middle variable to store the middle of the list*/
    boolean searchFound = false;  /*here we declaring boolean as when the while loop work*/  
                                  /*if it's found the variable it become true so that the while loop will stop*/
    while (start <= end && (searchFound == false)){ 
        
        middle = (start + end) / 2;  /*finding the middle index of the list*/
        
        People person = (People) get(middle);
        long middleValue = person.getlCredit(); /*taking the middle value of the list to compare the searching value*/
        
        if(middleValue == lSearchFor) {
            searchFound = true;  /*if the value is that midlle value, it will true while loop stop and it returns the value of the index*/
        }else if(middleValue < lSearchFor){
            start = middle + 1; /*if the middle value is less than searching value it will compare this until end of the list */
            
        } else{
        end = middle-1;
    }
    
    
    }
    
    if(searchFound == true){ 
        
        return middle; /*if the value found it will return the index else it will return -1 which is not found*/
    } else {   
      
    return -1; 
    }
    
    }
    
    public int binarySearch_recursive (long lSearchFor, int start, int end){
        
        int result;
        int middle = (start + end) / 2; /*finding the middle index*/
        People person = (People) get(middle);
        long middleValue = person.getlCredit(); /*storing the middle value*/
        
        if(middleValue == lSearchFor) {
           result = middle; /*if the searching value is that midlle value, it will return the middle index*/
        }else if(start == end){
           result = -1; /*if there is no that value, it will retuen -1*/
            
        } else{ /*here I used recursive case*/
        if(middleValue > lSearchFor){
            result = binarySearch_recursive (lSearchFor, start, middle - 1);
        }else {
            result = binarySearch_recursive (lSearchFor, middle + 1, end);
        } /*if the middle value is greater than searching value it will check left side of the middle index else it will check right side  of the values*/
    }
        return result; 
    }  
    
    
    
    
     public void quickSort(int startIndex, int endIndex) { /*here I defined start and ending index of the list*/
        int mainIndex;    /*declaring the variable that store main index*/
        if (startIndex < endIndex) { /*if the start of the list less than end of the list*/
            
            mainIndex = division(startIndex, endIndex); /*, we find the main index using division's method that is below*/

            quickSort(startIndex, mainIndex - 1); 

            quickSort(mainIndex + 1, endIndex); /*here quick does the sort for the both side of the main index*/
        } else 
        {
            return; /*here there is only one element it won't execute*/
        }
    }

    public int division(int startIndex, int endIndex) {
        int up, down;
        ElementType main; 

        main = get(startIndex); /*main is the start index*/

        up = startIndex; 
        down = endIndex;   /*defining the up is starting index and down is ending index*/

        while (up < down) { /*as long as up is smaller than down, the while loop will execute*/

            while (up < endIndex && ((Comparable) get(up)).compareTo((Comparable) main) <= 0) {
                up = up + 1;
            } /*it will check if there is any element that is greater than main element using up*/

            while (down > startIndex && (((Comparable) get(down)).compareTo((Comparable) main) > 0)) {
                down = down - 1; /*it will check if there is any element that is less than main element using down*/

            }

            if (up < down) {
                ElementType eUp = get(up);
                
                set(up, get(down));
                set(down, eUp); /*here if the up element is less than down it will swap the elements*/
            }                   /*, storing the up element in eUp variable then it will set up top down*/
        }

        set(startIndex, get(down));
        set(down, main);
        return down; /*When it's finish it will set the main element to the down*/
    }
  
  
}




























