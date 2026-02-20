package Programme;

public class Inheritance001 {
    class Vehical{
        //vehical function
        void start(){
            System.out.println("Car is Started..");
        }
    }

    class Car extends Vehical{
        @Override
        void start() {
            super.start();
        }
    }
}
