import exercise.FizzBuzz;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzAppTest {
    
    private FizzBuzz fizzBuzz;

    @Before
    public void setUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldReturnNumber1() throws Exception {
        assertThat(fizzBuzz.returnNumbers(1), is("1\n"));
    }

    @Test
    public void shouldChangeMultipleOf3forFizz() throws Exception {
        assertThat(fizzBuzz.returnNumbers(3), is("1\n2\nFizz\n"));
    }

    @Test
    public void shouldChangeMultipleOf3forFizzAndChangeMultipleOf5forBuzz() throws Exception {
        assertThat(fizzBuzz.returnNumbers(5), is("1\n2\nFizz\n4\nBuzz\n"));
    }

    @Test
    public void shouldChangeMultipleOf3and5forFizzBuzz() throws Exception {
        assertThat(fizzBuzz.returnNumbers(15), is("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n"));
    }
}