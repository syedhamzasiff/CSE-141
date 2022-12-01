
package footballscoresstring;

import java.util.Scanner;

public class FootballScoresString {
    public static void main(String[] args) {
        String final1 = "Barca 1 Sevilla 0, RealMadrid 1 Barca 1, Barca 3 Valencia 1, Villareal 2 Barca 1, Espanyol 2 Barca 4";
        int played = 0; int wins = 0; int draw = 0; int loss = 0;
        int homegames = 0; int points = 0; int awaygames = 0;
        int goals = 0; int conceded = 0;
        String[] arr = final1.split(", ");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Which team's score do you need?");
        String team = input.next();
        
        for (int i = 0; i < arr.length; i++) {
            String[] match = arr[i].split(" ");
            String home = match[0];
            int homesc = Integer.parseInt(match[1]);
            String away = match[2];
            int awaysc = Integer.parseInt(match[3]);
            
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
