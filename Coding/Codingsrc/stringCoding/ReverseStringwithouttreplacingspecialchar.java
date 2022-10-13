package stringCoding;

public class ReverseStringwithouttreplacingspecialchar {
    public static void main(String[] args) {
        System.out.println(solve("ab=cd+ef"));
        System.out.println(solve("asjkag**=cdcagbk//+ef"));
        System.out.println(solve("**//*++*"));
        System.out.println(solve("abcgd"));
    }

    public static String solve(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        String[] s = new String[str.length()];
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (!(Character.isLetter(str.charAt(left)))) {
                left++;
            } else if (!Character.isLetter(str.charAt(right))) {
                right--;
            } else {
                stringBuilder.setCharAt(left, str.charAt(right));
                stringBuilder.setCharAt(right, str.charAt(left));
                left++;
                right--;
            }
        }
        // System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }
}
