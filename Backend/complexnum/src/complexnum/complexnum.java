class Complex {

 double real, imaginary;

 Complex(double r, double i) {

 this.real = r;

 this.imaginary = i;

 }

 public static Complex add(Complex c1, Complex c2) {

 Complex temp = new Complex(0, 0);

 temp.real = c1.real + c2.real;

 temp.imaginary = c1.imaginary + c2.imaginary;

 return temp;

 }

}

public class ComplexNum {

 public static void main(String[] args) {

 Complex c1 = new Complex(4.5, 5);

 Complex c2 = new Complex(2.5, 3.5);

 Complex temp = Complex.add(c1, c2);

 System.out.println(“Sum = ” + temp.real + ” + ” + temp.imaginary + “i”);

 }

}