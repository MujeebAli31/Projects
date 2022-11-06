package javaproject;
public class Counter1 {
		int a;
		public void click() {
			a=a+1;
		}
		public void unclick() { 
			a=a-1; 
		} 
		public int getValue() { 
			return a; 
		}
		public void reset() {
			a=0;
		}
		public void clickMany(int b) {
			a=a+b;
		}
		public void unclickMany(int c) {
			a=a-c;
		}
	
		
		
	}
