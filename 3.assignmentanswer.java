import java.util.Scanner;
public class abcd  {

    public static void main(String args[])
    {
	 Scanner in = new Scanner(System.in);
     System.out.print("Input a number: ");
     int n = in.nextInt();
     int k =23;
     if(n>=10 && n<=150 && n%k==0)
     System.out.println("It is a divisible by 23");    
     if(n%k!=0 && n>=10 && n<=150)
     System.out.println("not divisible by 23");
     if(n<=10 || n>=150)
     System.out.println("input number must>10 and <150");
     }  
}
