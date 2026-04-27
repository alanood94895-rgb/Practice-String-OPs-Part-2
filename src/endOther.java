public class endOther {
    public static void main(String[] args) {
        System.out.println(TASK5endOther("Hiabc", "abc"));     //True
        System.out.println(TASK5endOther("AbC", "HiaBc"));     //True
        System.out.println(TASK5endOther("abc", "abXabc"));    //True
    }

    public static boolean TASK5endOther(String a, String b) {
        String aLower = a.toLowerCase();
        String bLower = b.toLowerCase();

        return aLower.endsWith(bLower) || bLower.endsWith(aLower);
    }
}