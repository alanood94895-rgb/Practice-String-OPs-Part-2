public class TASK5endOther {
    public static void main(String[] args) {
        System.out.println(TASK5endOther("Hiabc", "abc"));     // TRUE
        System.out.println(TASK5endOther("AbC", "HiaBc"));     // TRUE
        System.out.println(TASK5endOther("abc", "abXabc"));    //
    }

    public static boolean TASK5endOther(String a, String b) {
        String aLower = a.toLowerCase();
        String bLower = b.toLowerCase();

        return aLower.endsWith(bLower) || bLower.endsWith(aLower);
    }
}