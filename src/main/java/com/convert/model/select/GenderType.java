
package com.convert.model.select;

import java.util.ArrayList;
import java.util.List;

public enum GenderType {

    Mr("Mr"),
    Mrs("Mrs"),
    Dr("Dr");
    private String value;

    private GenderType(String value) {
        this.value = value;
    }

    public String getvalue() {
        return value;
    }

    public static List<String> getGenderType() {
        List<String> list = new ArrayList<String>();
        for (GenderType value: GenderType.values()) {
            list.add(value.getvalue());
        }
        return list;
    }

}
