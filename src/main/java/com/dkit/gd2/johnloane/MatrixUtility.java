package com.dkit.gd2.johnloane;

public class MatrixUtility
{
    public static double[][] addTwoMatrices(double[][] matrix1, double[][] matrix2)
    {
        if(checkIfSizesAreCompatibleAdd(matrix1, matrix2))
        {
            double[][] result = new double[matrix1.length][matrix2[0].length];
            for (int i = 0; i < matrix1.length; i++)
            {
                for (int j = 0; j < matrix1[0].length; j++)
                {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            return result;
        }
        return null;
    }

    public static double[][] multiplyTwoMatrices(double[][] matrix1, double[][] matrix2)
    {
        if(checkIfSizesAreCompatibleMult(matrix1, matrix2))
        {
            double[][] result = new double[matrix1.length][matrix2[0].length];
            for (int row = 0; row < matrix1.length; row++)
            {
                for (int col = 0; col < matrix2[0].length; col++)
                {
                    result[row][col] = 0;
                    for(int i=0; i < matrix1[0].length; i++)
                    {
                        result[row][col] += matrix1[row][i] * matrix2[i][col];
                    }
                }
            }
            return result;
        }
        return null;
    }

    private static boolean checkIfSizesAreCompatibleMult(double[][] matrix1, double[][] matrix2)
    {
        if(matrix1[0].length == matrix2.length)
        {
            return true;
        }
        return false;
    }

    private static boolean checkIfSizesAreCompatibleAdd(double[][] matrix1, double[][] matrix2)
    {
        if((matrix1.length == matrix2.length) && (matrix1[0].length == matrix2[0].length))
        {
            return true;
        }
        return false;
    }
}
