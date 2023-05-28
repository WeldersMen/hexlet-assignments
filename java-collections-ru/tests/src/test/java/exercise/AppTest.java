package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3));

        List<Integer> actual = App.take(input, 3);
       assertThat(actual).isEqualTo(expected);
       // END
    }
    @Test
    void testTake2() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> expected = new ArrayList<>(Arrays.asList());

        List<Integer> actual = App.take(input, -2);
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void  testTake3() {
        List<Integer> input = new ArrayList<>(Arrays.asList());
        List<Integer> exepted = new ArrayList<>(Arrays.asList());

        List<Integer> actual = App.take(input, 3);
        assertThat(actual).isEqualTo(exepted);
    }
}
