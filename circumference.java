//Tiara Jenkins
//CSC-117_01
//Professor Aljamal
//Due Date: February 24, 2022
/*Assignment: Write an if else if statement to choose between 3 options and 
find the circumference of a rectangle, square, and triangle*/

import java.util.Scanner;
public class circumference 
{
public static void main(String[]args) 
{

//Rectangle
double L, W, Rect;

//Triangle
double s1, s2, s3, Tri;

//Square
double side, Squa;
//Choice
int choice;

// Scanner
Scanner circ = new Scanner(System.in);

//Choices
System.out.printf("Pick from the following: \n1 for Rectangle \n2 for Triangle \n3 for Square\n");
System.out.printf("Enter your choice: ");
choice = circ.nextInt();

//If else if statements
if(choice == 1)
  {
    System.out.printf("What is the Length? ");
    L = circ.nextDouble();
    System.out.printf("What is the Width? ");
    W = circ.nextDouble();
    
    Rect = (2*L) + (2*W);
    
    System.out.printf("The circumference of the rectangle is " + Rect + ".");
   
  }

else if (choice == 2)
  {
    System.out.printf("What is the first side? ");
    s1 = circ.nextDouble();
    System.out.printf("What is the second side? ");
    s2 = circ.nextDouble();
    System.out.printf("What is the third side? ");
    s3 = circ.nextDouble();
    
    Tri = s1 + s2 + s3;
    
    System.out.printf("The circumference of the triangle is = " + Tri + ".");
 
  }
  
 else if (choice == 3)
  {
      System.out.println("What is the side? ");
      side = circ.nextDouble();
      
      Squa = 4 * side;
      
      System.out.printf("The circumference of the square is = " + Squa +".");
  }
  
 else 
  {
      System.out.printf("Wrong Input. Try again.");
  }
    }
}