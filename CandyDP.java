package CodingQuestions;
import java.util.Scanner;

public class CandyDP {

	//accepted for all test cases in hackerrank
	public static void main(String[] args)
	{
		int N,i;
		long total=0;
		Scanner input= new Scanner(System.in);
		N= input.nextInt();
		int[] A= new int[N];
		int[] B= new int[N];
		for(i=0;i<N;i++)
			A[i]= input.nextInt();
		candy(A,B,N,0,0);
		//for(i=0;i<N;i++)
           // System.out.println(B[i]);
		for(i=0;i<N;i++)
			total= total+ (long)B[i];
		System.out.println(total);
		
	}

	private static void candy(int[] A, int[] B, int N, int index,int min_candy)
	{
		if(B[index]!=0)
			return;
		if(index+1==N)
		{
			B[index]= min_candy+1;
			return;
		}
		if(A[index]<A[index+1])
		{
			min_candy++;
			B[index]=min_candy;
		}
			
		else if(A[index]==A[index+1])
		{
			min_candy++;
			B[index]= min_candy;
			min_candy=0;
		}
		else if(A[index]>A[index+1])
		{
			candy(A,B,N,index+1,0);
			B[index]= max(B[index+1]+1,min_candy+1);
		}
		 candy(A,B,N,index+1,min_candy);
				
	}

	private static int max(int x, int i) {
		if(x>i)
			return x;
		return i;
	}

}
