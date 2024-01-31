import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test 
	public void testFilter() {
    List<String> classes = new ArrayList<>();

    classes.add("CSE15L");
    classes.add("CSE12");
    classes.add("CSE20");
    classes.add("CSE11");

    List<String> expected = new ArrayList<>();

    expected.add("CSE15L");
    expected.add("CSE12");
    expected.add("CSE20");

    assertSame(expected, ListExamples.filter(classes, new StringChecker()));
	}

    @Test 
	public void testMerge() {
    List<String> arrayList1 = new ArrayList<>();

    arrayList1.add("a");
    arrayList1.add("b");
    arrayList1.add("a");

    List<String> arrayList2 = new ArrayList<>();

    arrayList2.add("a");
    arrayList2.add("a");
    arrayList2.add("b");

    List<String> expected = new ArrayList<>();

    expected.add("a");
    expected.add("a");
    expected.add("a");
    expected.add("a");
    expected.add("b");
    expected.add("b");


    assertSame(expected, ListExamples.merge(arrayList1, arrayList2));
	}
}
