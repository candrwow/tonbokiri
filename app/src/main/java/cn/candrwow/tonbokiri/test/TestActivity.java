package cn.candrwow.tonbokiri.test;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import cn.candrwow.tonbokiri.R;
import cn.candrwow.tonbokiri.databinding.ActivityTestBinding;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityTestBinding activityTestBinding= DataBindingUtil.setContentView(this,R.layout.activity_test);
        TestViewModel testViewModel = new TestViewModel(this);
        activityTestBinding.setTestViewModel(testViewModel);
    }
}
