public class TASK18zipZap {
        public static void main(String[] args) {
            System.out.println(zipZap("zipXzap"));     //zpXzp
            System.out.println(zipZap("zopzop"));      //zpzp
            System.out.println(zipZap("zzzopzop"));    //
        }

        public static String zipZap(String str) {
            String result = "";

            for (int i = 0; i < str.length(); i++) {

                if (i < str.length() - 2 &&
                        str.charAt(i) == 'z' &&
                        str.charAt(i + 2) == 'p') {

                    result += "zp";
                    i += 2;
                } else {
                    result += str.charAt(i);
                }
            }

            return result;
        }
    }

