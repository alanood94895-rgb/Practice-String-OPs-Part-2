public class TASK1 {
    public static void main (String[] args){
        System.out.println(TASK1("abc"));     // aabbcc
    }

    public static String TASK1 (String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            // Repeat each character twice
            result += str.charAt(i);
            result += str.charAt(i);
        }

        return result;

    }
}
