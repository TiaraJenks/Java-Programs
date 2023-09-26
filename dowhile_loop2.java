import java.util.Scanner;
public class dowhile_loop2 {
    public static void main(String[] args) {

//Declaration
int ID;
int Flag = 999;
double score1;
double score2;
double score3;
double Average = 0;
String first_name, last_name;
char MI;
//Instance
Scanner test = new Scanner(System.in);

//Input
do{
System.out.println("What is your First Name? ");
first_name = test.next();

System.out.println("What is your Middle Initial? ");
MI = test.next().charAt(0);

System.out.println("What is your Last Name? ");
last_name = test.next();

System.out.println("What is your ID number? ");
ID = test.nextInt();

System.out.println("What is your first test score? ");
score1 = test.nextDouble();

while(score1 < 0 || score1 > 100){
    System.out.println("Please reenter your first test score within the range of 0 to 100. ");
    score1 = test.nextDouble();
}


System.out.println("What is your second test score? ");
score2 = test.nextDouble();

while(score2 < 0 || score2 > 100){
    System.out.println("Please reenter your second test score within the range of 0 to 100. ");
    score2 = test.nextDouble();
}

System.out.println("What is your third test score? ");
score3 = test.nextDouble();

while(score3 < 0 || score3 > 100){
    System.out.println("Please reenter your third test score within the range of 0 to 100. ");
    score3 = test.nextDouble();
}


//Calculations
Average = (score1+score2+score3)/3;

//Output
System.out.println("\nFirst Name: " + first_name);
System.out.println("Middle Initial: " + MI);
System.out.println("\nLast name: " + last_name);
System.out.println("ID Number: " + ID);
System.out.println("First Test Score: " + score1);
System.out.println("Second Test Score: " + score2);
System.out.println("Third Test Score: " +score3);
System.out.printf("\nAverage: %.2f ",Average);

System.out.println("\nWould you like to go again? Enter 999 to continue or enter any other key to quit. ");
Flag = test.nextInt();
    }//end of do loop
while(Flag == 999);
}// end of main method
}//end of class