public class TASK12repeatSeparator {
    public static void main(String[] args) {

        System.out.println(TASK12repeatSeparator("Word", "X", 3));   // WordXWordXWord
        System.out.println(TASK12repeatSeparator("This", "And", 2));  //
        System.out.println(TASK12repeatSeparator("This", "And", 1));  //
    }

    public static String TASK12repeatSeparator(String word, String sep, int count) {
        String result = "";

        for (int i = 0; i < count; i++) {
            result += word;

            if (i < count - 1) {
                result += sep;
            }
        }

        return result;
    }
}