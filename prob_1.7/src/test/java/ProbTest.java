import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProbTest {

    private static final int[][] EXAM_1 = {
            {1, 1, 1, 1, 1, 1, 1},
            {1, 0, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 0, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1},
            {1, 0, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1}
    };

    private static final int[][] SOL_1 = {
            {1, 0, 1, 0, 1, 1, 1},
            {0, 0, 0, 0, 0, 0, 0},
            {1, 0, 1, 0, 1, 1, 1},
            {0, 0, 0, 0, 0, 0, 0},
            {1, 0, 1, 0, 1, 1, 1},
            {0, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 0, 1, 1, 1}
    };

    @Test
    public void testInput() throws Exception {
        int[][] input = Prob.input(EXAM_1);


        int colLength = input[0].length;
        for (int row = 0; row < input.length; row++) {
            for (int col = 0; col < colLength; col++) {
                assertThat(input[row][col]).isEqualTo(input[row][col]);
            }
        }

    }
}