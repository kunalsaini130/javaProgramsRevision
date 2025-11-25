package Patterns;
import java.util.*;
public class FloydTraiangle {
    public static void main(String[] args) {
        
        Scanner st= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=1;
        int num= st.nextInt();
        for(int i=1; i<=num; i++){

            for(int j=1; j<=i;j++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();


        }

        st.close();
    }
    
}
