package selfpractice;

import java.util.Scanner;

public class AverageOfNumber {
    public static void main(String[]args){
        int a,b,c,avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();
        avg=a+b+c/2;
        System.out.println("The average number is: "+avg);
    }
}
