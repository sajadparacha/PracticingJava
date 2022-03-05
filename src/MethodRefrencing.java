import java.lang.reflect.Method;

@FunctionalInterface
public interface MethodRefrencing {

    void abstractMethod();

    default float devide (int a,int b){
        if(b!=0)
            return a/b;
        else
            return -1;
    }
}
