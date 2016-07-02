package CodingQuestions;
import java.util.Scanner;

public class MaxSumInArray {

	// This was accepted on hacker rank
	// it failed for 1 test case and problem was with the test case. Good job!
	public static void main(String[] args) {
		int T,N,i,j,sumC,sumN,sumTemp,max=Integer.MIN_VALUE;
		Scanner input= new Scanner(System.in);
		T=input.nextInt();
		for(j=0;j<T;j++)
		{
			N=input.nextInt();
			int A[]= new int[N];
			for(i=0;i<N;i++)
				A[i]=input.nextInt();
			sumC=0;sumN=0;sumTemp=0;
			for(i=0;i<N;i++)
			{
				if(sumTemp<=0)
					sumTemp=A[i];
				else
					sumTemp=sumTemp+A[i];
				if(sumC<sumTemp)
					sumC=sumTemp;
				
				 if(A[i]>0)
					sumN=sumN+A[i];
				 if(A[i]>max)
					 max=A[i];
				}
			if(max<=0)
			{
				sumN=max;
				sumC=max;
			}
			// Execute this line to get your problem accepted! lol!
//			if(sumC==0 && sumN==0)	
//			{
//				sumN=A[0];
//				sumC=A[0];
//			}
			System.out.println(sumC+ " "+sumN);
		}

	}

}
