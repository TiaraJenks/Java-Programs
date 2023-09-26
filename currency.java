//Tiara Jenkins
//Professor Aljamal
//CSC-117_01
//Due Date: March 6, 2022
/*Assignment: Write a Java program using For Loop and Switch, where the user 
enters a dollar amount and then a menu of 4-5 different currencies to convert to. */

import java.util.Scanner;
public class currency {
    public static void main(String[] args) {
        
//dollar
double dollar;

//pounds
double pounds;

//yen
double yen;

//Swiss Franc
double franc;

//euro
double euro;

//rupee
double rupee;

//Choice character
char choice;

//Scanner
Scanner money = new Scanner(System.in);

//Input
for(int i=0; i<6; i++) /* loop*/
{
System.out.printf("Hello! I will convert a currency in US Dollars into another currency of your choice.\n");

System.out.printf("What is your amount in US Dollars?\n");
dollar = money.nextDouble();

System.out.printf("Pick from the following currencies to convert the US Dollar to:\nP for Pounds\nY for Yen\nF for Franc\nE for Euro\nR for Ruppe\n");

System.out.printf("Enter your choice here: ");
choice = money.next().charAt(0);
choice = Character.toLowerCase(choice);

//Switch
switch (choice)
 {
     case 'p':
         
         pounds = dollar * 0.76;
         
         System.out.printf("The amount in pounds is %.2f \n ", pounds);
         
         break;
         
    case 'y':
        
         yen = dollar * 115.48;
        
         System.out.printf("The amount in pounds is %.2f \n", yen );
         
         break;
         
    case 'f':
        
         franc = dollar * 0.93;
        
         System.out.printf("The amount in pounds is %.2f \n", franc);
         
         break;
         
    case 'e':
        
         euro = dollar * 0.92;
         
         System.out.printf("The amount in pounds is %.2f \n",euro);
         
         break;
    
    case 'r':
        
         rupee = dollar * 76.91;
         
         System.out.printf("The amount in pounds is %.2f \n",rupee);
         
         break;
         
    default:
    
        System.out.printf("Wrong Input. Try again.\n");
 }
    }
}
}