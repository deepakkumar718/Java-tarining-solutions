package selfpractice;
import java.util.Scanner;

public class EmployInformation {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employe Id:");
        int eid=sc.nextInt();
        System.out.println("Enter Employe Name:");
        String ename=sc.next();
        System.out.println("Enter Employe Salary:");
        float esalary=sc.nextFloat();
        System.out.println("Enter Employe Address:");
        String address=sc.next();
        System.out.println("Enter Employe Contact:");
        long econtact=sc.nextLong();
        System.out.println("Enter Employe Gender:");
        String gender=sc.next();
        System.out.println(eid +" "+ename +" "+esalary +" "+address + " "+ econtact + " "+gender +" ");

    }
}
