package com.rameshify.coding.leetcode;

/**
 * Leet Code #3: Longest Substring Without Repeating Characters
 *
 * @author Ramesh Sakibanda
 * @see <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters">Longest Substring Without Repeating Characters</a>
 */
public class LongestSubstringWithoutRepeatingCharacters {

  public int lengthOfLongestSubstring(String s) {
    int length = s.length();
    int max = 0;
    // track beginning of each window
    int start = 0;
    // track if substring is unique
    boolean[] tracker = new boolean[128];
    // iterate the String
    for (int index = 0; index < length; index++) {
      char a = s.charAt(index);
      // if this char is not in substring, add it
      if (!tracker[a]) {
        tracker[a] = true;
      } else {// we found a duplicate character
        max = Math.max(max, index - start);
        // move the duplicate char outside the window.
        int nextStart = start;
        while (nextStart < index) {
          char c = s.charAt(nextStart);
          // the culprit is found, stop loop.
          if (c == a) {
            start = nextStart + 1;
            break;
          }
          // de-mark all other characters
          tracker[c] = false;
          nextStart++;
        }
      }
    }
    return Math.max(max, length - start);
  }

  public static void main(String[] args) {
    LongestSubstringWithoutRepeatingCharacters withoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
    System.out.println(withoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
    System.out.println(withoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb"));
    System.out.println(withoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew"));
    System.out.println(withoutRepeatingCharacters.lengthOfLongestSubstring(" "));
    System.out.println(withoutRepeatingCharacters.lengthOfLongestSubstring(" a abc abcd a "));
    System.out.println(withoutRepeatingCharacters.lengthOfLongestSubstring("dvdf"));
  }
}
