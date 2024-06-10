abstract class shape
{
    final float pi=3.14f;
    abstract void calc_area();
    abstract void calc_volume();  
}
class cone extends shape
{
    float r,h;
    cone(float r1,float h1)
    {
      r=r1;
      h=h1;    
    }
  void calc_area()
  {
     double a=super.pi*r*(r+Math.sqrt(r*r+h*h));
     System.out.println("area of cone ="+a);
  }
  void calc_volume()
  {
    float v=super.pi*(r*r)*(h/3);
    System.out.println("volume of cone ="+v);
  }
}
class cylinder extends shape
{
    float r,h;
    cylinder(float r1,float h1)
    {
      r=r1;
      h=h1;    
    }
  void calc_area()
  {
     float a=(2*super.pi*r*h)+(2*super.pi*r*r);
     System.out.println("area of cylinder ="+a);
  }
  void calc_volume()
  {
    float v=super.pi*r*r*h;
    System.out.println("volume of cylinder ="+v);
  }
  public static void main(String arg[])
  {
    cone ob=new cone(11.4f,23.5f);
    ob.calc_area();
    ob.calc_volume();
    cylinder ob1=new cylinder(11.4f,23.5f);
     ob1.calc_area();
    ob1.calc_volume();
  }
}