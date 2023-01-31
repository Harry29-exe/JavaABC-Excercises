package pl.wojcik.jabc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class E1ForLoopTest {

    E1ForLoop instance;

    @BeforeEach
    void setUpInstance() {
        // this.instance = new E1ForLoopImpl();
    }

    @Test
    void sum_sums_list_with_one_element() {
        int[] array1 = new int[]{0};
        assert instance.sum(array1) == 0;

        int[] array2 = new int[]{5};
        assert instance.sum(array1) == 5;
    }

    @Test
    void sum_should_sum_list_with_multiple_elements() {
        int[] array1 = new int[]{1, 5, 3};
        assert instance.sum(array1) == 1 + 5 + 3;

        int[] array2 = new int[]{3, 6, 3, 3};
        assert instance.sum(array2) == 3 + 6 + 3 + 3;

        int[] array3 = new int[]{5, 2, 62};
        assert instance.sum(array3) == 5 + 2+ 62;
    }

}