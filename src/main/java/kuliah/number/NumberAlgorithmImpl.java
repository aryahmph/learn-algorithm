package kuliah.number;

public class NumberAlgorithmImpl implements NumberAlgorithm {
    /**
     * A prime number is a natural number greater than 1 that is
     * not a product of two smaller natural numbers.
     * <p>
     * For example, 5 is prime because the only
     * ways of writing it as a product, 1 × 5 or 5 × 1, involve 5 itself.
     * <p>
     * The algorithm time complexity is O(sqrt(n)/2).
     *
     * @param number int
     * @return true|false boolean
     */
    @Override
    public boolean isPrime(int number) {
        if (number < 2) return false;
        else if (number == 2) return true;
        else if (number % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(number); i += 2)
            if (number % i == 0) return false;

        return true;
    }
}
