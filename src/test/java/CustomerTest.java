import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Test;
import util.HibernateUtil;

public class CustomerTest {


    @Test
    public void creationTest(){
        SessionFactory factory = HibernateUtil.getFactory();
        Assert.assertNotEquals(factory, null);
    }
}
