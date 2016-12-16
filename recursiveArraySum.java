import java.util.Arrays;

class recursiveArraySum {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        System.out.println(recursiveFn(arr));

    }

    public static int recursiveFn(int[] arr) {

        // if array has one and only one member, return the value
        if (arr.length == 1) {
            return arr[0];
        // else return the sum of current member in position 0
        // and all later indices.
        } else {
            return arr[0] + recursiveFn(Arrays.copyOfRange(arr, 1, arr.length));
        }
    }
}