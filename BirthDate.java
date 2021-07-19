import java.util.Scanner;

public class BirthDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day,month,year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day=");
		day=sc.nextInt();
		System.out.println("Enter the month=");
		month=sc.nextInt();
		System.out.println("Enter the year=");
		year=sc.nextInt();
		
		/*switch(year) {
			case 1990:
			case 1991:
			case 1992:
			case 1993:
			case 1994:
			case 1995:
				System.out.println("Early 90's born");
				break;
			case 1996:
			case 1997:
			case 1998:
			case 1999:
			case 2000:
				System.out.println("Late 90's born");
				break;
			case 2001:
			case 2002:
			case 2003:
			case 2004:
			case 2005:
			case 2006:
			case 2007:
			case 2008:
			case 2009:
			case 2010:
				System.out.println("You are new decade born");
				break;
			case 2011:
			case 2012:
			case 2013:
			case 2014:
			case 2015:
			case 2016:
			case 2017:
			case 2018:
			case 2019:
			case 2020:
				System.out.println("You are recently born");
				break;
			default:
				System.out.println("Invalid Year");
				break;
		}*/
		int c=0;
		if(year>=1990 &&year<=1995) {
			c=1;
		}
		else if(year>=1996 &&year<=2000) {
			c=2;
		}
		else if(year>=2001 &&year<=2010) {
			c=3;
		}
		else if(year>=2011 &&year<=2021) {
			c=4;
		}
		switch(c) {
		case 1:
			System.out.println("Early 90's born");
			break;
		case 2:
			System.out.println("Late 90's born");
			break;
		case 3:
			System.out.println("You are new decade born");
			break;
		case 4:
			System.out.println("You are recently born");
			break;
		default:
			System.out.println("Invalid Year");
			break;
		}
		sc.close();

	}

}
