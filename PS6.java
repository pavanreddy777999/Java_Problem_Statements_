import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the PH value");
	    int ph=sc.nextInt();
	    if(ph<7)
	    System.out.println("pH value is low, partial water change required");
	    else if(ph>=7 && ph<=8)
	    System.out.println("pH value is fine");
	    else if(ph>8)
	    System.out.println("pH value is high, partial water change required");	
	}
}
