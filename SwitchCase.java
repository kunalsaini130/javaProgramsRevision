import java.util.*;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner st= new Scanner(System.in);
        System.out.print("Enter the frist number: ");
        int num1=st.nextInt();

        System.out.print("Enter the second number: ");
        int num2=st.nextInt();

        System.out.print("Enter the operator (+, -, *, /): ");
        char op=st.next().charAt(0);

        switch (op) {
            case '+':
            System.out.println("Addition is "+(num1+num2) );
                
                break;
            case '-':
            System.out.println("Substraction is: "+ (num1-num2));
            break;

            case '*':
            System.out.println("Multiplication is "+(num1*num2));
            break;

            case '|':

            if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
        } else {
            System.out.println("Cannot divide by zero!");
        }
        break;

            default:
            System.out.println("Invalid number");
                break;
        }
        st.close();
    
}
    
}
