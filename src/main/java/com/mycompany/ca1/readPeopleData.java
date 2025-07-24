/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ca1;

/**
 *
 * @author angirmaa
 */

import java.io.File;
import java.util.*;

public class readPeopleData {
    
public static void main(String[] args) throws Exception {
        //parsing and reading the CSV file data into the object array
        File directory = new File("./");
        
        String name = directory.getAbsolutePath() + "//people.csv";
        MyArrayList<People> people = new MyArrayList<>();
        MyArrayList<People> people1 = new MyArrayList<>();
        MyArrayList<People> people2 = new MyArrayList<>();
        MyArrayList<People> people3 = new MyArrayList<>();
        MyArrayList<People> people4 = new MyArrayList<>();
        MyArrayList<People> people5 = new MyArrayList<>();
        
        try (Scanner scanner = new Scanner(new File(name))) {
            // this will just print the header in CSV file
            scanner.nextLine();
            int i = 0;
            String sGetData;
            int peopleLimit = 0; 
            while (scanner.hasNextLine() && peopleLimit <= 10) {
                sGetData = scanner.nextLine();
                String[] data = sGetData.split(",");
                People person = new People(Integer.parseInt(data[0]), data[1], data[2], data[3], Integer.parseInt(data[4]), Long.parseLong(data[5]));
                people.add(person);
                people1.add(person);
                people2.add(person);
                people3.add(person);
                peopleLimit++;
            }
            
            //closes the scanner
        }
        
        System.out.println("QUESTION 1 BUBBLE SORT");
        
        System.out.println("Before BUBBLE sort");
        
        System.out.println(people.get(0));
        System.out.println(people.get(1));
        System.out.println(people.get(2));
        System.out.println(people.get(3));
        
        // we can compare objects based on their ID due to overridden CompareTo method in the class below
        System.out.println(people.get(0) == people.get(0));
        System.out.println(people.get(0) == people.get(1));
        
       
        people.bubbleSort();
        System.out.println("After BUBBLE sort");
        System.out.println(people.get(0));
        System.out.println(people.get(1));
        System.out.println(people.get(2));
        System.out.println(people.get(3));
        
       
        System.out.println(people.get(0) == people.get(0));
        System.out.println(people.get(0) == people.get(1));
        
        
        Long startTime = System.currentTimeMillis();
        people.bubbleSort();
        Long stopTime = System.currentTimeMillis();
        System.out.println("BUBBLE SORT took:" + (stopTime - startTime)+ "\tms");
        
       
        System.out.println("Before SIMPLE BUBBLE sort");
        
        System.out.println(people1.get(0));
        System.out.println(people1.get(1));
        System.out.println(people1.get(2));
        System.out.println(people1.get(3));
        
        
        // we can compare objects based on their ID due to overridden CompareTo method in the class below
        System.out.println(people1.get(0) == people1.get(0));
        System.out.println(people1.get(0) == people1.get(1));
        
        
        System.out.println("After SIMPLE BUBBLE sort ");
        people1.simpleBubbleSort();
        System.out.println(people1.get(0));
        System.out.println(people1.get(1));
        System.out.println(people1.get(2));
        System.out.println(people1.get(3));
        
        
       
        System.out.println(people1.get(0) == people1.get(0));
        System.out.println(people1.get(0) == people1.get(1));
        
        startTime = System.currentTimeMillis();
        people1.simpleBubbleSort();
        stopTime = System.currentTimeMillis();
        System.out.println("SIMPLE BUBBLE SORT took:" + (stopTime - startTime)+ "\tms");
        
        System.out.println("*****************************************************************************************************************");
            
        System.out.println("QUESTION 2 COMPLEXITY OF BUBBLE SORT");
        
        
        startTime = System.currentTimeMillis();
        people2.bubbleSort();
        stopTime = System.currentTimeMillis();
        System.out.println("BUBBLE SORT took for 10 list of people information:" + (stopTime - startTime) + "\tms");
        
        startTime = System.currentTimeMillis();
        people2.bubbleSort();
        stopTime = System.currentTimeMillis();
        System.out.println("BUBBLE SORT took for 100 list of people information:" + (stopTime - startTime) + "\tms");
        
        startTime = System.currentTimeMillis();
        people2.bubbleSort();
        stopTime = System.currentTimeMillis();
        System.out.println("BUBBLE SORT took for 1000 list of people information:" + (stopTime - startTime) + "\tms");
        
        startTime = System.currentTimeMillis();
        people2.bubbleSort();
        stopTime = System.currentTimeMillis();
        System.out.println("BUBBLE SORT took for 5000 list of people information:" + (stopTime - startTime) + "\tms");
        
        startTime = System.currentTimeMillis();
        people2.bubbleSort();
        stopTime = System.currentTimeMillis();
        System.out.println("BUBBLE SORT took for 10000 list of people information:" + (stopTime - startTime) + "\tms");
        
        
        System.out.println("*****************************************************************************************************************");
        
        System.out.println("QUESTION 3 QUICK SORT");
        
            System.out.println("Before QUICK sort");
        
        System.out.println(people3.get(0));
        System.out.println(people3.get(1));
        System.out.println(people3.get(2));
        System.out.println(people3.get(3));
        
        
        // we can compare objects based on their ID due to overridden CompareTo method in the class below
        System.out.println(people3.get(0) == people3.get(0));
        System.out.println(people3.get(0) == people3.get(1));
        
        
        System.out.println("After QUICK sort ");
        people3.quickSort(0, people3.size() - 1);
        System.out.println(people3.get(0));
        System.out.println(people3.get(1));
        System.out.println(people3.get(2));
        System.out.println(people3.get(3));
        
        
       
        System.out.println(people3.get(0) == people3.get(0));
        System.out.println(people3.get(0) == people3.get(1));
        
        startTime = System.currentTimeMillis();
        people3.quickSort(0, people3.size() - 1);
        stopTime = System.currentTimeMillis();
        System.out.println("QUICK SORT took:" + (stopTime - startTime)+ "\tms");
        
        
       
        System.out.println("*****************************************************************************************************************");
        
        System.out.println("QUESTION 4 BINARY SEARCH");
        
      
        long lSearchFor = 14484382L; 
        
        
        System.out.println("Searching for: " + lSearchFor+ "\tusing non recursive ");
        
        int iIndex1 = people.binarySearch_nonRecursive(lSearchFor, 0, people.size()-1);
        
        if (iIndex1 == -1){
            System.out.println("The key:" + lSearchFor + "\twas not found");
        
        }else{
            System.out.println("The key: " + lSearchFor + "\twas found at index:" + iIndex1);
        }
        
        
        
        
        System.out.println("Searching for" + lSearchFor+ "\tusing recursive ");
        
       int iIndex2 = people.binarySearch_recursive(lSearchFor, 0, people.size()-1);
       if (iIndex1 == -1){
            System.out.println("The key:" + lSearchFor + "\twas not found");
        
        }else{
            System.out.println("The key: " + lSearchFor + "\twas found at index:" + iIndex1);
        }
  
    }

}

