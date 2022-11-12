import java.util.Scanner;
public class abcd  {

    public static void main(String args[])
    {
	 Scanner in = new Scanner(System.in);
     System.out.print("Input a number: ");
     int n = in.nextInt();
     int sum = 0, r;
	 int temp = n;    
     while(n>0)
	   {    
        r = n % 10;   
        sum = (sum*10)+r;    
        n = n/10;    
       }
      if(temp%2==0 && temp==sum)
        System.out.println("It is a Palindrome number and a even number");    
      if(temp!=sum)    
        System.out.println("Not a palindrome");
     if(temp%2!=0)
        System.out.println("give even number only");
     }  
}
