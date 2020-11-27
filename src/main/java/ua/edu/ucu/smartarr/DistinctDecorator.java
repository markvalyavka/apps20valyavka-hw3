package ua.edu.ucu.smartarr;

import java.util.*;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {

    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
    }

    @Override
    public Object[] toArray() {

        Object[] newSmartArray = smartArray.toArray();
        ArrayList<Object> resultArray = new ArrayList<>();

//        LinkedHashSet<Object> set = new LinkedHashSet<Object>(Arrays.asList(newSmartArray));
//        ArrayList<Object> resultArray = new ArrayList<>(set);

        for (int i = 0; i < newSmartArray.length; i++) {
            if (newSmartArray[i] == null) {
                continue;
            }
            for (int j = i + 1; j < newSmartArray.length; j++) {
                if (newSmartArray[i].equals(newSmartArray[j])) {
                    newSmartArray[j] = null;
                }
            }
        }
        for (Object elm : newSmartArray) {
            if (elm != null) {
                resultArray.add(elm);
            }
        }

        return resultArray.toArray();
    }

    @Override
    public String operationDescription() {
        return "Using DistinctDecorator";
    }

    @Override
    public int size() {
        return this.toArray().length;
    }
}
