import java.util.Scanner;

public class Calculator {
    public int a;
    public int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void addition() { System.out.println(a + b); }

    public void multiplication() { System.out.println(a * b); }

    public void subtraction() { System.out.println(a - b); }

    public void division() {
        System.out.println(a / b);
    }

    public void square(){
        System.out.println(a * a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a = ");
        int a = scanner.nextInt();
        System.out.print("Enter b = ");
        int b = scanner.nextInt();

        Calculator calc = new Calculator(a, b);

        calc.addition();
        calc.multiplication();
        calc.subtraction();
        calc.division();
        calc.square();
    }
}
