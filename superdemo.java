class A
  {
    int l,b;
    A()
   {
     l=10;
     b=20;
   }
}
class B extends A
{
  int h;
  B()
  {
   super();
   h=30;
  }
int volume()
  {
     return l*b*h;
  }
}
class superdemo
{
   public static void main(String args[])
   {
     B b1=new B();
     int r=b1.volume();
     System.out.println("The vol. is: "+r);
   }
}

