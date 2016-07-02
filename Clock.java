package CodingQuestions;
import java.util.Scanner;

public class Clock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float A;
		int T,H,M,i,j,k,x;
		String ans1= new String();
		String ans2= new String();
		Scanner input= new Scanner(System.in);
		T=input.nextInt();
		for(i=0;i<T;i++)
		{
			A= input.nextFloat();
			for(j=0;j<12;j++)
				for(k=0;k<60;k++)
				{
					if(((60*j-11*k)- 2*A==0))
					{
						ans1= (j < 10 ? "0" : "") + j;
						ans2= (k < 10 ? "0" : "") + k;
						System.out.println(ans1+":"+ans2);
						if(k==0 && j!=6 && j!=0)
						{
							x=12-j;
							ans1= (x < 10 ? "0" : "") + x;
							ans2= (k < 10 ? "0" : "") + k;
							System.out.println(ans1+":"+ans2);
						}
							
						
						
					}
				}
		}
		
		

	}

}
