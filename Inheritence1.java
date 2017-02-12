/*
 * To write a program to show multiple inheritance.*/

Sol.

//WE can implement multiple inheritence by using interface concept.
 
package inheritence1;

interface printer
{
void print();
}
interface scanner
{
void scan();
}
class hpdevices implements printer,scanner
{
    public void print()
    {
        System.out.println(" this is hpprinter");
        
    }
    public void scan()
    {
        System.out.println(" this is hp scanner");
        
    }
}


public class Inheritence1 {

    
    public static void main(String[] args) {
        printer p1 = new hpdevices();
        p1.print();
        scanner s1 = new hpdevices();
        s1.scan();
    }
    
}
