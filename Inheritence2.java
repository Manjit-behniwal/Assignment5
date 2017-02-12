/*

2. How do you restrict a member of a class from inheriting to it’s sub classes.?

Sol. 
We can restrict a member of a class from inheriting to it's sub classes by providing private specifier to given member.

In the following program
 print() has private access in printer p1.print();
 */
package inheritence2;
 class printer
{
 private void print();
}

class hpdevices extends printer
{
    public void print()
    {
        System.out.println(" this is hpprinter");
        
    }
    
}


public class Inheritence2 {

    
    public static void main(String[] args) {
        printer p1 = new hpdevices();
        p1.print();
        
    }
    
}

