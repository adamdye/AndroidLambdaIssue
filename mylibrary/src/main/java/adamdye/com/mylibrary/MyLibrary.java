package adamdye.com.mylibrary;

import java.util.function.Function;

public class MyLibrary {

    public void methodThatAcceptsLambda(Function function) {
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
