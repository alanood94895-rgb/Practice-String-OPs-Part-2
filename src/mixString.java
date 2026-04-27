public class mixString {
        public static void main(String[] args) {
            System.out.println(TASK9mixString("abc", "xyz"));     // axbycz
            System.out.println(TASK9mixString("Hi", "There"));    // HTihere
            System.out.println(TASK9mixString("a", "bcd"));      // abcd
        }

        public static String TASK9mixString(String a, String b) {
            String result = "";
            int i = 0;

            while (i < a.length() || i < b.length()) {

                if (i < a.length()) {
                    result += a.charAt(i);
                }
                if (i < b.length()) {
                    result += b.charAt(i);
                }

                i++;
            }
            return result;
        }
    }

