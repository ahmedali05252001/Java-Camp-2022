package oopChallenge.business;

public class CompanyCreditManager implements CreditManager {

    @Override
    public void calculate() {
        System.out.println("Company credits was calculated.");

    }

    @Override
    public void save() {
        System.out.println("Saved.");

    }

}
