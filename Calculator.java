import java.util.Scanner;
public class Calculator{
    public static void main(String[]args){
        Scanner at=new Scanner (System.in);
        System.out.println("Enter your choice \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division");
        int a = at.nextInt();
        double x;
        double y;
        if (a==1){
            System.out.println("Enter Your First Number :\n");
            x = at.nextDouble();
            System.out.println("Enter Your Next Number :\n");
            y = at.nextDouble();
            System.out.println("Answer:\n" + (x+y));
        }
        else if (a==2){
            System.out.println("Enter Your First Number :\n");
            x = at.nextDouble();
            System.out.println("Enter Your Next Number :\n");
            y = at.nextDouble();
            System.out.println("Answer:\n" + (x-y));
        }
        else if (a==3){
            System.out.println("Enter Your First Number :\n");
            x = at.nextDouble();
            System.out.println("Enter Your Next Number :\n");
            y = at.nextDouble();
            System.out.println("Answer:\n" + (x*y));
        }
        else if (a==4){
            System.out.println("Enter Your First Number :\n");
            x = at.nextDouble();
            System.out.println("Enter Your Next Number :\n");
            y = at.nextDouble();
            System.out.println("Answer:\n" + (x/y));
        }
        else if (a>4)
        System.out.print("Invalid Input");
    }
}
