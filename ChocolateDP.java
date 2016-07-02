package CodingQuestions;
import java.util.Scanner;

public class ChocolateDP {

	
	public static void main(String[] args)
	{
		int  N,T,i,j;
		long count=0L;
		Scanner input= new Scanner(System.in);
		T= input.nextInt();
		for(i=0;i<T;i++)
		{
			N=input.nextInt();
			int A[]= new int[N];
			for(j=0;j<N;j++)
				A[j]=input.nextInt();
			count= chocolate(A,count,N);
			System.out.println(count);
			count=0L;
		}
		

	}

	private static long chocolate(int[] A, long count,int N)
	{
		int min,max,i;
		min= findMin(A,N);
		max= findMax(A,N);
		if(A[max]==A[min])
			return count;
		while(A[max]-A[min]>=5)
		{
			count++;
			for(i=0;i<N;i++)
			{
				if(i!=max)
				A[i]=A[i]+5;
				//System.out.println("A[i]= "+A[i]);
			}
		}
		if(A[max]-A[min]==1)
		{
			count++;
			for(i=0;i<N;i++)
			{
				if(i!=max)
				A[i]=A[i]+1;
				//System.out.println("A[i]= "+A[i]);
			}
			
		}
		else if(A[max]-A[min]==2)
		{
			count++;
			for(i=0;i<N;i++)
			{
				if(i!=max)
				A[i]=A[i]+2;
			//	System.out.println("A[i]= "+A[i]);
			}
			
		}
		count = chocolate(A,count,N);
				return count;
	}

	private static int findMax(int[] A,int N) {
		int i,max=0,j=0;
		for(i=0;i<N;i++)
			if(A[i]>max)
			{
				max=A[i];
				j=i;
			}
		//System.out.println("max= " +max+ "index= "+j);
		return j;
			}

	private static int findMin(int[] A, int N) 
	{
		int i,min= Integer.MAX_VALUE,j=0;
		for(i=0;i<N;i++)
			if(A[i]<min)
			{
				min=A[i];
				j=i;
			}
		//System.out.println("min= " +min+ "index= "+j);
		return j;
	}

}
