package Patterns;
import java.util.*;

public class HalfPyramidWithNumber {
    public static void main(String arg[]){
        Scanner st=new  Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=st.nextInt();
        

        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        st.close();

    }
    
}
