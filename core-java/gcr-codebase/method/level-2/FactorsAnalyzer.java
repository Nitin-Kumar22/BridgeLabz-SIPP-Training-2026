
import java.util.*;

public class FactorsAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + ": " + Arrays.toString(factors));

        int sumOfFactors = sumOfFactors(factors);
        System.out.println("Sum of factors: " + sumOfFactors);

        int productOfFactors = productOfFactors(factors);
        System.out.println("Product of factors: " + productOfFactors);

        double sumOfSquares = sumOfSquares(factors);
        System.out.println("Sum of squares of factors: " + sumOfSquares);

        sc.close();
    }

    private static int[] findFactors(int number) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    private static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    private static double sumOfSquares(int[] factors) {
        double sum = 0;
        for (int factor : factors) {
            sum += factor * factor;
        }
        return sum;
    }
}