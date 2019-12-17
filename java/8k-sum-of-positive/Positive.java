public class Positive {
    public static int sum(int[] arr){

        int sum = 0;
        for (int value : arr) {
            if (value > 0) {
                sum += value;
            }
        }
        return sum;
    }
}
