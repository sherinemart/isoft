class Arith
{
 public static void main(String args[])
 {
  try
{

  int a=10;
  int b=0;
  int c=a/b;
}catch(ArithmeticException e)
{
 System.out.println("You cannot divide anynumber by zero. Try again !");
}
  System.out.println("Rest of the code");
}
}