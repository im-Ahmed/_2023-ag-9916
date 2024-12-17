public class code {
    public static void main(String[] args) {
        String s = "babad"; // Example input
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return ""; // Handle edge case
        int start = 0, end = 0;

        // Iterate through every character as a potential center
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);       // Odd length palindrome
            int len2 = expandAroundCenter(s, i, i + 1);   // Even length palindrome
            int len = Math.max(len1, len2);               // Find the max length

            // Update the start and end pointers if we found a longer palindrome
            if (len > (end - start)) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1); // Extract the longest palindromic substring
    }

    // Expand around the center and return the length of the palindrome
    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;


        }
        System.out.println(right-left-1);
        return right - left - 1; // Length of the palindrome
    }
}
