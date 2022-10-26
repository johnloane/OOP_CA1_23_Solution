package com.dkit.gd2.johnloane;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixUtilityTest
{
    @Test
    void addTwoSquareMatrices()
    {
        double[][] matrix1 = new double[2][2];
        matrix1[0][0] = 1;
        matrix1[0][1] = 0;
        matrix1[1][0] = 0;
        matrix1[1][1] = 1;

        double[][] matrix2 = new double[2][2];
        matrix2[0][0] = 1;
        matrix2[0][1] = 2;
        matrix2[1][0] = 3;
        matrix2[1][1] = 4;

        double[][] expected = new double[2][2];
        expected[0][0] = 2;
        expected[0][1] = 2;
        expected[1][0] = 3;
        expected[1][1] = 5;

        assertArrayEquals(expected, MatrixUtility.addTwoMatrices(matrix1, matrix2));
    }

    @Test
    void addMismatchedMatrices()
    {
        double[][] matrix1 = new double[2][2];
        matrix1[0][0] = 1;
        matrix1[0][1] = 0;
        matrix1[1][0] = 0;
        matrix1[1][1] = 1;

        double[][] matrix2 = new double[3][3];
        matrix2[0][0] = 5;
        matrix2[0][1] = 6;
        matrix2[0][2] = 8;
        matrix2[1][0] = 1;
        matrix2[1][1] = 2;
        matrix2[1][2] = 3;
        matrix2[2][0] = 4;
        matrix2[2][1] = 5;
        matrix2[2][2] = 6;

        double[][] expected = null;

        assertArrayEquals(expected, MatrixUtility.addTwoMatrices(matrix1, matrix2));
    }

    @Test
    void multiplyTwoSquareMatrices()
    {
        double[][] matrix1 = new double[2][2];
        matrix1[0][0] = 1;
        matrix1[0][1] = 2;
        matrix1[1][0] = 3;
        matrix1[1][1] = 4;

        double[][] matrix2 = new double[2][2];
        matrix2[0][0] = 5;
        matrix2[0][1] = 6;
        matrix2[1][0] = 7;
        matrix2[1][1] = 8;

        double[][] expected = new double[2][2];
        expected[0][0] = 19;
        expected[0][1] = 22;
        expected[1][0] = 43;
        expected[1][1] = 50;

        assertArrayEquals(expected, MatrixUtility.multiplyTwoMatrices(matrix1, matrix2));
    }

    @Test
    void multiplyTwoNotSquareMatrices()
    {
        double[][] matrix1 = new double[2][2];
        matrix1[0][0] = 1;
        matrix1[0][1] = 2;
        matrix1[1][0] = 3;
        matrix1[1][1] = 4;

        double[][] matrix2 = new double[2][3];
        matrix2[0][0] = 5;
        matrix2[0][1] = 6;
        matrix2[0][2] = 7;
        matrix2[1][0] = 8;
        matrix2[1][1] = 9;
        matrix2[1][2] = 10;

        double[][] expected = new double[2][3];
        expected[0][0] = 21;
        expected[0][1] = 24;
        expected[0][2] = 27;
        expected[1][0] = 47;
        expected[1][1] = 54;
        expected[1][2] = 61;

        assertArrayEquals(expected, MatrixUtility.multiplyTwoMatrices(matrix1, matrix2));
    }

    @Test
    void multiplyTwoIncompatibleMatrices()
    {
        double[][] matrix1 = new double[2][2];
        matrix1[0][0] = 1;
        matrix1[0][1] = 2;
        matrix1[1][0] = 3;
        matrix1[1][1] = 4;

        double[][] matrix2 = new double[3][3];
        matrix2[0][0] = 5;
        matrix2[0][1] = 6;
        matrix2[0][2] = 7;
        matrix2[1][0] = 8;
        matrix2[1][1] = 9;
        matrix2[1][2] = 10;
        matrix2[2][0] = 11;
        matrix2[2][1] = 12;
        matrix2[2][2] = 13;


        double[][] expected = null;

        assertArrayEquals(expected, MatrixUtility.multiplyTwoMatrices(matrix1, matrix2));
    }
}