import java.util.*;
public class ElseIf {
    public static void main(String[] args) {
        Scanner st= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=st.nextInt();

        if(num<=10){
            System.out.println(" Number between 1 to 10");

        }
        else if(num<=20)
        {
            System.out.println("Nmber between 10 to 20");
        }
        else{
            System.out.println("Number is grater the 20");
        }
        st.close();
    
}
    
}
