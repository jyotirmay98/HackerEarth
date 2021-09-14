import java.util.*;

public class MonkAndInversions 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

        int testCases = Integer.parseInt(scan.nextLine());

        for(int i=1; i<=testCases; i++)
        {
            int matrixSize = Integer.parseInt(scan.nextLine());
            
            int[][] matrix = new int[matrixSize][matrixSize];
            
            for(int j=0; j<matrixSize; j++)
            {
            	String[] strArray = scan.nextLine().split(" ");
            	
            	for(int k=0; k<strArray.length; k++)
            	{
            		matrix[j][k] = Integer.parseInt(strArray[k]);
            	}
            }
            
            System.out.println(getNumberOfInversions(matrix , matrixSize));
        }
        
        scan.close();

	}

	private static int getNumberOfInversions(int[][] matrix, int matrixSize) 
	{
		int countInversion = 0;
		
		for(int i=0; i<matrixSize; i++)
		{
			for(int j=0; j<matrixSize; j++)
			{	
				for(int p=0; p<matrixSize; p++)
				{
					for(int q=0; q<matrixSize; q++)
					{
						if(i<=p && j<=q && matrix[i][j] > matrix[p][q])
						{
							countInversion++;
						}
					}
				}
			}
		}
		
		return countInversion;
	}
}
