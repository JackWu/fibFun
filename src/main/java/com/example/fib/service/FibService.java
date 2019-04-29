package com.example.fib.service;

import java.math.BigInteger;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class FibService {

	private static final Logger log = LoggerFactory.getLogger(FibService.class);

	   BigInteger[] bigIntFibRet = new BigInteger[15677+2];
	    @PostConstruct
	    private void init() {
	        log.info("AppInitializator initialization logic ...");
	        buildFibData();
	        // ...
	    }

	   private void buildFibData() 
	    { 
		   
		   
	        
		   bigIntFibRet[0]=BigInteger.valueOf(0);
		   bigIntFibRet[1]=BigInteger.valueOf(1);
		   

	        for (int j=2 ; j<=15677 ; j++) 
	        { 
	        	bigIntFibRet[j] =  bigIntFibRet[j-1].add(bigIntFibRet[j-2]); 
	        } 
	  
	    } 
	   
	   public String getFibValue(int n) {
		   
		   
		   if(n >=15678)
			   return n+"'s result is too big to be handled by Java BigInteger type";
		   
		   return bigIntFibRet[n].toString();
	   }
	
}
