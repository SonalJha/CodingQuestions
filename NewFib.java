package CodingQuestions;
import java.util.Scanner;
import java.math.BigInteger;

public class NewFib {

	//Accepted at hacker rank
	public static void main(String[] args) {
		int A,B,N;
		BigInteger output;
		Scanner input= new Scanner(System.in);
		A= input.nextInt();
		B= input.nextInt();
		N= input.nextInt();
		output= fib(A,B,N);
		System.out.println(output);

	}

	private static BigInteger fib(int a, int b, int n)
	{
		BigInteger output;
		if(a==0&&b==0 || n<=0)
		return	BigInteger.valueOf(0);
		if(n==1)
			return BigInteger.valueOf(a);
		if(n==2)
			return BigInteger.valueOf(b);
		BigInteger[] Z= new BigInteger[n];
		Z[0]=BigInteger.valueOf(a);
		Z[1]=BigInteger.valueOf(b);
		output=modfib(n,Z);
		return output;
	}

	private static BigInteger modfib(int n, BigInteger[] z)
	{
		
		if(n==1||n==2)
			return z[n-1];
		BigInteger x,two,one;
		if(z[n-1]!=null)
		{
			return z[n-1];
			}
			
		one= modfib(n-1,z);
		two=modfib(n-2,z);
		x= (one.multiply(one)).add(two);
		z[n-1]=x;
		return x;
	}

}
