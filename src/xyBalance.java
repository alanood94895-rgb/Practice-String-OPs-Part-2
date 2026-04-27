public class xyBalance {
    public static void main (String[] args){
        System.out.println(TASK8xyBalance ("aaxbby"));  //True
        System.out.println(TASK8xyBalance ("aaxbb"));   //False
        System.out.println(TASK8xyBalance ("yaaxbb"));  //False

    }
    public static boolean TASK8xyBalance(String str) {
        boolean Y = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);

            if (c == 'y') {
                Y = true;
            }

            if (c == 'x' && !Y) {
                return false;
            }
        }

        return true;
    }
}
