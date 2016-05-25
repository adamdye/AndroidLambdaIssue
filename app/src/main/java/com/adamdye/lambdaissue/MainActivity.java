package com.adamdye.lambdaissue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.function.Function;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void methodThatAcceptsLambda(Function<Object, Boolean> function) {
        function.apply(new Object());
    }

    public void consumer() {
        methodThatAcceptsLambda(new Function() {
            @Override
            public Boolean apply(Object o) {
                return null;
            }
        });
    }

}
