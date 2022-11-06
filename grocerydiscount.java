import java.util.Scanner;
public class grocerydiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		double total=0;
		System.out.print("Please enter the cost of your groceries or '0' to quit: ");
		while(in.hasNextDouble())
		{
			double someDouble= in.nextDouble();
			if(someDouble==0)
			{
				break;
			}
			if (someDouble<10)
			{
				System.out.println("You are not eligible for a coupon this time");
			}
			else if (someDouble<=60)
			{
				System.out.println("You win a discount coupon of:$ "+someDouble*(.08));
			}
			else if(someDouble>60&&someDouble<=150.01)
			{
				System.out.println("You win a discount coupon of:$ "+someDouble*(.1));
			}
			else if(someDouble>150.01&&someDouble<=210)
			{
				System.out.println("You win a discount coupon of:$ "+someDouble*(.12));
			}
			else if(someDouble==210.01)
			{
				System.out.println("You win a discount coupon of:$ "+someDouble*(.14));
			}
				System.out.print("Please enter the cost of your groceries or '0' to quit: ");
		

		}
	
}
}		


		
			


	

