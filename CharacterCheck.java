import java.util.Scanner;
public class CharacterCheck {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character :");
        int ch = sc.next().charAt(0);

        if (ch >='a' && ch<='z' || ch >= 'A' && ch <= 'Z' ) 
        {
            System.out.println("is the Alphabet");    
        }

        else if (ch >='0' && ch <='9') 
        {
            System.out.println("is the number");    
        }

        else
        {
            System.out.println("entered number is the special character ");
        }
        sc.close();
    }    
}
