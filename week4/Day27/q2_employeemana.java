package week4.Day27;

import java.util.Scanner;

class Employee{
    int idNo;
    String name;
    String post;

    void input(Scanner in){
        System.out.println("Enter your Office ID number");
        idNo=in.nextInt();
        in.nextLine();
        
        System.out.println("Enter your Name ");
        name=in.nextLine();
        System.out.println("Enter your position");
        post=in.nextLine();
    }
    void display(){
        System.out.println();
        System.out.println(" Emoployee Details ");
        System.out.println("Office ID No.: "+idNo);
        System.out.println("Name: "+name);
        System.out.println("Position: "+post);
    }

}
public class q2_employeemana {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter number of employee");
    int n=in.nextInt();

    Employee e[]=new Employee[n];

    for(int i=0;i<n;i++){
    System.out.println("Enter the Details of Employee "+(i+1));
    e[i]=new Employee();
    e[i].input(in);
    }

    System.out.println("------Employeee Record-------");
    for(int i=0;i<n;i++){
        e[i].display();
    }
}
}
