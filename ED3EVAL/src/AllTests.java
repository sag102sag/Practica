import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ TestProduct.class, TestShoopingCart.class })
public class AllTests {

}
