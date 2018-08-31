package tdd.palindrome;

public class Palindrome {

    public static boolean isPalindrome(String word) {
        return word.equalsIgnoreCase(reverseString(word));
    }

    public static String reverseString(String input){
        StringBuilder sb = new StringBuilder();
        char[] charArray = input.toCharArray();
        for(int i = charArray.length - 1; i >= 0; i--){
            sb.append(charArray[i]);
        }
        return sb.toString();
    }
}
