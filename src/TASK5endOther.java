public class TASK5endOther {
    public static void main(String[] args) {
        System.out.println(TASK5endOther("Hiabc", "abc"));     // true
        System.out.println(TASK5endOther("AbC", "HiaBc"));     // true
        System.out.println(TASK5endOther("abc", "abXabc"));    // true
    }

    public static boolean TASK5endOther(String a, String b) {
        String aLower = a.toLowerCase();
        String bLower = b.toLowerCase();

        return aLower.endsWith(bLower) || bLower.endsWith(aLower);
    }
}