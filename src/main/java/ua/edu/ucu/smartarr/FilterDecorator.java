package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.ArrayList;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {

    private MyPredicate predicate;

    public FilterDecorator(SmartArray smartArray, MyPredicate newPredicate) {
        super(smartArray);
        this.predicate = newPredicate;
    }

    @Override
    public Object[] toArray() {
        Object[] newSmartArray = smartArray.toArray();
        ArrayList<Object> resultArray = new ArrayList<>();

        for (Object object : newSmartArray) {
            if (predicate.test(object)) {
                resultArray.add(object);
            }
        }
        return resultArray.toArray();
    }

    @Override
    public String operationDescription() {
        return "Using FilterDecorator";
    }

    @Override
    public int size() {
        return this.toArray().length;
    }
}
