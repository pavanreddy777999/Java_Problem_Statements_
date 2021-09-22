import java.util.*;

public class Main
{
    public static Integer ps5(int n)
    {
         if (n == 0)
            return 0;
        else
        return ps5 (n/ 10) * 100 + (n % 10) * 10 + n % 10;
        
        //return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        System.out.println(ps5(n));
    }
} 

/* without recursion */
import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        String s=Integer.toString(n);
        int len=s.length();
        if(n<0)
        {
            if(len%2==0)
            len-=1;
        }
        char[] c=s.toCharArray();
        if(len%2==0)
        {
            for(int i=0;i<len;i++)
            {
                System.out.print(c[i]);
                System.out.print(c[i]);
            }
        }
        else 
        {
           System.out.print("-");
            for(int i=1;i<=len;i++)
            {
                System.out.print(c[i]);
                System.out.print(c[i]);
            }
            
        }
        System.out.println();
    }}
