
package javaapplication2;
import java.util.*;

public class JavaApplication2 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Single:1");
        System.out.println("Married Filing Jointly or Widower: 2");
        System.out.println("Married Filing seperately: 3");
        System.out.println("Head of Household:4");
        System.out.println("enter your status");
        int status = sc.nextInt();
        System.out.println("What is your income?");
        double income = sc.nextDouble();
        
        switch (status){
            case 1 ->             {
                if (income>0 && income<8350) {
                    System.out.println("Take home income is: " + (income*0.90));
                } else if (income>8351 && income<33950) {
                    System.out.println("Take home income is: " + (income*0.85));
                } else if (income>33951 && income<82250) {
                    System.out.println("Take home income is: " + (income*0.75));
                } else if (income>82251 && income<171550) {
                    System.out.println("Take home income is: " + (income*0.72));
                } else if (income>171551 && income<372950) {
                    System.out.println("Take home income is: " + (income*0.67)); 
                } else if (income>372951) 
                        System.out.println("Take home income is: " + (income*0.65));  
            }
            case 2 ->             {
                if (income>0 && income<16700) {
                    System.out.println("Take home income is: " + (income*0.90));
                } else if (income>16701 && income<67900) {
                    System.out.println("Take home income is: " + (income*0.85));
                } else if (income>67901 && income<137050) {
                    System.out.println("Take home income is: " + (income*0.75));
                } else if (income>137051 && income<208850) {
                    System.out.println("Take home income is: " + (income*0.72));
                } else if (income>208851 && income<372950) {
                    System.out.println("Take home income is: " + (income*0.67)); 
                } else if (income>372951) 
                        System.out.println("Take home income is: " + (income*0.65));  
            }
            case 3 ->             {
                if (income>0 && income<8350) {
                    System.out.println("Take home income is: " + (income*0.90));
                } else if (income>8351 && income<33950) {
                    System.out.println("Take home income is: " + (income*0.85));
                } else if (income>33951 && income<68525) {
                    System.out.println("Take home income is: " + (income*0.75));
                } else if (income>68526 && income<104425) {
                    System.out.println("Take home income is: " + (income*0.72));
                } else if (income>104426 && income<186475) {
                    System.out.println("Take home income is: " + (income*0.67)); 
                } else if (income>186476) 
                        System.out.println("Take home income is: " + (income*0.65));  
            }
            case 4 ->             {
                if (income>0 && income<11950) {
                    System.out.println("Take home income is: " + (income*0.90));
                } else if (income>11951 && income<45500) {
                    System.out.println("Take home income is: " + (income*0.85));
                } else if (income>45501 && income<117450) {
                    System.out.println("Take home income is: " + (income*0.75));
                } else if (income>117451 && income<190200) {
                    System.out.println("Take home income is: " + (income*0.72));
                } else if (income>190201 && income<372950) {
                    System.out.println("Take home income is: " + (income*0.67)); 
                } else if (income>372951) 
                        System.out.println("Take home income is: " + (income*0.65));  
            }     



                    
        }
             
        
    }
    
}
