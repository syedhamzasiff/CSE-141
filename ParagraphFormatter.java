package paragraphformatter;
import java.util.*;
public class ParagraphFormatter {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter: ");
        String para = in.nextLine();
        boolean again = false ;
        do {
        System.out.println("Press 1 for Find and Replace");
        System.out.println("Press 2 for Word Counter");
        System.out.println("Press 3 for Sentences");
        System.out.println("Press 4 for Articles (a, an, the) ");
        System.out.println("Press 5 for Spaces");
        int option = in.nextInt();
        
        
            switch(option) {
                case 1 -> { 
                    System.out.println("Press 1 for one by one");
                    System.out.println("Press 2 for replace all");
                    int op = in.nextInt();
                    if(op == 1) {
                        System.out.print("Replace: ");
                        String replace = in.next();
                        System.out.print("with: ");
                        String with = in.next();
                        String newPara = para.replaceFirst(replace, with);
                        System.out.println(newPara);           
                    } else if(op ==2) {
                        System.out.print("Replace: ");
                        String replace = in.next();
                        System.out.print("with: ");
                        String with = in.next();
                        String newPara = para.replaceAll(replace, with);
                        System.out.println(newPara);
                    } else System.out.println("invalid input");
                }
                case 3 -> {
                    String [] paralen = para.split("\\.");
                    System.out.println("number of sentences: " + paralen.length);
                }
                case 2 -> { 
                    String [] wordcount = para.split(" ");
                    System.out.println("number of words: " + wordcount.length);
                }
                case 4 -> {
                    String [] acount = para.split(" a ");
                    String [] ancount = para.split(" an ");
                    String [] thecount = para.split(" the ");
                    System.out.println("Your article count is: ");
                    System.out.println("a " + acount.length );
                    System.out.println("an " + ancount.length );
                    System.out.println("the " + thecount.length );
                }
                case 5 -> {
                    String [] spacecount = para.split(" ");
                    System.out.println("a " + (spacecount.length - 1));
                break;
                }
                 
                        
            }    
            System.out.println("Do you want to do something else?");
            System.out.println("write true and false");
            again = in.nextBoolean(); 
            
        } while(again);     
                
                
                
                
                
                
                
                
        }    
                
    

        
                
    }
    


