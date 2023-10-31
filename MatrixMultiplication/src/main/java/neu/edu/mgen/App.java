package neu.edu.mgen;

public class App
 {
    public static void main(String[] args)
     {
        int[][] A = {{2, 3, 4}, {3, 4, 5}};
        int[][] B = {{1, 2}, {3, 4}, {5, 6}};

        int numRowsA = A.length;
        int numColsA = A[0].length;
        int numRowsB = B.length;
        int numColsB = B[0].length;

        if (numColsA != numRowsB) {
            System.out.println("Matrix multiplication is not possible.");
        } 
        else 
        {
            int[][] result = new int[numRowsA][numColsB];

            for (int i = 0; i < numRowsA; i++) 
            {
                for (int j = 0; j < numColsB; j++)
                 {
                    int sum = 0;
                    for (int k = 0; k < numColsA; k++)
                    {
                        sum += A[i][k] * B[k][j];
                    }
                    result[i][j] = sum;
                }
            }

            System.out.println("Matrix A * B:");
            for (int i = 0; i < numRowsA; i++)
             {
             for (int j = 0; j < numColsB; j++) {
                    System.out.print(result[i][j] + " ");
             }
             System.out.println();
            }
        }
    }
}

