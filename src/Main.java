import static java.lang.Math.max;

public class Main{

    public static void main(String [] args) {

        int[] findValueType = {21, 24, 55, 66, 33, 14, 5, 8, 99, 12, 11, 17, 18};

        for (int value : findValueType) {

            if (value % 2 == 0) {
                System.out.println(findValueType + " is even.");
            } else
                System.out.println(findValueType + " is odd.");

        }
    }
    }




/*public class Main{
    public static void main(String [] args){
        int[] values = {10, 20, 30, 40, 50};

        System.out.println("the bigger is = " + findMax(values));

    }

    public static int findMax(int [] array) {
        int max = array [0];

        for (int num : array) {
            max = Math.max(max , num);
        }
        return max;
    }
}
*/

/*public class Main {
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

*/