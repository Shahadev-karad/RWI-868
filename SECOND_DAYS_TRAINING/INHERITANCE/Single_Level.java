// ----------------- Single Level Inheritance in Java -----------------------------

package SECOND_DAYS_TRAINING.INHERITANCE;

class A {   // <------ Parent Class A

    public void Parent(){     // <------ Parent Class Method 

        System.err.println("Parent Class A");
    }
}
class B extends A { // <------ Child Class B Extends Parent Class A

    public void Child(){  // <------ Child Class Method 

        System.err.println("Child Class B");
    }
}

public class Single_Level {
    public static void main(String[] args) {
        B Obj = new B();
        Obj.Parent();
        Obj.Child();
        

    }
}
