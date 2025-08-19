public class Breakstatement {
    public static void main(String args[])
    {
        for(int i=1;i<10;i++)
        {
            if (i==5) 
            {
                System.out.println("Breaking the looop at the  i = "+i);   
                break;
            }
            System.out.println("i = " +i);
        }
        System.out.println("Loop ended");
    }
}
