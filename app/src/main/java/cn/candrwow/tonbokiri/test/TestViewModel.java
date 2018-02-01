package cn.candrwow.tonbokiri.test;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.ObservableField;
import android.util.Log;
import android.view.View;

/**
 * Created by candrwow on 2018/2/1.
 */

public class TestViewModel extends BaseObservable {
    TestModel testModel;
    Context context;
    public final ObservableField<String> testBeanObservableField = new ObservableField<>();

    public TestViewModel(Context context) {
        this.context = context;
        testModel = TestModel.getInstance();
        Log.d("TestViewModel", "testModel.getTestBean():" + testModel.getTestBean());
        testBeanObservableField.set(testModel.getTestBean().getTestStr());
    }

    public void update(View view){
        Log.d("TestViewModel", "viewmodel.update");
        testBeanObservableField.set("3");
//        testModel.update();
//        Log.d("TestViewModel", testBeanObservableField.get().getTestStr());
    }


}
