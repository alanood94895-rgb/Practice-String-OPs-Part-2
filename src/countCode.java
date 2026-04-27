public class countCode {
        public static void main (String[] args){
            System.out.println(TASK4countCode ("aaacodebbb")); //1
            System.out.println(TASK4countCode ("codexxcode"));  //2
            System.out.println(TASK4countCode ("cozexxcope"));//2

        }
        public static int TASK4countCode(String str) {
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

