public class TASK18zipZap {
        public static void main(String[] args) {
            System.out.println(zipZap("zipXzap"));     // zpXzp
            System.out.println(zipZap("zopzop"));      // zpzp
            System.out.println(zipZap("zzzopzop"));    // zzzpzp
            System.out.println(zipZap("Zeldazipzap")); // Zeldazpzp
        }

        public static String zipZap(String str) {
            String result = "";

            for (int i = 0; i < str.length(); i++) {

                // Check for "z?p" pattern
                if (i < str.length() - 2 &&
                        str.charAt(i) == 'z' &&
                        str.charAt(i + 2) == 'p') {

                    // skip middle character
                    result += "zp";
                    i += 2; // jump past pattern
                } else {
                    result += str.charAt(i);
                }
            }

            return result;
        }
    }

