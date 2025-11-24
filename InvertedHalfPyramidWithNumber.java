package Patterns;
import java.util.*;
public class InvertedHalfPyramidWithNumber {
    public static void main(String[] args) {
        
    

    Scanner st=new Scanner(System.in);
    
    System.out.print("Enter the  number: ");
    int num=st.nextInt();

    for(int i=num; i>=1; i--){
        for(int j=1; j<=i; j++){
            System.out.print(j);
        }
        System.out.println("");
    }



    st.close();
}
}
