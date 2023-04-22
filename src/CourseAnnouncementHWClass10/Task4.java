package CourseAnnouncementHWClass10;

public class Task4 {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum = 0;
        for (int a = 0; a < numbers.length; a++) {
            for (int b = 0; b < numbers[a].length; b++) {

            }

            int[] arr = numbers[a];
            for (int c = 0; c < arr.length; c++) {
                sum = sum + arr[c];

            }

        }
        System.out.println("Sum = "+sum);

    }
}
