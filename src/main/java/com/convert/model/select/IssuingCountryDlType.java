
package com.convert.model.select;

import java.util.ArrayList;
import java.util.List;

public enum IssuingCountryDlType {

    Mr("Mr"),
    Mrs("Mrs"),
    Dr("Dr");
    private String value;

    private IssuingCountryDlType(String value) {
        this.value = value;
    }

    public String getvalue() {
        return value;
    }

    public static List<String> getIssuingCountryDlType() {
        List<String> list = new ArrayList<String>();
        for (IssuingCountryDlType value: IssuingCountryDlType.values()) {
            list.add(value.getvalue());
        }
        return list;
    }

}
