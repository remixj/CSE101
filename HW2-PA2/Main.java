// This file is purely for local testing
import java.io.*;
import java.util.*;

import edu.ucsd.cse101.hw2.MatrixDimensions;
import edu.ucsd.cse101.hw2.Solution;

/**
 * Implement the canMultiplyMatrix of the Solution class
 */
public class Main {

    // test 1
    public static void test_1(Solution studentSol) {
        MatrixDimensions m1 = new MatrixDimensions(2, 3);
        MatrixDimensions m2 = new MatrixDimensions(3, 4);        
        MatrixDimensions m3 = new MatrixDimensions(4, 5);        
        MatrixDimensions m4 = new MatrixDimensions(5, 6);        
        MatrixDimensions m5 = new MatrixDimensions(6, 7);        

        List<MatrixDimensions> inputList = Arrays.asList(m1, m2, m3, m4, m5);
        boolean studentResult = studentSol.canMultiplyMatrix(inputList, 2, 7);
        System.out.println(studentResult);
        if (studentResult == true) {
            System.err.println("Test 1 PASSED");
        } else {
            System.err.println("Test 1 FAILED");
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        test_1(s);

        // Write your own test cases below
    }
}