class People implements Comparable<Object> {
    private int iId;
    private String sName;
    private String sSurname;
    private String sJob;
    private int iAge;
    private long lCredit;

    // constructor
    public People(int iInId, String sInName, String sInSurname, String sInJob, int iInAge, long lInCredit) {
        this.iId = iInId;
        this.sName = sInName;
        this.sSurname = sInSurname;
        this.sJob = sInJob;
        this.iAge = iInAge;
        this.lCredit = lInCredit;
    }

    // the objects can be compared when sorting/searching
    
    
    @Override
    public int compareTo(Object obj) {

       
        People myPeople = (People) obj;
        return Long.compare(lCredit, myPeople.getlCredit());
    }

    @Override
    public String toString() {
        return "Person [ID= " + iId + ", Name= " + sName + ", Surname= "
                + sSurname + ", Job= " + sJob + ", Age= "
                + iAge + ", Credit= " + lCredit + "]";
    }

    // getters and setters

    public int getiId() {
        return iId;
    }

    public void setiId(int iId) {
        this.iId = iId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsSurname() {
        return sSurname;
    }

    public void setsSurname(String sSurname) {
        this.sSurname = sSurname;
    }

    public String getsJob() {
        return sJob;
    }

    public void setsJob(String sJob) {
        this.sJob = sJob;
    }

    public int getiAge() {
        return iAge;
    }

    public void setiAge(int iAge) {
        this.iAge = iAge;
    }

    public long getlCredit() {
        return lCredit;
    }

    public void setlCredit(long lCredit) {
        this.lCredit = lCredit;
    }

}

