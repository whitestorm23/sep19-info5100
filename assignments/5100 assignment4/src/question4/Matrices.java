package question4;

public class Matrices  {
	 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a={{1,0,0},{-1,0,3}};
		int[][] b={{7,0,0},{0,0,0},{0,0,1}};
		printMatrix(a,b);
	}
	static void printMatrix(int[][] a,int[][] b){
	
		
	
 
		int c[][] = new int[a.length][b[0].length];
		
		int x,i,j;
		for(i = 0;i<a.length ;i++)
		{
			for(j = 0;j<b[0].length;j++)
			{
				int temp = 0;
				for(x = 0;x<b.length;x++)
				{
					temp+=a[i][x]*b[x][j];
					
				}
				c[i][j] = temp;
				
			}
		}
		System.out.println("the result is");
		for(int m = 0;m<a.length;m++)
		{
			for(int n = 0;n<b[0].length;n++)
			{
				System.out.print(c[m][n]+"\t");
			}
			System.out.println();
		}
	}

	
}
