package leetcode.easy;

/**
 * Created by sudharti on 6/9/17.
 */
public class CountAndSay {
  public String countAndSay(int n) {
    if (n == 1) {
      return "1";
    } else if (n < 1) {
      return "1";
    } else {
      String word = countAndSay(n - 1);
      System.out.println(word);
      StringBuilder builder = new StringBuilder();
      int i, count = 1, len = word.length();
      for (i = 0; i < len - 1; i++) {
        if (word.charAt(i) == word.charAt(i + 1)) {
          count++;
        } else {
          builder.append(count).append(word.charAt(i));
          count = 1;
        }
      }

      builder.append(count).append(word.charAt(i));
      return builder.toString();
    }
  }

  public static void main(String[] args) {
    CountAndSay countAndSay = new CountAndSay();
    System.out.println(countAndSay.countAndSay(7));
  }
}
