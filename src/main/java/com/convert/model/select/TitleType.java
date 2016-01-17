
package com.convert.model.select;

import java.util.ArrayList;
import java.util.List;

public enum TitleType {

    Mr("Mr"),
    Mrs("Mrs"),
    Dr("Dr");
    private String value;

    private TitleType(String value) {
        this.value = value;
    }

    public String getvalue() {
        return value;
    }

    public static List<String> getTitleType() {
        List<String> list = new ArrayList<String>();
        for (TitleType value: TitleType.values()) {
            list.add(value.getvalue());
        }
        return list;
    }

}
