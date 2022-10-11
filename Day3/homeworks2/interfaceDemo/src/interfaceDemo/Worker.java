package interfaceDemo;

public class Worker implements IWorkable, IEateable, IPayable {

    @Override
    public void work() {
        System.out.println("I am a worker.");

    }

    @Override
    public void eat() {
        System.out.println("I can eat whatever i want in my lunch meal");

    }

    @Override
    public void pay() {
        System.out.println("My monthly extra payment is changeable");

    }

}
