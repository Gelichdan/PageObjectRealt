package tests.base;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
    @DataProvider

    public Object[][] dataProvider() {
        return new Object[][]{
                {"1", "string"},
                {"you", "123"}
        };
    }
}
