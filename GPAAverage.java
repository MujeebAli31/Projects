import java.util.Scanner;
public class GPAAverage {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner in=new Scanner(System.in);
			int sum=0;
			int clas=0;
			int  value=0;
			double letter=0;
			double gradeSum=0;
			double grade=0;
			double GPA=0;
			
			while(sum<10) {
			
			System.out.println("Enter course information separated by commas (title, credit hours, letter grade) or type Q to quit: ");
			String a=in.nextLine();
			
			if(a.equals("q")||a.equals("Q")){
				System.out.println("Quit the program");
				break;}
			
			String [] parameters=a.split(",");
			String credits=parameters[1];	
			String letterGr=parameters[2];
			
			if(letterGr.equals("A"))
			{letterGr="4.0";
			value=Integer.parseInt(credits);
			letter=Double.parseDouble(letterGr);}
			
			else if(letterGr.equals("A-"))
			{letterGr="3.7";
			value=Integer.parseInt(credits);
			letter=Double.parseDouble(letterGr);}
			
			else if(letterGr.equals("B+"))
			{letterGr="3.33";
			value=Integer.parseInt(credits);
			letter=Double.parseDouble(letterGr);}
			
			else if(letterGr.equals("B"))
			{letterGr="3.0";
		    value=Integer.parseInt(credits);
			letter=Double.parseDouble(letterGr);}
			
			else if(letterGr.equals("B-"))
			{letterGr="2.7";
			value=Integer.parseInt(credits);
			letter=Double.parseDouble(letterGr);}
			
			else if(letterGr.equals("C+"))
			{letterGr="2.3";
			value=Integer.parseInt(credits);
			letter=Double.parseDouble(letterGr);}
			
			else if(letterGr.equals("C"))
			{letterGr="2.0";
			value=Integer.parseInt(credits);
			letter=Double.parseDouble(letterGr);}
			
			else if(letterGr.equals("C-"))
			{letterGr="1.7";
			value=Integer.parseInt(credits);
			letter=Double.parseDouble(letterGr);}
			
			else if(letterGr.equals("D+"))
			{letterGr="1.3";
			value=Integer.parseInt(credits);
			letter=Double.parseDouble(letterGr);}
			
			else if(letterGr.equals("D"))
			{letterGr="1.0";
			value=Integer.parseInt(credits);
			letter=Double.parseDouble(letterGr);}
			
			else if(letterGr.equals("D-"))
			{letterGr=".70";
			value=Integer.parseInt(credits);
			letter=Double.parseDouble(letterGr);}
			
			else if(letterGr.equals("F")||letterGr.equals("WF"))
			{letterGr="0";
			value=Integer.parseInt(credits);
			letter=Double.parseDouble(letterGr);}
			
			else if(letterGr.equals("P")||letterGr.equals("NP")||letterGr.equals("I")||letterGr.equals("W")) 
			{letterGr=null;
			value=Integer.parseInt(credits);}
			
			else
			{System.out.println("Invalid grade.");
			letterGr=null;
			value=0;}
			
			clas++;
			sum+=value;
			System.out.println(clas+ " classes ");
			System.out.println(sum+ " credits ");
			
			grade=letter*value;	
			
			if(sum>10)
			{System.out.println("\nYou can only enter a maximum of 10 credits");
			clas--;
			sum-=value;
			System.out.println(clas+ " classes ");
			System.out.println(sum+ " credits");
			grade=0;}
		
			gradeSum+=grade;
			System.out.printf("Grade Points: %.2f\n\n",gradeSum );
			
		}	
			GPA=gradeSum/10;
			System.out.printf("\nYour GPA for the semester is a %.2f",GPA);
		}
		{

		}
		}
