import java.util.Scanner;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[]=new String[10];
		Scanner sc=new Scanner(System.in);
		StringBuilder s=new StringBuilder();
		for(int i=0;i<name.length;i++) {
			name[i]=sc.next();
		}
		for(int i=0;i<name.length;i++) {
			s.append(name[i]);
		}
		System.out.println(s);
		

	}

}
