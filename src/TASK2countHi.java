public class TASK2countHi {
    public static void main(String[] args) {
        System.out.println(TASK2countHi ("abc hi ho")); //
        System.out.println(TASK2countHi("ABChi hi"));  //
        System.out.println(TASK2countHi("hihi"));      //
    }

    public static int TASK2countHi(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }

        return count;
    }

}
