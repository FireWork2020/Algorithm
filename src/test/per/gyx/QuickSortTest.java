package test.per.gyx;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import per.gyx.QuickSort;

/**
 * QuickSort Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>3月 22, 2020</pre>
 */
public class QuickSortTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: quickSort(int[] arr, int left, int right)
     */
    @Test
    public void testQuickSort() throws Exception {
//TODO: Test goes here...
        int arr[] = new int[]{3, 2, 1, 5, 2, 3, 3, 3, 6, 4};
        System.out.println("准备排序");
        new QuickSort().quickSort(arr, 0, arr.length - 1);
        System.out.println(arr);
    }

    /**
     * Method: parition(int[] arr, int i, int j)
     */
    @Test
    public void testParition() throws Exception {
//TODO: Test goes here... 
    }


} 
