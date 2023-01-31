package pl.wojcik.jabc;

public class E0BasicFlowImpl implements E0BasicFlow {

    @Override
    public boolean isAdult(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
