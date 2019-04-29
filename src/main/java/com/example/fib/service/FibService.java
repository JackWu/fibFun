package com.example.fib.service;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class FibService {

	private static final Logger log = LoggerFactory.getLogger(FibService.class);

	    List<BigInteger> bigIntFibList = null;;
	    @PostConstruct
	    private void init() {
	        log.info("AppInitializator initialization logic ...");
	        buildFibData();
	        // ...
	    }

	   private void buildFibData() 
	    { 
		   
		   BigInteger[] bigIntFibRet = new BigInteger[15677+2];
	        
		   bigIntFibRet[0]=BigInteger.valueOf(0);
		   bigIntFibRet[1]=BigInteger.valueOf(1);
		   

	        for (int j=2 ; j<=15677 ; j++) 
	        { 
	        	bigIntFibRet[j] =  bigIntFibRet[j-1].add(bigIntFibRet[j-2]); 
	        } 
	        
	        bigIntFibList = Collections.unmodifiableList(Arrays.asList(bigIntFibRet));
	  
	    } 
	   
	   public Map<String, String> getFibValue(int n) {
		   
		   Map<String, String> ret = new HashMap<String, String>();
		   
		   if(n >=15678) {
			   ret.put("code", "1111");
		   	   ret.put("msg", n+"'s result is too big to be handled by Java BigInteger type");
			   return ret;
		   }
		   
		   if(bigIntFibList == null) {

			   ret.put("status", "error");
			   ret.put("code", "2222");
		   	   ret.put("msg",  "Something is wrong with precomputed fib array");
		   	   return ret;
		   }
		   
		   ret.put("status", "success");
		   ret.put("code", "3333");
		   ret.put("msg", "");
		   ret.put("data", bigIntFibList.get(n).toString());
		   return ret;
	   }
	
}
