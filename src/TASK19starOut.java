public class TASK19starOut {
    public static void main(String[] args) {
        System.out.println(starOut("ab*cd"));     //
        System.out.println(starOut("ab**cd"));    //
        System.out.println(starOut("sm*eilly"));  //


    }

    public static String starOut(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '*') {
                continue;
            }

            if (i > 0 && str.charAt(i - 1) == '*') {
                continue;
            }

            if (i < str.length() - 1 && str.charAt(i + 1) == '*') {
                continue;
            }

            result.append(str.charAt(i));
        }

        return result.toString();
    }
}