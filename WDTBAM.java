package CodingQuestions;
import java.util.Scanner;

public class WDTBAM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String t= new String();
		String n= new String();
		String x= new String();
		int T,N,count=0,i,j;
		char[] charsCorrect, charsGiven;
		long[] A;
		//parse input
		Scanner input= new Scanner(System.in);
		//t= input.next();
		//T=Integer.parseInt(t);
		T=input.nextInt();
		for(i=0;i<T;i++)
		{
			count=0;
			//n=input.next();
			//N=Integer.parseInt(n);
			N= input.nextInt();
			charsCorrect= new char[N];
			charsGiven=new char[N];
			A= new long[N+1];
			charsCorrect= input.next().toCharArray();
			charsGiven= input.next().toCharArray();
			for(j=0;j<N;j++)
			{
				//x=input.next();
				//A[j]= Integer.parseInt(x);
				A[j]= input.nextLong();
				if(charsCorrect[j]==charsGiven[j])
					count++;
			}
			//x=input.next();
			//A[j]=Integer.parseInt(x);
			A[j]=input.nextLong();
			System.out.println(A[count]);
			
		}
		
		
		

	}

}
