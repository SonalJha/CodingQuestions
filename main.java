package CodingQuestions;
import java.util.Scanner;

  class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String t= new String();
		String n= new String();
		String x= new String();
		int T, N,i,j;
		long count=0,temp=1;
		Scanner input= new Scanner(System.in);
		t=input.next();
		T= Integer.parseInt(t);
		for(j=0;j<T;j++)
		{
			n= input.next();
			N=Integer.parseInt(n);
			long[] A= new long[N];
			for(i=0;i<N;i++)
			{
				x= input.next();
				A[i]= Long.parseLong(x);
				//A[i]= Integer.parseInt(x);
			}
				
			for(i=0;i<N;i++)
			{
				while(i<N-1 && A[i]<=A[i+1])
				{
					i++;
					temp++;
				}
				if(temp==1)
					count++;
				else
					count= count+ findSum(temp);
				temp=1;
			}
			System.out.println(count);
			count=0;
		}
		

	}

	private static long findSum(long n) {
		return n*(n+1)/2;
	}

}
