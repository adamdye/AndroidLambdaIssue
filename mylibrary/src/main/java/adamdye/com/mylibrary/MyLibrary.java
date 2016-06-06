package adamdye.com.mylibrary;

import android.util.Log;

import java.util.function.Function;

import rx.Observable;

public class MyLibrary {

    public void methodThatUsesRxJava() {
        Observable.just(1, 2, 3).subscribe(integer -> {
            Log.i(MyLibrary.class.getName(), integer.toString());
        });
    }

    public void methodThatAcceptsLambda(Function<Object, Boolean> function) {
        function.apply(new Object());
    }

    public void methodThatCreatesLambda() {
        methodThatAcceptsLambda(new Function() {
            @Override
            public Object apply(Object o) {
                return Boolean.FALSE;
            }
        });

        methodThatAcceptsLambda(object -> {
            return Boolean.FALSE;
        });

    }
}
