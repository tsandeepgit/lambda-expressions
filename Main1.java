interface Supplier<T>
{
String get();
}
class Person {
    private String name;
     public Person(String name) {
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Person person = new Person("John");
        Supplier<String> supplier = person::getName;
        String name = supplier.get();
        System.out.println(name);
    }
}