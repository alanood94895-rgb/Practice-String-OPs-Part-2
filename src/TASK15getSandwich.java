public class TASK15getSandwich {
    public static void main(String[] args) {
        System.out.println(TASK15getSandwich("breadjambread"));        //
        System.out.println(TASK15getSandwich("xxbreadjambreadyy"));    //
        System.out.println(TASK15getSandwich("xxbreadyy"));            // ""
    }

    public static String TASK15getSandwich(String str) {
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");

        // Need at least two "bread"
        if (first == -1 || first == last) {
            return "";
        }

        return str.substring(first + 5, last);
    }
}
