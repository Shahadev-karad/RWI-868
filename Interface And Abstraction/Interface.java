interface Fun {      //  <-----  Created Interface Which is Fun 

    void print();
}
class Chill implements Fun { //  <-----  Implemented The Interface Fun into Chill Class

    public void print(){  // <----- Print Method Initialized into Chill Class

        System.err.println("Hi i am Chill");     // <----- Printing The Message On Output Screen 
    }
}
class Enjoy implements Fun{  // <-----  Created Another Class and Implement The Fun interface 

    public void print(){    // <----- Print Method 

        System.err.println("Hi I am Enjoy");
    }
}
public class Interface{  // <----- Created One more Class 
        public static void main(String[] args) {  // <----- Main Method

            Fun obj = new Chill(); // <----- Reference And Object Of Class

            obj.print(); // <----- Calling to The Chill Class Method 
        }
}

