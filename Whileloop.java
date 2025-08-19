import java.util.Scanner;

public class Whileloop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for the countdown..:");
        int coutdown = sc.nextInt();
        while (coutdown>0) {
            System.out.println(coutdown);
            coutdown--;
        }
     
        System.out.println("Hello World......");
         sc.close();
    }
    
}
