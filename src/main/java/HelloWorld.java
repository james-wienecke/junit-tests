public class HelloWorld {
    public static String hello(String name) {
        if (name == null) throw new IllegalArgumentException();
        return String.format("Hello, %s", name);
    }
}
