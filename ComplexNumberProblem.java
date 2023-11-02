import java.util.Scanner;

public class ComplexNumberProblem {
    private int real;
    private int imaginary;

    public ComplexNumberProblem(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void plus(ComplexNumberProblem c2) {
        this.real = (this.real + c2.real);
        this.imaginary = (this.imaginary + c2.imaginary);
    }

    public void multiply(ComplexNumberProblem c2) {
        int temp = this.real;
        this.real = (this.real * c2.real) - (this.imaginary * c2.imaginary);
        this.imaginary = temp * c2.imaginary + this.imaginary * c2.real;
    }

    public void print() {
        System.out.println(this.real + " + " + "i" + this.imaginary);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int real1 = s.nextInt();
        int imaginary1 = s.nextInt();

        int real2 = s.nextInt();
        int imaginary2 = s.nextInt();
        ComplexNumberProblem c1 = new ComplexNumberProblem(real1, imaginary1);
        ComplexNumberProblem c2 = new ComplexNumberProblem(real2, imaginary2);

        int choice = s.nextInt();
        s.close();

        if (choice == 1) {
            c1.plus(c2);
            c1.print();
        } else if (choice == 2) {
            c1.multiply(c2);
            c1.print();
        } else {
            return;
        }

    }

}
