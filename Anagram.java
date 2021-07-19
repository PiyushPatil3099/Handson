import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		String s1;
		String s2;
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		s2=sc.nextLine();
		
		if(s1.length()!=s2.length()) {
			System.out.println("Not Anagram");
		}
		else {
			int count=0;
			char s3[]=s2.toCharArray();
			char s4[]=s1.toCharArray();
			
			for(int i=0;i<s4.length;i++) {
				for(int j=0;j<s3.length;j++) {
					if(s4[i]==s3[j]) {
						count++;
						break;
					}
				}
			}
			if(count==s1.length()) {
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram");
			}
			
		}
	}

}
