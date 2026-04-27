public class doubleChar {
    public static void main (String[] args){
        System.out.println(doubleChar("abc"));     // aabbcc
    }

    public static String doubleChar (String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            // Repeat each character twice
            result += str.charAt(i);
            result += str.charAt(i);
        }

        return result;

    }
}
