import java.util.*;
public class IfElse {
    public static void main(String[] args) {
        Scanner st= new Scanner(System.in);
        System.out.print("Enter the number ");
        int age= st.nextInt();

        if(age<=17){
            System.out.print("under age");
        }
        else{
            System.out.println("Adolt");
        }
        st.close();
        
    }
    
}
