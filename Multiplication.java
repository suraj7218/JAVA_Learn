import java.util.Scanner;

class Multiplication
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number : ");
		int num = sc.nextInt();

		System.out.print("the multiplication of the " + num+ "is");
		for(int i=1; i<=10;i++)
		{
			System.out.println( num +"*"+i +"="+(num * i));
		}
		sc.close();
	}
}
	