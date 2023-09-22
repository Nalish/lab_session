import java.util.Scanner;
public class Bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);

		int weight;
		System.out.print("weight");
		weight=input.nextInt();
		int height;
		System.out.print("height");
		height=input.nextInt();
		double bmi;
		
		bmi=weight/(height*height);
		System.out.println("bmi:"+bmi);
	}

}
