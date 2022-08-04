import java.util.Scanner;
public class area_circle_triangle_rect{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("What Do You Want ? \n 1. Area Of Circle \n 2. Area Of Triangle \n 3. Area Of Rectangle \n");
        int ww = sc.nextInt();
        double area_circle;
        double area_tri;
        double area_rect;
        if (ww == 1)
        {
      System.out.print("Enter Your Radius");
      double r = sc.nextDouble();
      area_circle = 3.1415926535 * r * r;
      System.out.print(" Your Area Will be : \n" + area_circle);
    }
        else if (ww==2)
        {System.out.print(" Enter Your length");
        double l = sc.nextDouble();
        System.out.print("Enter Your Base");
        double base = sc.nextDouble();
        area_tri = 0.5 * base * l;
        System.out.print("Your Area Will Be :\n" + area_tri);
    }
        else if (ww==3)
        {System.out.print("Enter Your Length");
        double l =sc.nextDouble();
        System.out.print("Enter Your Breadth");
        double b = sc.nextDouble();
        area_rect = l*b;
        System.out.print("Your Area is " + area_rect);
    }
    else
    {
        System.out.print("Invalid");
    }
}
}