package CodingQuestions;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		int n,i;
		Scanner input= new Scanner(System.in);
		n= input.nextInt();
		int[] A= new int[n];
		// We need another array for merge sort hence merge sort is not in place
		int[] B= new int[n];
		for(i=0;i<n;i++)
			A[i]= input.nextInt();
		// please note we pass n-1 here
		new  MergeSort().Sort(A,0,n-1,B);
		for(i=0;i<n;i++)
			System.out.print(A[i] +" ");

	}
	

	public void Sort(int[] A,int a,int b,int[] B)
	{
		int mid;
		// todo: make it lower, here we have int so it will automatically take lower
		if(a<b)
		{
			// we break the array to one unit each
			 mid= (a+b)/2;
			 Sort(A,a,mid,B);
			 Sort(A,mid+1,b,B);
			 new MergeSort().Merge(A,a,mid,b,B);
		}
		
		
		
	}
	
	public void Merge(int[] A, int a, int mid, int b, int[] B)
	{
			int i=0,j=0,n=0,m=0,limit=0;
			n=a;
			i=a;
			m=mid+1;
			// note mid is end of array 1 and b is end of array 2
			// While the array is unsorted when we merge
			while(n<=mid && m<=b)
			{
				if(A[n]<A[m])
					B[i++]=A[n++];
				else
					B[i++]=A[m++];
			}
			// when we have only the sorted elements remianing
			if(n<=(mid) || m<=b)
			{
				if(n<=(mid))
				{
					j=n;
					limit= mid;
				}
				else
				{
					j=m;
					limit= b;
				}
				// copying the remaining elements
			while(j<=limit)
			{
				B[i++]= A[j++];
			}
			}
			// VVI: Remember to copy the array B to array A at the end
			for(i=a;i<=b;i++)
				A[i]=B[i];
					
	}
}



