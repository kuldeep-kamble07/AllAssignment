package DefaultMethod;

public interface Right {
    default void m1(){
        System.out.println("Right default method");
    }
}
