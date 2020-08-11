import org.junit.jupiter.api.Test;

public class helloTest {
    @Test
    public void testhello(){
        hello hello = new hello();
        String maven = hello.sayhello("Maven");
        System.out.println(maven);
    }
}
