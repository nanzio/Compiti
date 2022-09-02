public class HelloWorld {
    public static void main(String[] args) {
        HelloHeaven hello = new HelloHeaven("message", "virus");
        System.out.println("hello world");
        System.out.println(hello.getVirus());
        System.out.println(hello.getMessage());
    }
}
