import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    private BubbleSort sorter = new BubbleSort();

    @Test
    public void shouldDoNothingWithEmptyArray() {
        int[] values = {};

        sorter.sort(values);
    }

    @Test
    public void shouldDoNothingWithOneElementArray() {
        int[] values = {42};

        sorter.sort(values);

        assertArrayEquals(new int[] {42}, values);
    }

    @Test
    public void shouldSortValues() {
        int[] values = { 9, -3, 5, 0, 1};
        int[] expectedOrder = { -3, 0, 1, 5, 9};

        sorter.sort(values);

        assertArrayEquals(expectedOrder, values);
    }
}