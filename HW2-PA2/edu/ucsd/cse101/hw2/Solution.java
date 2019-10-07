// Make sure line below is un-commented before Gradescope submission!
package edu.ucsd.cse101.hw2;

import java.io.*;
import java.util.*;

/**
 * Implement the canMultiplyMatrix of the Solution class
 */
public class Solution {

  /**
   * Returns whether there exists some combination of matrices
   * that, when multiplied, result in a matrix of dimensions 
   * (R,C)
   * 
   * @param   dimensions  See MatrixDimensions.java
   * @param   R           Target number of rows
   * @param   C           Target number of cols
   * @return  bool
   */
  public boolean canMultiplyMatrix(
    List<MatrixDimensions> dimensions, 
    int R, 
    int C
  ){
    HashSet<Integer> reached = new HashSet<>();
    Queue<Integer> queue = new LinkedList<>();
    boolean has_start = false;
    boolean has_end = false;
    for (MatrixDimensions m : dimensions){
      if (m.rows == R){
        has_start = true;
        queue.offer(m.cols);
      }
      if (m.cols == C){
        has_end = true;
      }
    }

    if (has_end == false || has_start == false){
      return false;
    }

    while (!queue.isEmpty()){
      int cur = queue.poll();
      if (reached.contains(cur)){
        continue;
      }
      reached.add(cur);
      if (cur == C){
        return true;
      }
      for (MatrixDimensions x : dimensions){
        if (x.rows != cur || reached.contains(x.cols)){
          continue;
        }
        queue.offer(x.cols);
      }
    }
    return false;
  }
}
