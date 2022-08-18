package ru.odybo.meliso;

public class Box<T> {

    private T object;

    public Box (T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public static <T>Box<T> getBox() {
        // Box object = new Box<Integer>(0);
        // Box object = <T> Box;
        return object;
    }

    public String toString() {
        return "[" + this.object.getClass().getName() + "]";
    }

}
