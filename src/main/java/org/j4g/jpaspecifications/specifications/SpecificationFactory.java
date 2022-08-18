package org.j4g.jpaspecifications.specifications;


import org.j4g.jpaspecifications.model.Filter;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class SpecificationFactory<T> {


    public Specification<T> createSpecification(Filter filter) throws Exception {

        switch (filter.getOperator()) {

            case EQUALS:
                return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get(filter.getField()),
                        castToType(root.get(filter.getField()).getJavaType(),
                                filter.getValue()));

            case NOT_EQUALS:
                return (root, query, criteriaBuilder) -> criteriaBuilder.notEqual(root.get(filter.getField()),
                        castToType(root.get(filter.getField()).getJavaType(),
                                filter.getValue()));

            case GRATER_EQUALS:
                return (root, query, criteriaBuilder) -> criteriaBuilder.greaterThanOrEqualTo(root.get(filter.getField()),
                        (Comparable) castToType(root.get(filter.getField()).getJavaType(),
                                filter.getValue()));

            case LESS_EQUALS:
                return (root, query, criteriaBuilder) -> criteriaBuilder.lessThanOrEqualTo(root.get(filter.getField()),
                        (Comparable) castToType(root.get(filter.getField()).getJavaType(),
                                filter.getValue()));

            case IN:
                return (root, query, criteriaBuilder) ->
                        criteriaBuilder.in(root.get(filter.getField()))
                                .value(castToType(
                                        root.get(filter.getField()).getJavaType(),
                                        filter.getValues()));

            default:
                throw new Exception("not valid operator");
        }
    }


    private Object castToType(Class fieldType, String value) {
        if(fieldType.isAssignableFrom(Double.class)) {
            return Double.valueOf(value);
        } else if(fieldType.isAssignableFrom(Integer.class)) {
            return Integer.valueOf(value);
        } else if(fieldType.isAssignableFrom(ZonedDateTime.class)){
            return  castToZonedDateTime(value);
        }
        return value;
    }
    private Object castToType(Class fieldType, List<String> value) {
        List<Object> lists = new ArrayList<>();
        for (String s : value) {
            lists.add(castToType(fieldType, s));
        }
        return lists;
    }

    private ZonedDateTime castToZonedDateTime(String value){
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(value);
        return zonedDateTime;
    }
}
