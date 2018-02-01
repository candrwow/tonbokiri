package cn.candrwow.tonbokiri.test;

import android.util.Log;

/**
 * Created by candrwow on 2018/2/1.
 */

class TestModel {
    private static final TestModel ourInstance = new TestModel();

    public static TestModel getInstance() {
        return ourInstance;
    }

    TestBean testBean;

    private TestModel() {
        testBean = new TestBean();
        testBean.testStr = "1";
    }

    public TestBean getTestBean() {
        return testBean;
    }

    public void setTestBean(TestBean testBean) {
        this.testBean = testBean;
    }

    public void update() {
        Log.d("TestModel", "1");
        testBean.testStr = "2";
        Log.d("TestModel", "2");
    }
}
