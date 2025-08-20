import java.util.Scanner;
public class Operators {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first value :");
        int n1 = sc.nextInt();

        System.out.println("Enter the second value :");
        int n2 = sc.nextInt();

       
        System.out.println("Enter the operation you want to perform : 1.+  2.- 3.* 4./ ");
        char op = sc.next().charAt(0);
        if (op=='+') 
        {
            System.out.println("you enter '+' result is : " + (n1+n2));
        }

        else if (op=='-') 
        {
            System.out.println("you enter '-' result is : " + (n1-n2));
        }

        else if (op=='*') 
        {
            System.out.println("you enter '*' result is : " + (n1*n2));
        }

        else if (op=='/') 
        {
            if (n2 !=0) 
            {
                System.out.println("you enter '/' result is : " + (n1/n2) );
            }
            else
            {
                System.out.println("division by 0 is not allowed");
            }
        }
        
        else
        {
            System.out.println("Invalid operator enter (+,-,*,/)");
        }
        sc.close();
    }
}
