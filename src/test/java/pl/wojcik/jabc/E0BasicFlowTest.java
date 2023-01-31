package pl.wojcik.jabc;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class E0BasicFlowTest {

    E0BasicFlow instance;

    @BeforeEach
    public void setUp() {
        this.instance = new E0BasicFlowImpl();
    }

    @Test
    void isAdult_should_return_true_when_age_above_or_equal_18() {
        assert instance.isAdult(18);
        assert instance.isAdult(54);
        assert instance.isAdult(32);
    }

    @Test
    void isAdult_should_return_false_when_Age_beloved_18() {
        assert !instance.isAdult(17);
        assert !instance.isAdult(2);
        assert !instance.isAdult(14);
    }

}