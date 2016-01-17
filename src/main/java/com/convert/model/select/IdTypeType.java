
package com.convert.model.select;

import java.util.ArrayList;
import java.util.List;

public enum IdTypeType {

    Passport("Passport"),
    Mr("Mr"),
    Mrs("Mrs"),
    Dr("Dr");
    private String value;

    private IdTypeType(String value) {
        this.value = value;
    }

    public String getvalue() {
        return value;
    }

    public static List<String> getIdTypeType() {
        List<String> list = new ArrayList<String>();
        for (IdTypeType value: IdTypeType.values()) {
            list.add(value.getvalue());
        }
        return list;
    }

}
