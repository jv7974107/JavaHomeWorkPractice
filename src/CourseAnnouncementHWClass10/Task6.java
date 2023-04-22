package CourseAnnouncementHWClass10;

public class Task6 {
    public static void main(String[] args) {
        String [][] arr={
                {"USA","Mexico","Canada"},
                {"Brazil","Argentina","Uruguay"},
                {"Spain","Italy","France"},
                {"China","Cambodia","Laos"},
                {"South Africa","Somalia","Egypt"}

        };
        int totalCountries=0;
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        for (String[] countries: arr) {
            for(String country: countries){
                System.out.print(country+" ");
            }
            System.out.println();
        }
        System.out.println("Total Countries");


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                totalCountries++;

            }

        }
        System.out.println(totalCountries);
    }
}
