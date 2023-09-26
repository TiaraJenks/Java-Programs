// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

public class Operations {
    public static void main(String[] args) 
    {
    Scanner op = new Scanner(System.in);
   int size = 20;
   int [] nums = new int [size];
   int choice, Flag;
   int pos_sum = 0, neg_sum = 0, neg_count, pos_count;
   Greetings();
   Input_Method(nums, size);
   
 do {
     System.out.println("Pick from the menu.\n");
     System.out.println("1. Sum of all positive numbers\n2. Sum of all negative numbers\n3. All positive odd numbers\n4. All negative even numbers\n5. Positive numbers in reverse order\n6. All negative numbers\n7. All numbers\n8. Count of negative numbers\n9. Count of positive numbers\nEnter here: ");
     choice = op.nextInt();
     
     switch(choice)
     {
         case 1:
             pos_sum = sum_pos(nums, size);
             System.out.println("Sum of all positives: ");
             output_method(pos_sum);
             
             break;
             
        case 2:
            neg_sum = sum_neg(nums, size);
            System.out.println("Sum of all negatives: ");
            output_method(neg_sum);
            
            break;
             
        case 3:
            System.out.println("All positive odd numbers\n");
            odd_pos(nums, size);
            
            break;
            
        case 4: 
            System.out.println("All negative even numbers\n");
            even_neg(nums, size);
            
            break;
            
        case 5: 
            System.out.println("Reverse order of positive numbers\n");
            reverse_pos(nums, size);
            
            break;
            
        case 6:
            System.out.println("Negative numbers\n");
            output_neg(nums, size);
            
            break;
            
        case 7:
            System.out.println("All numbers\n");
            output_all(nums, size);
            
            break;
            
        case 8:
            neg_count = count_neg(nums, size);
            System.out.println("Count of all negatives: "+ neg_count);
            
            break;
            
        case 9: 
            pos_count = count_pos(nums, size);
            System.out.println("Count of all positives: "+ pos_count);
            
            break;
         
     } //end of switch
     System.out.println("If you would like to repeat, enter 999. If not,enter any other key.\n");
     Flag = op.nextInt();
 } while(Flag == 999); //end of do-while loop
 
    }//end of main method
    
//Greetings method
public static void Greetings()
{
    System.out.println("Welcome to the Opreations Method menu! Follow the prompts below.\n");
}//end of greetings method

//Input Method
public static void Input_Method(int nums1 [], int size)
{
    Scanner KB = new Scanner(System.in);
    for(int i = 0; i < size; i++)
    {
    System.out.println("Please enter integer number" + (i+1)+ ": ");
     int num = KB.nextInt();
     num = Input_Val(num);
     nums1[i] = num;
    
    }//end of for loop

}//end of Input method

//Input validation
public static int Input_Val(int number)
{
    Scanner KBB = new Scanner(System.in);
    while(number < -100 || number > 100)
    {
        System.out.println("Wrong Input. Please re-enter a number that is within the range given.\n");
        number = KBB.nextInt();
    }// end of while loop
    return number;
}//end of input validation method

// Sum of all positive numbers method
public static int sum_pos(int nums1[], int s)
{
    int total = 0;
    for(int i = 0; i < s;i++)
    {
        if(nums1[i] >= 0)
        {
        total = total + nums1[i];
        }
    }
    return total;
}//end of Sum positive method

//Sum of all negative method
public static int sum_neg(int nums2[], int sq)
{
    int total = 0;
    for(int i = 0; i < sq; i++)
    {
        if(nums2[i] < 0)
        {
            total = total + nums2[i];
        }
    }
    return total;
}//end of sum neg method

//Positive odd nums method
public static void odd_pos(int nums3[], int sw)
{
    for(int i = 0; i < sw; i++)
    {
        if(nums3[i] >= 0 && nums3[i] % 2 == 1)
           System.out.println(nums3[i]);
    }
   
}// end of positive odd method

//Negative even nums method
public static void even_neg(int nums4[], int se)
{
    for(int i = 0; i < se; i++)
    {
        if(nums4[i] < 0 && nums4[i] % 2 == 0)
            System.out.println(nums4[i]);
        
    }
}//end of negative even method

//reverse order method
public static void reverse_pos(int nums5[], int sr)
{
  
    for(int i = sr - 1; i >= 0; i--)
    {
        if(nums5[i] >= 0)
            System.out.println(nums5[i]);
    }
   
}//end of reverse order method

//all negative nums method
public static void output_neg(int nums6[], int st)
{
    for(int i = 0; i < st; i++)
    {
        if(nums6[i] < 0)
            System.out.println(nums6[i]);
    }
    
}//end of all negative nums

//all numbers method
public static void output_all(int nums7[], int sy)
{
    for(int i = 0; i < sy; i++)
    {
            System.out.println(nums7[i]);
    }
   
}//end of all nums method

//count of neg nums method
public static int count_neg(int nums8[], int su)
{
    int countneg = 0;
    for(int i =0 ; i < su; i++)
    {
       if(nums8[i] < 0)
       countneg++;
    }
    return countneg;
}//end of count neg method

//count pos nums method
public static int count_pos(int nums9[], int si)
{
    int countpos = 0;
    for(int i = 0; i < si; i++)
    {
        if(nums9[i] >= 0)
        countpos++;
    }
    return countpos;
}//end of count pos method

//Output Method
public static void output_method(int num)
{
    System.out.println(num);
}//end of output

}