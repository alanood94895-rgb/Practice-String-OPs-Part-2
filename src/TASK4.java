public class TASK4 {
    public static void main (String[] args){
        System.out.println(TASK4 ("aaacodebbb"));
        System.out.println(TASK4 ("codexxcode"));
        System.out.println(TASK4 ("cozexxcope"));

    }
    public static int TASK4(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c'
                    && str.charAt(i + 1) == 'o'
                    && str.charAt(i + 3) == 'e') {
                count++;
            }
        }

        return count;
    }

}
