import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner st= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=st.nextInt();

        if(num%2==0){
            System.out.println("even");

        }
        else{
            System.out.println("Odd");
        }
        st.close();
    
}
    
}
