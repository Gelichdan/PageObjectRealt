package tests.searchappartments;

import org.testng.annotations.Test;
import tests.base.DataProviderClass;

public class TestSOUT {
    @Test(dataProvider = "dataProvider", dataProviderClass = DataProviderClass.class)
    public void testSOUT(Object obj, Object obj1) {
        System.out.println("testSOUT" + " " + obj + " " + obj1);
    }
}
