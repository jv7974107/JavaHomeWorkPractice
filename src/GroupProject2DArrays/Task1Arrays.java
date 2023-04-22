package GroupProject2DArrays;

public class Task1Arrays {
    public static void main(String[] args) {
        /*
        Create a program that uses an array to store a list of
        temperatures for a week, and then uses a loop to find
        the highest and lowest temperature for the week.
        */
        int temp[]={22,32,44,54,67,72,75};
        int lowest=0;
        int highest=temp[0];

        for( int i = 0; i < temp.length; i++){
            if(temp[i]>highest){
                highest=temp[i];

            }else{
                lowest=temp[i];
            }



        }
        System.out.println("The highest temp is  "+highest);
        System.out.println("The lowest temp is "+lowest);
    }
}

