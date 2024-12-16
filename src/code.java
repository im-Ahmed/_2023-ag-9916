public class code {
    public static void main(String[] args) {
        String input = "hello world! java is fun.";
        String capitalized = capitalizeEachWord(input);
        System.out.println("Original String: " + input);
        System.out.println("Capitalized String: " + capitalized);
    }

    public static String capitalizeEachWord(String str) {
        // Split the string into words using spaces as a delimiter
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        // Iterate through each word
        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize the first character of each word and append it
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            } else {
                // Append spaces if the word is empty (for extra spaces in the input)
                result.append(" ");
            }
        }

        // Trim any extra space at the end and return the result
        return result.toString().trim();
    }
}
