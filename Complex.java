public class Complex
{
  double real;
  double imaginary;

  public Complex(double realPart, double imaginaryPart)
  {
    setComplex(realPart, imaginaryPart);
  }
  public Complex(double realPart)
  {
    setComplex(realPart, 0);
  }
  public Complex()
  {
    setComplex(0, 0);
  }
  public void setComplex(double realPart, double imaginaryPart)
  {
    this.realPart = realPart;
    this.imaginary = imaginary;
  }
  public void setComplex(double realPart)
  {
    this.realPart = realPart;
    this.imaginary = 0;
  }
  public void setComplex()
  {
    this.realPart = 0;
    this.imaginary = 0;
  }
/*public equals()
  {

  }
  public toString()
  {

  }
  public static add(complex,complex)
  {

  }
  public static subtraction(complex,complex)
  {

  }
  public static mutliplaction(complex,complex)
  {

  }*/

}
class ComplexDriver
{
  public static void main(String [] args)
  {
    Complex c1 = new Complex(3,9);
    Complex c2 = new Complex(5);
    Complex c3 = new Complex();



  }
}
