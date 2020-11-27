package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {

    private MyComparator comparator;

    public SortDecorator(SmartArray smartArray, MyComparator newComparator) {
        super(smartArray);
        this.comparator = newComparator;
    }

    @Override
    public Object[] toArray() {
        Object[] newSmartArray = smartArray.toArray();
        Arrays.sort(newSmartArray, comparator);
        return Arrays.stream(newSmartArray).toArray();
    }

    @Override
    public String operationDescription() {
        return "Using SortDecorator";
    }

    @Override
    public int size() {
        return this.toArray().length;
    }
}
