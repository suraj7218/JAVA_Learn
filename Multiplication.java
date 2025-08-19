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

class Switchcase 
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1-7 :");
		int num = sc.nextInt();

		switch (num)
		{
			case 1: 
				System.out.println("Monday");
				break;

			case 2: 
				System.out.println("Tuesday");
				break;

			case 3: 
				System.out.println("Wednesday");
				break;

			case 4: 
				System.out.println("Thursday");
				break;


			case 5: 
				System.out.println("Friday");
				break;


			case 6: 
				System.out.println("Saturday");
				break;


			case 7: 
				System.out.println("Sunday");
				break;


			case 8: 
				System.out.println("Enter the valid number betweeen 1 - 7 ");
				break;

		}
	}
}
	