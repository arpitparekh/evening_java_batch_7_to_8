package programs;

public class SeachInsideArray {

  public static void main(String[] args) {

    // linear search
    // time // space
    // O(n) // O(1)

    // algorithm optimization
    // binary search
    // time // space

    int[] arr = { 4, 5, 6, 5, 4, 43, 5, 6, 8, 8, 5, 4, 4 };

    int val = 55;

    boolean found = false;

    for (int i : arr) {
      if (i == val) {
        found = true;
        break;
      }
    }

    if (found) {
      System.out.println("Found");
    } else {
      System.out.println("Not Found");
    }

  }

}
