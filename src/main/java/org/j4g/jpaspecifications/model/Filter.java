package org.j4g.jpaspecifications.model;

import org.j4g.jpaspecifications.model.enums.Operator;

public class Filter {

    private String field;
    private Operator operator;
    private String value;
    private String values;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }
}
