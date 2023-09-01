public class StringReverse {
    public static void main(String[] args) {
        String s = "abc";
        String reversed = reverseString(s);
        
        System.out.println(reversed);
    }

    public static String reverseString(String s) {
        char[] charArray = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }

        return new String(charArray);
    }
}