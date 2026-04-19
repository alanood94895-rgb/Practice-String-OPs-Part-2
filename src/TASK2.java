public class TASK2 {
    public static void main(String[] args) {
        System.out.println(TASK2 ("abc hi ho")); // 1
        System.out.println(TASK2("ABChi hi"));  // 2
        System.out.println(TASK2("hihi"));      // 2
    }

    public static int TASK2(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }

        return count;
    }

}
