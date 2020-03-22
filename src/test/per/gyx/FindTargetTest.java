package test.per.gyx;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import per.gyx.FindTarget;

/**
 * FindTarget Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>3月 22, 2020</pre>
 */
public class FindTargetTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: findTarget(int[] arr, int target)
     */
    @Test
    public void testFindTarget() throws Exception {
//TODO: Test goes here...
        int[] arr = new int[]{1, 2, 2, 2, 3, 4, 5, 5, 6};
        System.out.println("位置：" + FindTarget.findTarget(arr, 5));
    }


} 
