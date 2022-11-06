package javaproject;

public class CounterTester {
		public static void main(String[] args) { 
			Counter1 concertCounter=new Counter1()	; 
			int rValue=concertCounter.getValue(); 
			concertCounter.clickMany(10); 
			rValue=concertCounter.getValue(); 
			System.out.println("Expected anotherVenue:5 "); 
			concertCounter.unclickMany(5); 
			rValue=concertCounter.getValue(); 
			System.out.println("Actual anotherVenue:" +rValue); 
			concertCounter.reset(); 
			concertCounter.clickMany(3);
			rValue=concertCounter.getValue();
			System.out.println("Expected anotherVenue:-1 "); 
			concertCounter.unclickMany(4); 
			rValue=concertCounter.getValue(); 
			System.out.println("Actual anotherVenue: " +rValue); 
		}

		private void reset() {
			// TODO Auto-generated method stub
			
		}

		private void unclickMany(int i) {
			// TODO Auto-generated method stub
			
		}

		private void clickMany(int i) {
			// TODO Auto-generated method stub
			
		}

		private int getValue() {
			// TODO Auto-generated method stub
			return 0;
		} 







	}


