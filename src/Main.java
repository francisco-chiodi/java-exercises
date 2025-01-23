public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("numbers is = " + sumArray(numbers));
    }
public static int sumArray(int [] arr ) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
}
}