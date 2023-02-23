package selfpractice;

import java.util.Scanner;

public class CalculateSum {
    int calculate(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
if(i%3==0 || i%5==0){
    sum+=i;
}
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        CalculateSum cal=new CalculateSum();
        int sum =cal.calculate(i);
        System.out.println(sum);
    }
}


