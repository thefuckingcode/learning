package org.example.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class BookDao {

    private Integer label = 1;

    public BookDao() {
    }

    public void setLabel(Integer label) {
        this.label = label;
    }

    public Integer getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "BookDao{" +
                "label=" + label +
                '}';
    }
}
