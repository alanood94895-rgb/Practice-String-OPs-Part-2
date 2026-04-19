public class TASK13prefixAgain {
    public static void main(String[] args) {
        System.out.println(TASK13prefixAgain("abXYabc", 1)); // True
        System.out.println(TASK13prefixAgain("abXYabc", 2)); // True
        System.out.println(TASK13prefixAgain("abXYabc", 3)); // False
    }

    public static boolean TASK13prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);

        for (int i = n; i <= str.length() - n; i++) {
            if (str.substring(i, i + n).equals(prefix)) {
                return true;
            }
        }

        return false;
    }
}
