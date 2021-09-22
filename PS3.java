import java.util.*;
public class Main
{
    public static float rectangle(float a,float b)
    {
        return a*b;
    }
    public static float square(float a)
    {
        return a*a;
    }
    public static double circle(double r)
    {
        return (3.16*r*r);
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("1. Square area for the chicken 2. Circular area for ducks 3. Rectangular area for cows");
        int ch;
       ch=sc.nextInt();
        switch(ch)
        {
        case 1: 
             System.out.println("Enter the side");
             float side=sc.nextFloat();
             System.out.println("Area of square fence for chickens is:"+square(side));
             break;
        case 2:
            System.out.println("Enter radius");
            double radius=sc.nextDouble();
            System.out.println("Area of circle fence for ducks is:"+circle(radius));
            break;
        case 3:
            System.out.println("Enter length");
            float length=sc.nextFloat();
            System.out.println("Enter breadth");
            float breadth=sc.nextFloat();
            System.out.println("Area of rectangle fence for cows:"+rectangle(length,breadth));
            break;
    }
    }
}
