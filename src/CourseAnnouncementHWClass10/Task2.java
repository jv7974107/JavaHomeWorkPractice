package CourseAnnouncementHWClass10;

public class Task2 {
    public static void main(String[] args) {
        String[][] cars={{"American","German","Korean","Italian"},
                {"Cadillac","Audi","Hyundai","Lamborghini"}};
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {

                System.out.print(cars[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();


        for (String[] car:cars){
            for(String make:car){
                System.out.print(make+" ");
            }
            System.out.println();
        }


    }
}
