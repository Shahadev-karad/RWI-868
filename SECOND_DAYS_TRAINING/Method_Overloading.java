package SECOND_DAYS_TRAINING;

class Perfoming_Method_Overloading{

    public int Fun(int a, int b){
        return a + b ;
    }
    public String Fun(String a, String b){
        return a + "," + b ;
    }
}
public class Method_Overloading {
    
    public static void main(String[] args) {
        Perfoming_Method_Overloading Obj = new Perfoming_Method_Overloading();
        System.err.println(Obj.Fun(10, 10));
        System.err.println(Obj.Fun("Rocky", "Salman"));

    }
}
