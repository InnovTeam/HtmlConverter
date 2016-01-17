
package com.convert.model.select;

import java.util.ArrayList;
import java.util.List;

public enum IssuingStateLegalType {

    Mr("Mr"),
    Mrs("Mrs"),
    Dr("Dr");
    private String value;

    private IssuingStateLegalType(String value) {
        this.value = value;
    }

    public String getvalue() {
        return value;
    }

    public static List<String> getIssuingStateLegalType() {
        List<String> list = new ArrayList<String>();
        for (IssuingStateLegalType value: IssuingStateLegalType.values()) {
            list.add(value.getvalue());
        }
        return list;
    }

}
