import java.util.Scanner;

public class ptBacNhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();
        if (a != 0){
            double answer = -b/a;
            System.out.println("Equation pass with x = " + answer);
        }else {
            System.out.println("No solution!");
        }
    }
}
