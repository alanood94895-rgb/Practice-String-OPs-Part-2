public class oneTwo {
    public static void main(String[] args) {
        System.out.println(oneTwo("abc"));       // bca
        System.out.println(oneTwo("tca"));       // cat
        System.out.println(oneTwo("tcagdo"));    //catdog
    }

    public static String oneTwo(String str) {
        String result = "";

        for (int i = 0; i < str.length() - 2; i += 3) {
            String group = str.substring(i, i + 3);

            result += group.substring(1) + group.charAt(0);
        }

        return result;
    }

}
