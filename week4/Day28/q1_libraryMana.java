package week4.Day28;
import java.util.Scanner;
 class Library{
    String name;
    float bookNo;
    String genre;

    void input(Scanner in){
        System.out.println("Enter book name");
        name=in.nextLine();

        System.out.println("Enter book Number");
        bookNo=in.nextFloat();
        in.nextLine();

        System.out.println("Enter the genre");
        genre=in.nextLine();
    }

    void display(){
        System.out.println("-----Book Details-----");
        System.out.println("Name: "+name);
        System.out.println("Book number: "+bookNo);
        System.out.println("Genre: "+genre);
    }
}
public class q1_libraryMana{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of book");
        int n=in.nextInt();
         in.nextLine();

        Library l[]=new Library[n];

        for(int i=0;i<n;i++){
            l[i]=new Library();
            l[i].input(in);
        }

        for(int i=0;i<n;i++){
            l[i].display();
        }
    }
}