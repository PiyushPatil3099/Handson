import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1[]=new int[5];
		System.out.println("Enter five numbers=");
		for(int i=0;i<5;i++) {
			num1[i]=sc.nextInt();
		}
		int add=0;
		for(int i=0;i<5;i++) {
			add=add+num1[i];
		}
		System.out.println("Addition of Number="+add);
	}
}
