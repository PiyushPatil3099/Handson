
public class MultiDiamentionalArray {
	
	public static void main(String[] args) {
		
		int a[][]={{1,3},{2,4}};;
		int b[][]= {{5,6},{6,7}};
		int sum[][]=new int[2][2];
		
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(sum[i][j]+"  ");
			}
			System.out.println();
		}
		
	}

}
