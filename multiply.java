import java.util.*;
public class multiply {
    public static void main(String[]args)
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter First Number");
        float a = sc.nextInt();
        System.out.println("Enter Second Number");
        float b = sc.nextInt();
        double c= a*b;
        System.out.print("The Multiplication of Two Number is:"+c);
    }
}
