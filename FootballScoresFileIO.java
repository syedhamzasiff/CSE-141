
import java.io.*;
import java.util.Scanner;
public class FootballScoresFileIO {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("scores.txt"));
        int played = 0; int wins = 0; int draw = 0; int loss = 0;
        int homegames = 0; int points = 0; int awaygames = 0;
        int goals = 0; int conceded = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your team");
        String team = sc.next();
        
        while (input.hasNext()){
            String home = input.next();
            int homesc = input.nextInt();
            String away = input.next();
            int awaysc = input.nextInt();
            
            if (team.equalsIgnoreCase(home)) {
                goals += homesc;
                conceded += awaysc;
                played++;
                homegames++;
                if (homesc>awaysc) {
                    wins++;
                    points += 3;
                }
                else if(homesc==awaysc){
                    draw++;
                    points++;
                }
                else loss++; 
            }
            else if (team.equalsIgnoreCase(away)) {
                goals += awaysc;
                conceded += homesc;
                played++;
                awaygames++;
                if (homesc<awaysc) {
                    wins++;
                    points += 3;
                }
                else if(homesc==awaysc){
                    draw++;
                    points++;
                }
                else loss++; 
            }
            
        }
        System.out.println("wins: " + wins);
        System.out.println("loss: " + loss);
        System.out.println("draw: " + draw);
        System.out.println("goals: " + goals);
        System.out.println("conceded: " + conceded);
        System.out.println("homegames: " + homegames);
        System.out.println("away games: " + awaygames);
        System.out.println("points: " + points);
    }
    
}
