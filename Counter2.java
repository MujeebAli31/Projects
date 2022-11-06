package javaproject;

public class Counter2 {

	public static void main(String[] args) {
		Counter1 venue= new Counter1(); 
		for(int cnt=0;cnt<=10;cnt++)  
		{ 
			venue.click(); 
		} 
		for(int cnt=5;cnt>=0;cnt--)  
		{ 
			venue.unclick(); 
		}
		int rValue=venue.getValue(); 
		System.out.println("Expected venue:5"); 
		System.out.println("Actual venue="+rValue); 
		venue.reset(); 
		for(int counter=0;counter<=3;counter++) 
		{ 
			venue.click(); 
		} 
		for(int counter=4;counter>=0;counter--)  
		{ 
			venue.unclick(); 
		} 
		rValue=venue.getValue(); 
		System.out.println("Expected venue=-1"); 
		System.out.println("Actual venue="+rValue); 
		}
}








