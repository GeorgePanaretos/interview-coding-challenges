package primechecker;

public class PrimeChecker {
    private String separator;

    public PrimeChecker() {
        this.separator = " ";
    }

    public PrimeChecker(String separator) {
        this.separator = separator;
    }
    private boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    public int countPrimes(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] numbers = input.split(separator);
        int count = 0;

        for (String number : numbers) {
            if (isNumeric(number) && isPrime(Integer.parseInt(number))) {
                count++;
            }
        }
        return count;
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}