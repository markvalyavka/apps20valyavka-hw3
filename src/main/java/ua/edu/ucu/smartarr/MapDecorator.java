package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

import java.util.ArrayList;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {

    private MyFunction functionToApply;

    public MapDecorator(SmartArray smartArray, MyFunction newFunctionToApply) {
        super(smartArray);
        this.functionToApply = newFunctionToApply;
    }

    @Override
    public Object[] toArray() {
        Object[] newSmartArray = smartArray.toArray();
        ArrayList<Object> resultArray = new ArrayList<>();

        for (Object object : newSmartArray) {
            resultArray.add(functionToApply.apply(object));
        }
        return resultArray.toArray();
    }

    @Override
    public String operationDescription() {
        return "Using MapDecorator";
    }

    @Override
    public int size() {
        return this.toArray().length;
    }
}
