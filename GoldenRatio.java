package CodingQuestions;

import java.math.BigInteger;



public class GoldenRatio {
	
	private static BigInteger two = new BigInteger("2");
	private static BigInteger three = new BigInteger("3");

	public static void main(String[] args)
	{
		BigInteger a = new BigInteger("0"); 
		BigInteger b = new BigInteger("1");
		BigInteger x = new BigInteger("2");
		int i=0;
		//long a=0, b=1;
		//long x=0;
		while(i<200)
		{
			x= a.add(b);
			a=b;
			b=x;
			if(isprime(x))
			{
				System.out.println(x);
				i++;
			}
			
		}

	}
	
	public static boolean isprime(BigInteger n)
    {
         if(n.compareTo(BigInteger.ONE)==0 || n.compareTo(two)==0)
        {
            return true;
        }
         BigInteger root = appxRoot(n);

       for(BigInteger i=three; i.compareTo(root)<=0;i=i.add(BigInteger.ONE))
        {

            if(n.mod(i).equals(BigInteger.ZERO))
            {
              return false; 
            }

        }
         return true;

    }

//	public static boolean isprime(BigInteger n) {
//
//	    if (!n.isProbablePrime(10)) {
//	        return false;
//	    }
//
//	    if (n.compareTo(BigInteger.ONE) == 0 || n.compareTo(two) == 0) {
//	        return true;
//	    }
//	    BigInteger root = appxRoot(n);
//	  //  System.out.println("Using approximate root " + root);
//
//	    int cnt = 0;
//	    for (BigInteger i = three; i.compareTo(root) <= 0; i = i
//	            .nextProbablePrime()) {
//	        cnt++;
//	        if (cnt % 1000 == 0) {
//	          //  System.out.println(cnt + " Using next prime " + i);
//	        }
//	        if (n.mod(i).equals(BigInteger.ZERO)) {
//	            return false;
//	        }
//
//	    }
//	    return true;
//
//	}

	private static BigInteger appxRoot(final BigInteger n) {
	    BigInteger half = n.shiftRight(1);
	    while (half.multiply(half).compareTo(n) > 0) {
	        half = half.shiftRight(1);
	    }
	    return half.shiftLeft(1);
	}

	
}
