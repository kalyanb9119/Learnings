/*
the Program is about sum the natural numbers
written by PavanKumar Bhukya
Date:22nd March 2022 
*/
import java.util.Scanner;
public class SumOfNaturalN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number upto which you want calculate ?");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
		          sum=sum+i;
		}
		System.out.println("Total="+sum);
	}

}
