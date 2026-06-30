package week4.Day27;
import java.util.Scanner;
class Student{
    double math,phy,chem,comp;
    String name;
    int rollNo;
    double totalMarks,percen;

    void input(Scanner in){
        System.out.println("Enter your name");
        name=in.nextLine();
        System.out.println("Enter your roll number");
        rollNo=in.nextInt();
        System.out.println("Enter your Mathematics Marks");
        math=in.nextInt();
        System.out.println("Enter your Physics Marks");
        phy=in.nextInt();
        System.out.println("Enter your Chemistry Marks");
        chem=in.nextInt();
        System.out.println("Enter your Computer Marks");
        comp=in.nextInt();
        in.nextLine();
    }
    void calMarks(){
        totalMarks=math+phy+chem+comp;
        percen=totalMarks/4;
    }

    void display(){
        System.out.println("------MARKSHEET-------");
        System.out.println("Name: "+name+"\t\t\t Roll number: "+rollNo);
        System.out.println("Mathematics Marks: "+math);
        System.out.println(" Physics Marks: "+phy);
        System.out.println("Chemistry Marks: "+chem);
        System.out.println(" Computer Marks: "+comp);
        System.out.println("Total Marks: "+totalMarks+"/400");
        System.out.println("Percentage: "+percen);
    }
}
public class q4_marksheetMana{
    public static void main(String[] args) {
        
        try(Scanner in=new Scanner(System.in)){
        System.out.println("Enter the number of student: ");
        int n=in.nextInt();
        in.nextLine();

        Student s[]=new Student[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter Details of Student " + (i + 1));
            s[i] = new Student();
            s[i].input(in);
            s[i].calMarks();
        }

        System.out.println("\n----- Marksheet -----");
        for (int i = 0; i < n; i++) {
            s[i].display();
        }

        }
    }
}