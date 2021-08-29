package Practical;
public class GenericClass<T> {

private T value;

public GenericClass(T value) {
this.value = value;
}

public void showType() {
if(value instanceof Integer) {
System.out.println("Integer");
System.out.println(this.value);
} else {
System.out.println("String");
System.out.println(this.value);
}
}

}
