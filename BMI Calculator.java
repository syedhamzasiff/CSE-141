
package bmicalculator;
import java.util.*;

public class bmicalculator {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is your age? ");
        int age = sc.nextInt();
        if (age>= 16) {
            
             System.out.println("Enter weight in kilograms: ");
             double weight = sc.nextDouble();
             System.out.println("Enter height in meters: ");
             Double height = sc.nextDouble();
             
             double bmi = (weight) / (height * height);
             
             if (bmi<18.5){
                 System.out.println("Underweight");
             } else if (bmi<=18.5 && bmi<25.0) {
                 System.out.println("Normal");
             } else if (bmi<=25.0 && bmi<30.0) {
                 System.out.println("Overwieght");
             } else System.out.println("Obese");  
             
        } else System.out.println("Your BMI can not be calculated");             
                 
        
    }             
           
               
               
             
             
            
        
        
        
        
       
        
        
                
        
    }
    
}
