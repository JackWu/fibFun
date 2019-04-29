package test2;

import java.math.BigInteger;

public class fibValueTestBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 15677; 
        
    	averageRunningTime(n);
	}
	
	public static void averageRunningTime(int n){
		for(int i = 0; i < 100; i++){
	        long startTime = System.currentTimeMillis();
	        BigInteger ret = fib4(n); 
	        long endTime = System.currentTimeMillis();
	        System.out.println("time: " + (endTime - startTime) + "ms. Result: " + ret);
		}
	}
	
	
	static void findingTheLimit(){
        int n = 15000; 
        
        for(int i = 15000; i < 15677; i++){
        	
        	System.out.println("value of n: " + i);
	        long startTime = System.currentTimeMillis();
	        BigInteger ret = fib2(i); 
	        long endTime = System.currentTimeMillis();
	        if(ret==null || ret.toString().length()==0){
	        	System.out.println(n + " is the limit");
	        	break;
	        }
	        System.out.println("time: " + (endTime - startTime) + " Rresult: " + ret);
        }
	}
	
	static int fib(int n) { 
		double phi = (1 + Math.sqrt(5)) / 2; 
		return (int) Math.round(Math.pow(phi, n)  
		                        / Math.sqrt(5)); 
		} 
	
	
	   static BigInteger fib2(int n) 
	    { 
		   
		   

		   BigInteger a = BigInteger.valueOf(0); 
	        BigInteger b = BigInteger.valueOf(1); 
	        BigInteger c = BigInteger.valueOf(1); 
	        for (int j=2 ; j<=n ; j++) 
	        { 
	            c =  a.add(b); 
	            a = b; 
	            b = c; 
	        } 
	  
	        return (a); 
	    } 
	   

	   
	   static int fib3(int n) 
	    { 
	    /* Declare an array to store Fibonacci numbers. */
	    int f[] = new int[n+2]; // 1 extra to handle case, n = 0 
	    int i; 
	       
	    /* 0th and 1st number of the series are 0 and 1*/
	    f[0] = 0; 
	    f[1] = 1; 
	      
	    for (i = 2; i <= n; i++) 
	    { 
	       /* Add the previous 2 numbers in the series 
	         and store it */
	        f[i] = f[i-1] + f[i-2]; 
	    } 
	       
	    return f[n]; 
	    } 
	   
	   static BigInteger fib4(int n) 
	    { 
		   
		   
		   BigInteger[] bigIntFibRet = new BigInteger[n+2];
	        
		   bigIntFibRet[0]=BigInteger.valueOf(0);
		   bigIntFibRet[1]=BigInteger.valueOf(1);
		   

	        for (int j=2 ; j<=n ; j++) 
	        { 
	        	bigIntFibRet[j] =  bigIntFibRet[j-1].add(bigIntFibRet[j-2]); 
	        } 
	  
	        return bigIntFibRet[n]; 
	    } 
	       

	   
	   

}
