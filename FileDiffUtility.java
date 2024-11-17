//////////////////////////// UNIT QUIZ FILE HEADER /////////////////////////////
// Full Name:   TODO
// Campus ID #: TODO
// WiscEmail:   TODO
////////////////////////////////////////////////////////////////////////////////

// Note: you are NOT required to use the Arrays class but it is provided for your convenience
import java.util.Arrays; // no additional imports besides java.util.Arrays are allowed

////////////////////////////////////////////////////////////////////////////////
//
// This file contains ONE class. You will need to complete the implementation
// this class with respect to the provided requirements in the TODO tags for
// full credit.
//
// NO variables outside of any method may be added to this class.
//
// Any additional methods added to this class must be PRIVATE.
//
// You are NOT required to submit a perfect solution. Do your best to submit a
// source file with no compiler errors within the allotted time.
//
// Commenting and style are NOT graded.
//
// BE SURE TO SAVE YOUR SOURCE FILE BEFORE SUBMITTING IT TO GRADESCOPE.
//
////////////////////////////////////////////////////////////////////////////////

/**
 * This class contains TWO (2) utility methods for interacting with an ordered collection of 
 * Strings representing the lines of text in a file.
 * 
 * We use a perfect-size array to store the answers, but to keep it organized this perfect-size array
 * should still be compact.
 * 
 * The value null is the default value for a String and represents an uninitialized value.
 * Null lines are not permitted, though empty ("") lines are fine.
 * 
 * You will be responsible for writing two (2) tester methods and the utility methods that they test.
 * The test methods are called in this class' main method; printed output will not be graded on this
 * program so you may add whatever print statements you like for debugging purposes.
 */
public class FileDiffUtility {
  
  ////// PART 1: File differences
  
  /**
   * Tester method that verifies the behavior of the percentDiff method defined below.
   * 
   * @return true if the method behaves correctly, false otherwise
   */
  public static boolean testPercentDiff() {
    
    // 1. TODO: given the following perfect-size array of lines from a reference file, create TWO
    //    perfect-size arrays of the same length containing files with the following contents:
    //    - one which contains the same number of lines but completely different values
    //    - one which contains at least one line which is the same as refFile and at least one
    //      which is UNINITIALIZED (can be compact or not)
    
    String[] refFile = new String[] {"line1", "line2", "line3", "line4", "line5",
                                     "line6", "line7", "line8", "line9", "line10"};
    
    String[] completelyDifferent; // update to contain an array of length 10 with different strings
    String[] missingOrDiff;       // update to contain an array with at least 1 match & 1 uninitialized
    
    // 2. TODO: verify that percentDiff() correctly returns 1.0 for completelyDifferent (100% different)
    //    and returns the correct value between 0.0 and 1.0 for the missingOrDiff array
    
    return false; // default return statement, feel free to change.
  }
  
  /**
   * Calculates the percent (between 0.0 and 1.0, inclusive) of lines in the compareFile which do NOT 
   * match those in the refFile. You may assume that both input arrays have the same length; both arrays
   * MAY contain uninitialized lines.
   * 
   * The percent is calculated as: 
   *     number of indexes in compareFile whose contents don't match refFile / total number of indexes
   * 
   * The value null is the default value for a String and represents an uninitialized value.
   * 
   * @param refFile a perfect-size array of Strings representing VALID file lines or uninitialized 
   *   values only, containing the reference file
   * @param compareFile a perfect-size array of Strings representing VALID file lines or uninitialized 
   *   values only, containing the file to be compared to the reference
   * @return the percent of values in compareFile which do NOT match the values in refFile, between
   *   0.0 (exactly the same file) and 1.0 (none of the lines match)
   */
  public static double percentDiff(String[] refFile, String[] compareFile) {
    // 3. TODO: complete the implementation of this method
    
    return -1; // default return statement, feel free to change.
  }
  
  // Checkpoint: MAKE SURE TO SAVE YOUR SOURCE FILE (Ctrl/Cmd + S) 
  
  //////PART 2: Compactness

  /**
   * Tester method that verifies the behavior of the isCompact() method defined below.
   * We strongly recommend implementing this FIRST to understand the intended behavior!
   * 
   * @return true if the method behaves correctly, false otherwise
   */
  public static boolean testIsCompact() {
    // 4. TODO: using these two perfect-size arrays of length 10, add permissible values for the 
    //    contents of a file such that the first array is compact and the second is not

    String[] compact;    // update to contain a COMPACT array of length 10
    String[] notCompact; // update to contain a NON-COMPACT array of length 10

    // 5. TODO: verify that isCompact() correctly returns true for the compact array and false for the
    //    notCompact array

    return false; // default return statement, feel free to change.
  }

  /**
   * Verifies whether a provided array is considered to be COMPACT.
   * 
   * The value null is the default value for a String and represents an uninitialized value.
   * Null lines are not permitted, though empty ("") lines are fine.
   * 
   * @param hand a perfect-size array of Strings representing VALID file lines or
   *   uninitialized values only
   * @return true if and only if the provided perfect-size array is compact, false otherwise
   */
  public static boolean isCompact(String[] fileContents) {
    // 6. TODO: complete the implementation of this method

    return false; // default return statement, feel free to change.
  }

  // Checkpoint: MAKE SURE TO SAVE YOUR SOURCE FILE (Ctrl/Cmd + S) 
  
  /**
   * PROVIDED: this method calls the tester methods above and displays their results to the console.
   * This method is not tested and may be modified as you wish.
   * 
   * @param args unused
   */
  public static void main(String[] args) {
    System.out.println("Diff check test: "+testPercentDiff());
    System.out.println("Compactness test: "+testIsCompact());
  }

}
