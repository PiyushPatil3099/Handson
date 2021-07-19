/*
 * 1.	Print the character at the 12th index. 
2.	Check whether the String contains the word “is”. 
3.	Add the string “and killed it” to the existing string. 
4.	Check whether the String ends with the word “dogs”. 
5.	Check whether the String is equal to “The quick brown Fox jumps over the lazy Dog”.
6.	Check whether the String is equal to “THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG”.                                
7.	Find the length of the String. 
8.	Check whether the String matches to “The quick brown Fox jumps over the lazy Dog”. 
9.	Replace the word “The” with the word “A”. 
10.	Split the above string into two such that two animal names do not come together. 
11.	Print the animal names alone separately from the above string. 
12.	Print the above string in completely lower case. 
13.	Print the above string in completely upper case.
14.	Find the index position of the character “a”. 
15.	Find the last index position of the character “e”. 


 */
public class StrinImmutability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="The quick brown fox, jumps over the lazy dog";
		
		System.out.println("Char at 12th index="+s.charAt(12));
		System.out.println("Adding string"+s.concat("and killed it"));
		System.out.println("String eds with dog="+s.endsWith("dogs"+ ""));
		System.out.println("String equal="+s.equals("The quick brown Fox jumps over the lazy Dog"));
		System.out.println("String equal="+s.equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
		System.out.println("String length="+s.length());
		System.out.println("String match="+s.matches("The quick brown fox jumps over the lazy Dog"));
		System.out.println("Replace the with a="+s.replace("the","a"));
		String s1[]=s.split(",");
		for(String s2:s1) {
			System.out.println(s2);
		}
		System.out.println(s.substring(16, 20));
		System.out.println(s.substring(40, 43));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.indexOf("a"));
		System.out.println(s.lastIndexOf("e"));

	
	}

}
