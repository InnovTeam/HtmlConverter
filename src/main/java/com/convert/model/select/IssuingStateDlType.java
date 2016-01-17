
package com.convert.model.select;

import java.util.ArrayList;
import java.util.List;

public enum IssuingStateDlType {

    Mr("Mr"),
    Mrs("Mrs"),
    Dr("Dr");
    private String value;

    private IssuingStateDlType(String value) {
        this.value = value;
    }

    public String getvalue() {
        return value;
    }

    public static List<String> getIssuingStateDlType() {
        List<String> list = new ArrayList<String>();
        for (IssuingStateDlType value: IssuingStateDlType.values()) {
            list.add(value.getvalue());
        }
        return list;
    }

}
