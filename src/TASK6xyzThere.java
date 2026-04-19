public class TASK6xyzThere {
        public static void main(String[] args) {
            System.out.println(TASK6xyzThere("abcxyz"));       //True
            System.out.println(TASK6xyzThere("abc.xyz"));      //False
            System.out.println(TASK6xyzThere("xyz.abcxyz"));   //True
        }

        public static boolean TASK6xyzThere(String str) {

            for (int i = 0; i < str.length() - 2; i++) {
                if (str.substring(i, i + 3).equals("xyz")) {

                    if (i == 0 || str.charAt(i - 1) != '.') {
                        return true;
                    }
                }
            }

            return false;
        }
    }

