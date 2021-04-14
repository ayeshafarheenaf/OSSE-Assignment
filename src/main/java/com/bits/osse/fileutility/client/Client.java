package com.bits.osse.fileutility.client;

import java.util.Scanner;

import com.bits.osse.fileutility.handler.InputHandler;
import com.bits.osse.fileutility.model.FileSearchCriteria;
import com.bits.osse.fileutility.service.SearchService;
import com.bits.osse.fileutility.service.SearchServiceImpl;
  
  
public class Client {
    
    public static void main(String[] args)
    {
    	System.out.println("Enter the directory to search in:");
    	String dir=InputHandler.handleInput(new Scanner(System.in));
    	System.out.println("Enter the file to search in:");
    	String fileName=InputHandler.handleInput(new Scanner(System.in));
    	
    	FileSearchCriteria criteria=new FileSearchCriteria(dir, fileName);
    	SearchService searchService=new SearchServiceImpl();
    	searchService.searchFile(criteria);
     	
  	  }
}