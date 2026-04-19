public class TASK14xyzMiddle {
    public static void main(String[] args) {
        System.out.println(TASK14xyzMiddle("AAxyzBB"));   //
        System.out.println(TASK14xyzMiddle("AxyzBB"));    //
        System.out.println(TASK14xyzMiddle("AxyzBBB"));   // FALSE
    }

    public static boolean TASK14xyzMiddle(String str) {
        int n = str.length();

        for (int i = 0; i <= n - 3; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {

                int left = i;
                int right = n - (i + 3);

                if (Math.abs(left - right) <= 1) {
                    return true;
                }
            }
        }

        return false;
    }

}
