import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;


public class TestTask {
	TaskIF task = null;
    TaskIF task1 =null;
    TaskIF task2 =null;
    TaskIF task3 =null;
    String[] sequenz0 = null;
    String[] sequenz1 = null;
    String[] sequenz2 = null;
    String[] sequenz3 = null;
    String[] sequenz4= null;
    String[] sequenz5= null;
    String[] sequenz6= null;


    @BeforeEach
    public void setUp() {
        sequenz0 = new String[] { "A", "B", "C", "D" };
        sequenz1 = new String[] { "A", "B", "D", "C" };
        sequenz2 = new String[] { "A", "C", "C", "D" };
        sequenz3 = new String[] { "A", "C", "E", "A" };
        sequenz4 = new String[] { "A", "C", "A", "A" };
        sequenz5 = new String[] { "A", "D" };
        sequenz6 = new String[] { "C", "A" };
        task = new Task(new String[][] { { "A", "C" }, { "C", "D" }, { "B", "C" } });
        task1 = new Task(new String[][] { { "A", "C" }, { "C", "D" }, { "B", "C" }, {"A","D"}});
        task2 = new Task(new String[][] { { "A", "A" }, { "A", "D" }});
        task3 = new Task(new String[][] { { "A", "B" }, { "B", "C" }});
    }

    @AfterEach
    public void reset() {
        task = null;
        task1 = null;
        task2 = null;
        task3=null;
        sequenz0 = null;
        sequenz1 = null;
        sequenz2 = null;
        sequenz3 = null;
        sequenz4 = null;
        sequenz5 = null;

    }

    @Test
    @DisplayName("Soll false ergeben, gdw. ein String in der Sequenz doppelt vorkommt.")
    public void testTruekommtJederStringNurEinmanlVor() {
        assertEquals(false, task.kommtJederStringNurEinmalVor(sequenz2));
    }
    @Test
	@DisplayName("Soll false ergeben, wenn die Sequenz einen String enthät, der nicht im 2D array enthalten ist.")
	public void testsindAlleWerteDerSequenzErlaubtFalse() {
		assertEquals(false, task.sindAlleWerteDerSequenzErlaubt(sequenz3));

	}
	
	@Test
	@DisplayName("Soll true ergeben, wenn die Sequenz einen String enthät, der nicht im 2D array enthalten ist.")
	public void testsindAlleWerteDerSequenzErlaubtTrue() {
		assertEquals(true, task.sindAlleWerteDerSequenzErlaubt(sequenz2));
		assertEquals(true, task.sindAlleWerteDerSequenzErlaubt(sequenz4));
	}
}
