public class TASK13xyzMiddle {
    public static void main(String[] args) {
        System.out.println(TASK13xyzMiddle("abXYabc", 1)); // TRUE
        System.out.println(TASK13xyzMiddle("abXYabc", 2)); // TRUE
        System.out.println(TASK13xyzMiddle("abXYabc", 3)); // FALSE
    }

    public static boolean TASK13xyzMiddle(String str, int n) {
        String prefix = str.substring(0, n);

        for (int i = n; i <= str.length() - n; i++) {
            if (str.substring(i, i + n).equals(prefix)) {
                return true;
            }
        }

        return false;
    }
}
