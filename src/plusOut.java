public class plusOut {
    public static void main(String[] args) {
        System.out.println(TASK20plusOut("12xy34", "xy"));         // ++xy++
        System.out.println(TASK20plusOut("12xy34", "1"));          // 1+++++
        System.out.println(TASK20plusOut("12xy34xyabcxy", "xy"));  // ++xy++xy+++xy

    }

    public static String TASK20plusOut(String str, String word) {
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
