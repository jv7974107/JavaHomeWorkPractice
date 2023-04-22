package CourseAnnouncementHWClass10;

public class Task3 {
    public static void main(String[] args) {
        String[][] grocery = {{"Cucumber", "Avocado", "Cilantro"},
                {"Apple", "Pear", "Bananas"},
                {"Milk", "Cheese", "Yogurt"},
                {"Ice Cream", "Coca Cola", "Candy"}
        };
        for (int i = 0; i < grocery.length; i++) {
            for (int j = 0; j < grocery[i].length; j++) {
                System.out.print(grocery[i][j] + " ");



            }
            System.out.println();
        }
        System.out.println();

        for (String[] food : grocery) {
            for (String items : food) {
                System.out.print(items + " ");
            }
            System.out.println();
        }

    }
}

