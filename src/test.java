import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		int a,b,sum;
		System.out.println("Enter Two Numbers:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		sum=a-~b-1;
		System.out.println("Reslt is"+a+" "+b+" is: "+sum);

	}

}
