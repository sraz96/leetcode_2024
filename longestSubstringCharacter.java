
import java.util.HashSet;
import java.util.Set;

public class longestSubstringCharacter {
  public static String longestSubstring(String s) {
      if (s == null || s.length() == 0) {
          return "";
      }

      int start = 0;
      int maxLength = 0;
      String longestSubstring = "";
      Set<Character> uniqueChars = new HashSet<>();

      for (int end = 0; end < s.length(); end++) {
          char c = s.charAt(end);

          while (uniqueChars.contains(c)) {
              uniqueChars.remove(s.charAt(start));
              start++;
          }

          uniqueChars.add(c);

          if (end - start + 1 > maxLength) {
              maxLength = end - start + 1;
              longestSubstring = s.substring(start, end + 1);
          }
      }

      return longestSubstring;
  }

  public static void main(String[] args) {
      System.out.println(longestSubstring("abcabcbb")); // Output: "abc"
      System.out.println(longestSubstring("bbbbb")); // Output: "b"
      System.out.println(longestSubstring("pwwkew")); // Output: "wke"
  }
}