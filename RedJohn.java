package CodingQuestions;
import java.util.Scanner;

public class RedJohn {

	// Passed for all test cases in hackker rank
		public static void main(String[] args)
		
	{
			Scanner input= new Scanner(System.in);
			int N,T,i;
			long result,prime;
			T=input.nextInt();
			for(i=0;i<T;i++)
			{
				N= input.nextInt();
				long A[]= new long[N+1];
				if(N>=4)
				{
				A[0]=1L;
				A[1]=1L;
				A[2]=1L;
				A[3]=1L;
				result= fun(N,A);
				}
				else 
					result=1;
				prime= findPrime(result);
				//System.out.println(result);
				System.out.println(prime);
				
			}
			
		

	}

		private static long findPrime(long result)
		{
			long i,count=0L;
			for(i=2;i<=result;i++)
			{
				if(isPrime(i))
				{
					count= count+1;
				//System.out.println(i+ "is a prime number");
				}
			}
			return count;
		}

		private static boolean isPrime(long result) {
			int i,x;
			x= (int) Math.sqrt((double)result);
			//System.out.println(x+ "is the square root");
			for(i=2;i<=x;i++)
			{
				//System.out.println("i= " +i+ " result= "+ result+ " x= "+x);
				if(result%i==0)
				{
					return false;
				}
			}
			return true;
		}

		private static long fun(int N, long[] A) 
		{
			if(N==0||N==1||N==2||N==3)
				return 1;
			if(A[N]!=0)
				return A[N];
			long x= fun(N-1,A)+fun(N-4,A);
			A[N]=x;
			return x;
		}

}
