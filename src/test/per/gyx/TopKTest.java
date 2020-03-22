package test.per.gyx;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import per.gyx.PrintArray;
import per.gyx.TopK;

/**
 * TopK Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>3月 22, 2020</pre>
 */
public class TopKTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: topK(int[] arr)
     */
    @Test
    public void testTopK() throws Exception {
//TODO: Test goes here...
        int arr[] = new int[]{3, 2, 1, 5, 2, 3, 3, 3, 6, 4};
        new TopK().topK(arr);
        PrintArray.print(arr);
    }

    /**
     * Method: adjustHeap(int[] arr, int i, int length)
     */
    @Test
    public void testAdjustHeap() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: swap(int[] arr, int i, int j)
     */
    @Test
    public void testSwap() throws Exception {
//TODO: Test goes here... 
    }


} 
