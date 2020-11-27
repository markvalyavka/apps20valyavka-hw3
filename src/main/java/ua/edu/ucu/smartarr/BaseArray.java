package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray {

    private Object[] arr;

    public BaseArray(Object[] newArr) {
        this.arr = newArr.clone();
    }


    @Override
    public Object[] toArray() {
        return arr.clone();
    }

    @Override
    public String operationDescription() {
        return "Using BaseArray";
    }

    @Override
    public int size() {
        return arr.length;
    }
}
