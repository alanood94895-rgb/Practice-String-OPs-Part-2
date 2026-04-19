public class TASK8xyBalance {
    public static void main (String[] args){
        System.out.println(TASK8xyBalance ("aaxbby"));  //TRUE
        System.out.println(TASK8xyBalance ("aaxbb"));   //
        System.out.println(TASK8xyBalance ("yaaxbb"));  //

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
