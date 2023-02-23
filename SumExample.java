package selfpractice;

import java.util.Scanner;

public class SumExample {
    public static void main(String[]args){
        int a,b,sum,sub,mul,div,rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a=sc.nextInt();
        System.out.println("Enter the second number:");
        b=sc.nextInt();
        sum=a+b;
        System.out.println("Sum of two number:"+sum);
        sub=a-b;
        System.out.println("Sub. of two number:"+sub);
        mul=a*b;
        System.out.println("Div of two number:"+mul);
        div=a%b;
        System.out.println("Div of two number:"+div);
        rem=a/b;
        System.out.println("Rem. of two number:"+rem);
    }

}

