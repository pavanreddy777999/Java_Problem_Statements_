import java.util.*;

public class Main
{
   
    public static void main(String[] args) {
        float sal=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of the employee");
        String name=sc.next();
        System.out.println("Enter base pay of the employee");
        float BasePay=sc.nextFloat();
        System.out.println("Enter number of hours worked by the employee");
        int hours=sc.nextInt();
        if(hours>=40&&hours<=60)
        {
            int hrs=hours-40;
         sal=40*BasePay+(hrs*(2*BasePay));
        }
        else if (hours>60)
        {
            sal=40*BasePay+(20*(2*BasePay));
        }
        else if(hours<40)
        {
            sal=hours*BasePay;
        }
        System.out.println("Salary of employee:"+sal+"$");
    }
}
