import java.util.*;
public class Main {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a year: ");
    int year = sc.nextInt();
    System.out.println("Enter the weekday that year starts like[ 0 for sun , 1 for mon, 2 for tue......]");
    int day = sc.nextInt();
    int dayCounter = day;
     int noofdays = 0;
     String  mon= ""; 
    for (int month= 1; month <=12; month++)
    {
              switch (month)
             {
                  case 1: mon = "January";
                             noofdays = 31;
                             break;
                  case 2: mon = "February";
                                     if ( year % 4 == 0 && year % 100 !=0 || year % 400 == 0)
                      {
                             noofdays = 29;
                             break;
                      }
                                     else
                         {  noofdays = 28;
                             break;
                         }
                 case 3: mon = "March";
                             noofdays = 31;
                             break; 
                  case 4: mon = "April";
                             noofdays = 30;
                             break; 
                         case 5: mon = "May";
                             noofdays = 31;
                             break;

                         case 6: mon = "June";
                             noofdays = 30;
                             break;
                          case 7: mon = "July";
                             noofdays = 31;
                             break;
                          case 8: mon = "August";
                             noofdays = 31;
                             break;
                    case 9: mon = "September";
                             noofdays = 30;
                             break; 
                    case 10: mon = "October";
                             noofdays = 31;
                             break; 
                    case 11: mon = "November";
                             noofdays = 30;
                             break; 
                         case 12: mon = "December";
                             noofdays = 31;
                             break;                  
             }

                 System.out.printf("%15s %d  \n", mon , year);
                 System.out.println("______________________________");
                 System.out.printf("%s %s %s %s %s %s %s\n ", "Sun","Mon","Tue", "Wed", "Thu","Fri","Sat");

                 for (int space =1; space<=day; space++) 
                 {
                     System.out.printf("%4s", "    ");
                 }
                 for (int i = 1; i <=noofdays; i++)
                 {
                    dayCounter++;
                    if ( dayCounter% 7==0)
                     System.out.printf("%- 4d\n", i);
                    else
                    System.out.printf("%-4d", i);

                 }
                 day = (day + noofdays)%7;

                   System.out.println();

    }    

}
}
