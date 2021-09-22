import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    String s=Integer.toString(n);
	    char[] ch=Integer.toString(n).toCharArray();
	    int len=s.length();
	    if(len%2==0)
	    {
	        for(int i=0;i<len;i+=2)
	        {
	           char temp=ch[i];
	           ch[i]=ch[i+1];
	           ch[i+1]=temp;
	        }
	    }
	    else
	    {
	        for(int i=1;i<len;i+=2)
	        {
	           char temp=ch[i];
	           ch[i]=ch[i+1];
	           ch[i+1]=temp;
	        }
	        
	    }
	    System.out.println(ch);
		
	}
}
