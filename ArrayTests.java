import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
	public void testReverseInPlaceMoreVal() {
    int[] input1 = { 3, 2, 1, 0 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{0, 1, 2, 3}, input1);
	}

  @Test 
	public void testReversedMoreVal() {
    int[] input1 = { 3, 2, 1, 0 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 0, 1, 2, 3 }, input1);
	}

  @Test 
	public void testAverageWithoutLowest() {
    double[] input1 = { 3, 3, 3};
    double aveResult = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(new int[]{ 0, 1, 2, 3 }, aveResult);
	}
}
