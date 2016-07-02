package CodingQuestions;
import java.util.Scanner;

public class CoinChangeDP {

	//only some test cases passed in hackerrank, will visit agai, some problem with int, long too
	
	public static void main(String[] args) {
		int i,j;
		int N,M,maxCoin,maxindex;
		long ans;
		Scanner input = new Scanner(System.in);
		N= input.nextInt();
		M=input.nextInt();
		int A[]= new int[M];
		for(i=0;i<M;i++)
			A[i]=input.nextInt();
		long B[]= new long[N+1];
		maxindex=M;
		maxCoin=A[M-1];
		if(N<=0 || M<=0)
			System.out.println("0");
		else
		{
			ans= change(A,B,M,N,maxCoin,maxindex);
			System.out.println(ans);
		}
			
		

	}

	private static long change(int[] a, long[] b, int m, int n, int maxCoin,
			int maxindex) 
	{
		//System.out.println("The function is called and N= "+n+ " and M= "+m);
		boolean flag=false;
		if(n<0 || m<=0)
		{
			//System.out.println("The value of N or M is 0 N= "+n+ " m= "+m);
			return 0;
		}
		if(n==0)
		{
			//System.out.println("N= "+n+" Coins are over");
			return 1;
		}
		if(b[n]!=0 && ((m<maxindex && a[m]>n)||m==maxindex))
		{
			return  b[n];
		}
		if(maxCoin==a[m-1])
			 flag= true;
		while(m>0 && a[m-1]>n)
			m--;
		if(m<=0)
		{
			//System.out.println("The value of N or M is 0 N= "+n+ " m= "+m+ "and we returned 0");
			return  0;
		}
		if(m==1 && a[m-1]==n)
		{
		//	System.out.println("The value of N or M is 0 N= "+n+ " m= "+m+ " and we returned 1");
			return  1;
		}
		long sum;
		sum= (long) change(a,b,m,n-a[m-1],maxCoin,maxindex) + (long) change(a,b,m-1,n,maxCoin,maxindex);
		if(flag)
		{
			b[n]=sum;
			//System.out.println("N= "+n+ " Ans= "+b[n]);

		}
			else if(maxindex>=m)
			{
				if( n< a[m])
				{
					b[n]=sum;	
				//	System.out.println("N= "+n+ " Ans= "+b[n]);
				}	
			}
		//System.out.println("N= "+n+ " M= "+m+ " Ans= "+sum);
		return sum;
	}

}
