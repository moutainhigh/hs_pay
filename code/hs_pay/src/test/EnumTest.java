import com.hszsd.webpay.common.ResultConstants;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by gzhengDu on 2016/7/26.
 */
public class EnumTest {
    @Test
    public void testEquals(){
        Object object = ResultConstants.MONEY_ISNULL;
        Assert.assertTrue(ResultConstants.MONEY_ISNULL.equals(object));
    }
}
