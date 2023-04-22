package GroupProject2DArrays;

public class Task3 {
    public static void main(String[] args) {
        /*
        Create a 2D array or integer type where you will store
        odd and even numbers. Develop a program which will
        identify/print the even numbers only.
         */
        int[][] arr = {
                {10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}

        };
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                int element = arr[row][column];
                if (element % 2 == 0) {
                    System.out.println(element);
                }
            }
        }
    }
}
