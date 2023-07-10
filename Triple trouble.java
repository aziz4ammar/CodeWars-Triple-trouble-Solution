public class Kata {
    public static int TripleDouble(long num1, long num2) {
        String str1 = Long.toString(num1);
        String str2 = Long.toString(num2);

        for (int i = 0; i <= 9; i++) {
            if (str1.contains(String.valueOf(i) + String.valueOf(i) + String.valueOf(i))
                    && str2.contains(String.valueOf(i) + String.valueOf(i))) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        // Example usage
        long num1 = 451999277L;
        long num2 = 41177722899L;
        int result = TripleDouble(num1, num2);
        System.out.println(result);
    }
}