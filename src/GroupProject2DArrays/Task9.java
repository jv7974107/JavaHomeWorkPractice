package GroupProject2DArrays;

public class Task9 {
    public static void main(String[] args) {
    /*
    Write a java program to find the second largest
    number in the array?
     */

        int num[]={1,2,3,4,5};
        int largest=num[0];
        int secLargest=0;
        for(int i=0; i<num.length; i++){
            if (num[i]>largest){
                secLargest=largest;
                largest=num[i];
            }
            else{
                secLargest=num[i];
            }
        }
        System.out.println(secLargest);

    }
}

