package oopChallenge.business;

public class TeacherCreditManager implements CreditManager{

    @Override
    public void calculate() {
        System.out.println("Teacher credits was calculated.");
        
    }

    @Override
    public void save() {
        System.out.println("Saved.");
        
    }
    
}
