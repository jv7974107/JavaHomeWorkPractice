package GroupProject2DArrays;

public class Task6 {
    public static void main(String[] args) {
        /*
        Write a java program to check whether a given
        number is prime or not?
         */
        int num = 23;
        int count = 0;
        for (int i = 1; i <=num ; i++) {
            if(num%i==0){
                count++;
            }
        }if(count==2){
            System.out.println(num +" is a Prime number ");
        }
        else{
            System.out.println(num+" is not a prime number ");
        }


    }

}
