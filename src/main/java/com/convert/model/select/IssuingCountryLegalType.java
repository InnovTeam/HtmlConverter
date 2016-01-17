
package com.convert.model.select;

import java.util.ArrayList;
import java.util.List;

public enum IssuingCountryLegalType {

    Mr("Mr"),
    Mrs("Mrs"),
    Dr("Dr");
    private String value;

    private IssuingCountryLegalType(String value) {
        this.value = value;
    }

    public String getvalue() {
        return value;
    }

    public static List<String> getIssuingCountryLegalType() {
        List<String> list = new ArrayList<String>();
        for (IssuingCountryLegalType value: IssuingCountryLegalType.values()) {
            list.add(value.getvalue());
        }
        return list;
    }

}
