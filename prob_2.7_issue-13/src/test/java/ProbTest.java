import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by jsuch2362 on 2016. 6. 26..
 */
public class ProbTest {

    private static final String TEST_1 = "abcddcba";
    private static final String TEST_2 = "abcdcba";
    private static final String TEST_3 = "abcdbcba";

    @Test
    public void testInput() throws Exception {
        assertThat(Prob.input(makeNode(TEST_1))).isTrue();
        assertThat(Prob.input(makeNode(TEST_2))).isTrue();
        assertThat(Prob.input(makeNode(TEST_3))).isFalse();
    }

    private Prob.Node makeNode(String input) {

        int size = input.length();
        Prob.Node first = new Prob.Node();
        first.value = input.charAt(0);
        Prob.Node last = first;
        for (int idx = 1; idx < size; idx++) {
            Prob.Node node = new Prob.Node();

            node.prev = last;
            node.value = input.charAt(idx);
            last.next = node;

            last = node;

        }

        return first;
    }
}