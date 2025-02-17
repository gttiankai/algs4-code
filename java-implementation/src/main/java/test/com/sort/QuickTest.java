package test.com.sort;

import com.sort.Quick;
import com.sort.Selection;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static junit.framework.TestCase.assertTrue;

/**
 * Quick Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jun 22, 2019</pre>
 */
public class QuickTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: sort(Comparable[] a)
     */
    @Test
    public void testSort() throws Exception {
//TODO: Test goes here...
        int N = 10;
        Quick quick = new Quick();

        Double[] nums =new Double[]{67.0,4.0, 91.0, 26.0, 25.0, 1.0, 61.0, 58.0, 81.0, 6.0 };
        quick.sort(nums);

        Double[] a = new Double[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                a[j] = Double.valueOf(StdRandom.uniform(10 * N));
            }
            quick.show(a);
            quick.sort(a);
            quick.show(a);
            assertTrue(quick.isSorted(a, 0, a.length - 1));

        }
    }
}
