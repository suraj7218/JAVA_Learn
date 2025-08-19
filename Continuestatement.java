import java.util.Scanner;
public class Continuestatement {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to skip :");
        int num = sc.nextInt();

        for(int i =1;i<=10;i++)
        {
            if (i==num) 
            {
              continue;  
            }
                        System.out.println("the number is :"+i);

        }
        sc.close();
    }
    
}   
