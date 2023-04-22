package GroupProject2DArrays;

public class Task10 {
    public static void main(String[] args) {
        /*
        Write a program to print out duplicate elements from
        an Array of Strings?
         */
        String grades[]={"A","B","C","C","A","D"};

        for(int i=0;i< grades.length;i++){
            for(int j=1+i;j<grades.length;j++){
                if(grades[i]==grades[j]){
                    System.out.println(grades[i]);
                }
            }
        }




    }
}