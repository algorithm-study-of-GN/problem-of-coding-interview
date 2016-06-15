import static org.assertj.core.api.Assertions.assertThat;

public class ProbTest {

    private static final String EXAM_1 = "aabccccccccccaa";
    private static final String EXAM_2 = "abcd";

    @org.junit.Test
    public void testInput() throws Exception {
        String input = Prob.input(EXAM_1);
        assertThat(input).isEqualTo("a2b1c10a2");

        input = Prob.input(EXAM_2);
        assertThat(input).isEqualTo(EXAM_2);

        input = Prob.input("");
        assertThat(input).hasSize(0);

        input = Prob.input(null);
        assertThat(input).hasSize(0);
    }
}