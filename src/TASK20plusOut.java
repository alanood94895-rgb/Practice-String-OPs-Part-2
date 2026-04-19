public class TASK20plusOut {
    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy"));         // ++xy++
        System.out.println(plusOut("12xy34", "1"));          //
        System.out.println(plusOut("12xy34xyabcxy", "xy"));  //

    }

    public static String plusOut(String str, String word) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); ) {

            if (i <= str.length() - word.length() &&
                    str.substring(i, i + word.length()).equals(word)) {

                result.append(word);
                i += word.length();

            } else {
                result.append('+');
                i++;
            }
        }

        return result.toString();
    }
}
