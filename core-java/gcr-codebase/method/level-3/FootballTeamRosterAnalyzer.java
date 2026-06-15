
import java.util.*;

public class FootballTeamRosterAnalyzer {
    public static void main(String[] args) {
        int numberOfPlayers = 11;
        int[] heights = new int[numberOfPlayers];
        Random random = new Random();

        for (int i = 0; i < numberOfPlayers; i++) {
            heights[i] = random.nextInt(101) + 150;
        }

        System.out.println("Heights of players: " + Arrays.toString(heights));

        int sumOfHeights = sumOfHeights(heights);
        System.out.println("Sum of heights: " + sumOfHeights);

        double meanHeight = meanHeight(heights);
        System.out.println("Mean height: " + meanHeight);

        int shortestHeight = shortestHeight(heights);
        System.out.println("Shortest height: " + shortestHeight);

        int tallestHeight = tallestHeight(heights);
        System.out.println("Tallest height: " + tallestHeight);
    }

    private static int sumOfHeights(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    private static double meanHeight(int[] heights) {
        return (double) sumOfHeights(heights) / heights.length;
    }

    private static int shortestHeight(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    private static int tallestHeight(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }
}