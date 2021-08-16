package kuliah.number;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NumberAlgorithmTest {
    private NumberAlgorithm numberAlgorithm;

    @BeforeEach
    void setUp() {
        numberAlgorithm = new NumberAlgorithmImpl();
    }

    @Test
    void TestIsPrime() {
        Assertions.assertFalse(numberAlgorithm.isPrime(1));
        Assertions.assertTrue(numberAlgorithm.isPrime(2));
        Assertions.assertTrue(numberAlgorithm.isPrime(19));
        Assertions.assertFalse(numberAlgorithm.isPrime(169));
    }
}
