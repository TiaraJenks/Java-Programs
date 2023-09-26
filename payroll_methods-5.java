// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

public class payroll_methods {
    public static void main(String[] args) {
    
int size = 10;      
String [] f_name = new String [size];
char [] MI = new char [size];
String [] l_name = new String [size];
int [] ID = new int [size];
double [] hours_w = new double [size];
double [] rate = new double [size];
double [] state = new double [size];
double [] fed = new double [size];
double [] gross = new double [size];
double [] net = new double [size];
double avg = 0;
double total = 0; 


Greetings();
input_method(f_name, MI, l_name, ID, hours_w, rate, size);
grosspay_method(gross, hours_w, rate, size);
state_method(gross, state, size);
fed_method(gross, fed, size);
net_method(gross, state, net, fed, size);
total = totalgross_m(gross, size);
avg = Ave_method(total, size);
output_method(f_name, MI, l_name, rate, hours_w, state, fed, gross, net, ID, total, avg, size);
      
}
//**********Greetings Method**************
public static void Greetings()
{
    System.out.printf("Welcome to the Payroll Method! Follow the prompts below.\n");
}

//********Input Method**********
public static void input_method(String [] first, char [] middle, String [] last, int [] id, double [] h_worked, double [] rate, int s)
{
    Scanner KB = new Scanner(System.in);
    for(int i = 0; i < s; i++)
    {
        System.out.printf("First Name: ");
        first[i] = KB.next();
        System.out.printf("Middle Initial: ");
        middle[i] = KB.next().charAt(0);
        System.out.printf("Last Name: ");
        last[i] = KB.next();
        System.out.printf("ID #: ");
        id[i] = KB.nextInt();
        System.out.print("Enter hours worked: ");
        h_worked[i] = KB.nextDouble();
        hourinput_val(h_worked[i]);//call the hours worked val method
        
      
        System.out.printf("Enter Rate per Hour Worked: ");
        rate[i] = KB.nextDouble();
        rateinput_val(rate[i]); //call the rate input val method
       
    }
  
}

//******Input val for hours worked********** 
public static double hourinput_val(double value)
{
    Scanner KBB = new Scanner(System.in);
    while(value < 0 || value > 60)
    {
        System.out.printf("Wrong entry. Please enter between the range of 0 and 60 hours: ");
        value = KBB.nextDouble();
    }
    return value;
}

//*********Input val for rate/hour************
public static double rateinput_val(double value)
{
    Scanner KBA = new Scanner(System.in);
    while(value < 15 || value > 35)
    {
        System.out.printf("Wrong entry. Please enter the rate between the range of 15 and 35: ");
        value = KBA.nextDouble();
    }
    return value;
}

  //**********Gross pay method**************
public static void grosspay_method(double [] grosspay, double [] hours_w, double [] rate_h, int size)
{ 
  for(int i = 0; i < size; i++)
    {
    if (hours_w[i] >= 0 || hours_w[i] <= 40)
    {
        grosspay[i] = hours_w[i] * rate_h[i];
    }
    else
    {
        grosspay[i] = 40 * rate_h[i] + ((hours_w[i] - 40) * rate_h[i] * 1.5);
    }
      }
}
  

//*********State Tax Method*************
public static void state_method(double [] gross, double [] state, int size)
{
  for(int i = 0; i < size; i++)
    {
 state[i] = gross[i] * 0.07;
      }
 
}

//**********Federal tax method*************
public static void fed_method(double [] gross, double [] fed, int size)
{
  for(int i = 0; i < size; i++)
    {
    fed[i] = gross[i] * 0.15;
      }

}

//************Net Method*****************
public static void net_method(double [] gross, double [] state, double [] netpay, double [] fed, int size)
{
    for(int i = 0; i < size; i++)
    {
        netpay[i] = gross[i] - (state[i] + fed[i]);
    }
    
}
//*************Accumulator for Total gross*******
public static double totalgross_m(double [] grosspay, int size)
{
    double total = 0;
    for(int i = 0; i < size; i++)
    {
        total = total + grosspay[i];
    }
    return total;
}

//**************Average Method***************
public static double Ave_method(double total, int size)
{
    return (total/size);
}

//***********Output Method*****************
public static void output_method(String [] first, char [] middle, String [] last, double [] rate, double [] hours_worked, double [] state, double [] fed, double [] gross, double [] net, int [] ID, double total, double avg, int size)
{
    
 System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "Last Name", "First Name", "ID #", "MI", "Rate per Hour", "Hours worked", "State Tax", "Fed Tax", "Gross", "Net");
 
 for(int i = 0; i < size; i++)
 {
     System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15.2f%-15.2f%-5.2f\n",last[i], first[i], ID [i], middle [i], rate [i], hours_worked [i], state [i], fed [i], gross [i], net [i]);
   }
 System.out.printf("Total Gross = $%.2f\n", total);
 System.out.printf("Gross Average = $%.2f\n", avg);
   
}

}




