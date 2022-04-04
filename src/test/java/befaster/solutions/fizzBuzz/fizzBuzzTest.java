package befaster.solutions.fizzBuzz;

import befaster.solutions.FIZ.FizzBuzzSolution;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class fizzBuzzTest {
    private FizzBuzzSolution sol;

    @Before
    public void setUp() {

        sol = new FizzBuzzSolution();
    }

    @Test
    public void compute_fizzbuzz() {
        assertThat(sol.fizzBuzz(3), equalTo("fizz"));
        assertThat(sol.fizzBuzz(5), equalTo("buzz"));
        assertThat(sol.fizzBuzz(30), equalTo("fizz buzz"));
        assertThat(sol.fizzBuzz(1),equalTo("1"));
        assertThat(sol.fizzBuzz(13),equalTo("fizz"));
        assertThat(sol.fizzBuzz(52),equalTo("buzz"));
        assertThat(sol.fizzBuzz(53),equalTo("fizz buzz"));
        assertThat(sol.fizzBuzz(55),equalTo("buzz fake deluxe"));
        assertThat(sol.fizzBuzz(33),equalTo("fizz fake deluxe"));
        assertThat(sol.fizzBuzz(11),equalTo("fake deluxe"));
        assertThat(sol.fizzBuzz(555),equalTo("fizz buzz fake deluxe"));
        assertThat(sol.fizzBuzz(44),equalTo("deluxe"));
        assertThat(sol.fizzBuzz(11),equalTo("fake deluxe"));
    }
}




