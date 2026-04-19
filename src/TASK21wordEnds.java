public class TASK21wordEnds {
    public static void main(String[] args) {
        System.out.println(TASK21wordEnds("abcXY123XYijk", "XY")); //c13i
        System.out.println(TASK21wordEnds("XY123XY", "XY"));       //13
        System.out.println(TASK21wordEnds("XY1XY", "XY"));         //11

    }

    public static String TASK21wordEnds(String str, String word) {
        StringBuilder result = new StringBuilder();
        int len = word.length();

        for (int i = 0; i <= str.length() - len; i++) {

            if (str.substring(i, i + len).equals(word)) {

                if (i - 1 >= 0) {
                    result.append(str.charAt(i - 1));
                }

                if (i + len < str.length()) {
                    result.append(str.charAt(i + len));
                }
            }
        }

        return result.toString();
    }
}
