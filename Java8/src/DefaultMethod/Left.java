package DefaultMethod;

public interface Left {
    default void m1(){
        System.out.println("left default method");
    }
}
