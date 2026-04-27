public class bobThere {
    public static void main (Integer[] args){
        System.out.println(TASK7bobThere ("abcbob"));//TRUE
        System.out.println(TASK7bobThere ("b9b"));//TRUE
        System.out.println(TASK7bobThere ("bac"));//FALSE

    }
    public static boolean TASK7bobThere(String str) {

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }

        return false;
    }
}
