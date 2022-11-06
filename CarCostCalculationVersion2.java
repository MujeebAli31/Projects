import java.util.Scanner;

public class CarCostCalculationVersion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Inputs
		Scanner scan=new Scanner(System.in);
		
		
		String astring= new String("Enter the information of the regular car: ");
		String rgC=scan.nextLine();
		String bstring= new String("Enter the information of the hybrid car: ");
		String hgC=scan.nextLine();
		String cstring= new String("Enter the miles traveled in a year: ");
		System.out.println(cstring.substring(0));
		double mT=scan.nextDouble();
		String dstring= new String("Enter the cost per gallon of gas: ");
		System.out.print(dstring.substring(0));
		double cG=scan.nextDouble();
		
		String[] regC=rgC.split(",");
		String mReg= regC[0];
		int cReg=Integer.parseInt(regC[1]);
		int mmReg=Integer.parseInt(regC[2]);
		
		String [] hybC=hgC.split(",");
		String mHb=hybC[0];
		int cHyb=Integer.parseInt(hybC[1]);
		int mHyb=Integer.parseInt(hybC[2]);
		
		double yOg=(mT/mmReg)*cG;
		double yO=cReg+yOg;
		double yTg=yOg+yO;
		double yThg=yOg+yTg;
		double yFg=yOg+yThg;
		double yFig=yOg+yFg;
		double yOgh=(mT/mHyb)*cG;
		double yOghyb=cHyb+yOgh;
		double yThyb=yOgh+yOghyb;
		double yThrhy=yOgh+yThyb;
		double yFhyb=yOgh+yThrhy;
		double yFihyb=yOgh+yFhyb;
		
		System.out.print("Cost to own after year one for"+mReg+": "+yO+"for"+mHb+": ");
		System.out.print("Cost to own after year two for"+mReg+": "+yTg+"for"+mHb+": ");
		System.out.print("Cost to own after year three for"+mReg+": "+yThg+"for"+mHb+": ");
		System.out.print("Cost to own after year four for"+mReg+": "+yFg+"for"+mHb+": ");
		System.out.print("Cost to own after year five for"+mReg+": "+yFig+"for"+mHb+": ");

		
		
		
		
		

	
		
		
	
		
 
	}

}
