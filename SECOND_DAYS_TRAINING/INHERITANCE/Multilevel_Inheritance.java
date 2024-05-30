package SECOND_DAYS_TRAINING.INHERITANCE;
class A {   // <----- PArent Class
    public void Parent(){
        System.err.println("Parent Class");
    }
}
class B extends A{ // <----- First Child Class Extends Parent Class A

    public void Child1(){
        System.err.println("Child1 Class");
    }
}
class C extends B{ // <----- Seconf Child class extends Parent class A

    public void Child2(){
        System.err.println("Child2 class");
    }
}
public class Multilevel_Inheritance {
    
    public static void main(String[] args) {
        
        C Obj = new C();
        Obj.Parent();
        Obj.Child1();
        Obj.Child2();
    }
}
