public class repeatEnd {
    public static void main(String[] args) {
        System.out.println(TASK10repeatEnd("Hello", 3));  // llollollo
        System.out.println(TASK10repeatEnd("Hello", 2));   // lolo
        System.out.println(TASK10repeatEnd("abc", 1));    // c
    }

    public static String TASK10repeatEnd(String str, int n) {
        String end = str.substring(str.length() - n);
        String result = "";

        for (int i = 0; i < n; i++) {
            result += end;
        }

        return result;
    }
}