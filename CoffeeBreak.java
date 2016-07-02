package CodingQuestions;
import java.util.Scanner;

public class CoffeeBreak {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int T, N, K,D,M,i,j,x=0,index,sum=0,l;
		int[] A;
		Scanner input= new Scanner(System.in);
		T=input.nextInt();
		for(i=0;i<T;i++)
		{
			N=input.nextInt();
			K=input.nextInt();
			D=input.nextInt();
			M=input.nextInt();
			index= N+1;
			A= new int[N];
			for(j=0;j<N;j++)
				A[j]=input.nextInt();
			int[] B= new int[N];
			for(j=0;j<N;j++)
			{
				for(l=0;l<N;l++)	
				{
					if(j==l)
						index=j;
					else if(index+D>=l&& l>index)
						sum= sum+ M*A[l];
					else
						sum= sum+ A[l];
				}
				B[j]=sum;
				sum=0;
				index= N+1;
			}
			x= getmax(B,N);
			System.out.println(x);
		}
		
	}

	private static int getmax(int[] A,int N)
	{
		int i,max=0;
		max=A[0];
		for(i=0;i<N;i++)
			if(max<A[i])
				max=A[i];
		return max;
			}

}
