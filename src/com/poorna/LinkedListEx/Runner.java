package com.poorna.LinkedListEx;
import java.util.LinkedList;
import java.util.Scanner;
public class Runner {

	public static void main(String[] args) {

		String array[] = new String[676];
		
		LinkedList list = new LinkedList<String>();
		LinkedList list2 = new LinkedList();
		
		for(int l=0;l<array.length;l++) {
			list.add(l, null);
		}
		    int n=0;
		for(char i='a';i<='z';i++) {   
			
			for(char k='a';k<='z';k++)  {
				
			array[n]=i+""+k;
		     n++;
		    } 
	     }
		  String input = "today is friday"; 
		  String[] words = input.split(" "); 
		  
		for(int a=0;a<words.length;a++) {
			
			String words1 = words[a];
	        String words2 = words1.substring(0, 2);
			int j=0;
			
		    for( j=0;j<array.length;j++) {
		    	
			String check =array[j];
			
			  if(check.equalsIgnoreCase(words2)) {
				list.add(j,words1); // today
				list2.add(words1); //today
				break;
			  }
		    }
		}
		   for(String i : array)  {
			   
			System.out.print(i+" ");
		   }
		   
		System.out.println();
		System.out.println(list);
		System.out.println(list2);
	
		
	}
}
