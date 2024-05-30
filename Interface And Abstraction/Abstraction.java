abstract class Cars{

    abstract void Status();
}
class Nexon extends Cars {
    void Status() {
        System.err.println(" Running ");
    }
}
class Thar extends Cars {
    void Status(){
        System.err.println(" Stoped ");
    }
}
public class Abstraction {
     
    public static void main(String[] args) {
        
        Cars Obj = new Thar();

        Obj.Status();
    }
}
