package SECOND_DAYS_TRAINING.INHERITANCE;
class A{
    public void parent(){
        System.err.println("I am Parent :");
    }
}
class B extends A{ // <--  First Child Extends Parents Property 

    public void Child1(){
        System.err.println("First Child");
    }
}
class C extends A{  // <--  second Child Also extends Parents Property 

    public void Child2(){
        System.err.println("Second Child ");
    }
}
public class Hierarchical_Inheritance {

    public static void main(String[] args) {
        
        B Obj = new B();
        Obj.parent();      // First Child Access Parents Properties 
        Obj.Child1();
    }
    
}
