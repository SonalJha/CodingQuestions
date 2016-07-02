package CodingQuestions;


import java.util.Scanner;

public class StockDP {

	
	public static void main(String[] args)
	{
		int T,N,maxindex,shareBought=0;
			//BigInteger profit= BigInteger.valueOf(0);
		long profit=0L;
		int i,j;
		Scanner input= new Scanner(System.in);
		T= input.nextInt();
		for(j=0;j<T;j++)
		{
			N=input.nextInt();
			long[] A= new long[N];
			for(i=0;i<N;i++)
				A[i]=input.nextLong();
			maxindex= max(A,0,N);
			profit= stock(A,N,0,maxindex,shareBought,profit);
			System.out.println(profit);
			shareBought=0;
			profit=0L;
			//profit= BigInteger.valueOf(0);
		}
	}

	private static long stock(long[] A, int N,int index, int maxindex, int shareBought,
			long profit)
	{
		boolean worstcase=false;
		//check for worst case
		if(index==maxindex)
			worstcase= check(A,index,N);
		if(worstcase)
			return profit;
		int i,j;
		for(i=index;i<N;i++)
		{
			if(i<maxindex)
			{
				shareBought++;
				//profit= profit.subtract(BigInteger.valueOf(A[i]));
				profit= profit-A[i];
			}
			else if(i==maxindex)
			{
				profit= A[i]*shareBought+ profit;
				//profit= profit.add(BigInteger.valueOf(A[i]*shareBought));
				shareBought=0;
			}
			else
			{
				j= max(A,i,N);
				return stock(A,N,i,j,shareBought,profit);
			}
		}
		
		return profit;
	}

	private static boolean check(long[] A, int index, int N)
	{
		// To check if all elements are in descending order
		int i;
		boolean ans=true;
		for(i=index;i<N-1;i++)
			if(A[i]<A[i+1])
				ans= false;
				
		return ans;
	}

	private static int max(long[] a, int j, int n)
	{
		int i,index=j;
        long max=0;
		for(i=j;i<n;i++)
			if(a[i]>max)
			{
				max=a[i];
				index=i;
			}
		return index;
	}

}
