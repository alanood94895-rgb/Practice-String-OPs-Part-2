public class TASK16sameStarChar {
    public static void main(String[] args) {
        System.out.println(TASK16sameStarChar("xy*yzz"));   // True
        System.out.println(TASK16sameStarChar("xy*zzz"));   // False
        System.out.println(TASK16sameStarChar("*xa*az"));   // True
    }

    public static boolean TASK16sameStarChar(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {

                // Check boundaries (must have left and right chars)
                if (i == 0 || i == str.length() - 1) {
                    return false;
                }

                char left = str.charAt(i - 1);
                char right = str.charAt(i + 1);

                if (left != right) {
                    return false;
                }
            }
        }

        return true;
    }
}
