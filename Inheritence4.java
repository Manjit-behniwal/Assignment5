/* To show whether static method can be inherited or not.

The output of the following program is

"Inside static method of superclass"

The only difference with inherited static (class) methods 
and inherited non-static (instance) methods is that 
when you write a new static method with the same signature, 
the old static method is not overridden.
 */
package inheritence4;

    class A
{
    public  static void display()
    {
        System.out.println("Inside static method of superclass");
    }
}

class B extends A
{
    public  static void display()
    {
      System.out.println("Inside static method of subclass");  
    }
}
public class Inheritence4 {
    public static void main(String[] args) {
       
        A b = new B();
        b.display();
        
    }
    
}
