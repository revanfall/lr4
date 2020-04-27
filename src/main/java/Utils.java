import java.util.function.Function;

public class Utils {
    public static <T,R> R $get(T t, Function<T,R> getter) {
        if (t == null) {
            return null;
        }
        return getter.apply(t);
    }
}
