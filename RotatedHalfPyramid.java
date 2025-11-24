package Patterns;
import java.util.*;
public class RotatedHalfPyramid {
    

    public static void main(String[] args) {
        Scanner st= new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=st.nextInt();
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();

        }
        st.close();
            
            
        }


        
        
    }
    

