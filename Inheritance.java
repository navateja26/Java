-------SINGLE INHERITANCE-------

class A  
{
	double length;
	double breadth;
	}
public class B extends A
{
        double area;
	void area()
	{
		
		area=length*breadth;
		System.out.println("area is:"+area);
		
	}
	public static void main(String[] args)
	{
		 B b=new B();
		 b.length=12.6;
		 b.breadth=15;
		 b.area();
		 	
	}
	
}


-------MULTILEVEL INHERITANCE---------

 class Parent
 {
     void m1()
     {
         System.out.println("parent");
     }
 }
 class Child extends Parent
 {
     void m2()
     {
         System.out.println("Child");
     }
 }
 class Grandchild extends Child
 {
     void m3()
     {
         System.out.println("Grand Child");
     }
 }
 public class Multilevel
 {
     public static void main(String[] args)
     {
         Grandchild g=new Grandchild();
         g.m1();
         g.m2();
         g.m3();
     }
 }


-------HIERARCHIAL INHERITANCE---------


class Phone
{
    void model()
    {}
    
}
class Iphone extends Phone
{
    void model()
    {
        System.out.println("Iphone");
    }
}
class Oneplus extends Phone
{
    void model()
    {
        System.out.println("One Plus");
    }
}
public class Hierarchial
{
    public static void main(String[] args)
    {
        Iphone i=new Iphone();
        Oneplus o=new Oneplus();
        i.model();
        o.model();
    }
}


---------MULTIPLE INHERIANCE(USING INTERFACE)----------

interface A
{
    void m1();
}
interface B
{
    void m2();
    
}
public class C implements A,B
{
    public void m1()
     {
         System.out.println("m1 method");
     }
    public void m2()
     {
         System.out.println("m2 method");
     }
     public static void main(String[] args)
     {
         C c=new C();
         c.m1();
         c.m2();
     }
}