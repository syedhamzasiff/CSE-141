package com.company;
import java.util.*;
public class Headtail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter ur string");
        int n = 0;
        boolean correct = true;
        do {
            try {
                n = input.nextInt();
                correct = false;
            } catch (InputMismatchException exception){
                System.out.println("incorrect input try again:");
                input.nextLine();
            }
        } while (correct);
        String matrix[][] = new String[3][3];
        System.out.println("your matrix is :");
        matrix = matrix(convert(n));
        print(matrix);
    }
    public static String convert (int n) {
        String binary = "";
        int y;
        String temp = "";
        do {
            y = n%2;
            n = n/2;
            temp += y;
        } while (n>=1);
        for (int i = temp.length()-1; i >= 0; i--) {
            binary += temp.charAt(i);
        }
        for (int i = 0; i < 9; i++) {
            if (binary.length() != 9) {
                binary = 0 + binary;
            }
        }
        return binary;
    }
    public static String[][] matrix (String binary) {
        String[][] mate = new String [3][3];
        int a = 0;
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (binary.charAt(a) == '0') {
                    mate[r][c] = "H";
                } else if (binary.charAt(a) == '1')
                mate[r][c] = "T";
                a++;
            }
        }
        return mate;
    }
    public static void print(String[][] mate) {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(mate[r][c] + " ");
            }
            System.out.println();
        }
    }
}