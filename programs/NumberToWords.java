package programs;

public class NumberToWords {

  public static void main(String[] args) {

    int n = 11;
    int dup = n;

    if (n == 0) {
      System.out.println("Zero");
    }

    // Words for numbers 0 to 19
    String[] units = {  // 20
        "", "One", "Two", "Three",
        "Four", "Five", "Six", "Seven",
        "Eight", "Nine", "Ten", "Eleven",
        "Twelve", "Thirteen", "Fourteen", "Fifteen",
        "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    // Words for numbers multiple of 10
    String[] tens = {   // 10
        "", "", "Twenty", "Thirty", "Forty",
        "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    String words = "";

    int count = 0;  // no of digit

    while (n != 0) {
      count++;
      n = n / 10;

    }

    if (count == 3) {  // 352
      int num = dup / 100;  // 3
      words = words + units[num] + " Hundred ";  // 3 hundred

      int lastTwo = (dup % 100);  // 52
      if (lastTwo > 20) {

        int tensDigit = lastTwo / 10;  // 5
        words = words + tens[tensDigit] + " ";  // 50
        int lastDigit = lastTwo % 10;  // 2
        words = words + units[lastDigit];  // 52

      } else {
        words = words + units[lastTwo];
      }

    } else {

      int lastTwo = (dup % 100); // 11

      if (lastTwo > 20) {

        int tensDigit = lastTwo / 10; // 5
        words = words + tens[tensDigit] + " "; // 50
        int lastDigit = lastTwo % 10; // 2
        words = words + units[lastDigit]; // 52

      } else {
        words = words + units[lastTwo];
      }

    }

    System.out.println(words);

  }

}
