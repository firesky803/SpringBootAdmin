package com.geekcattle.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.commons.lang3.StringUtils;

import javax.persistence.*;

/**
 * 基础信息
 */
public class BaseEntity {

    @Transient
    private Integer page = 1;

    @Transient
    private Integer rows = 10;

    @Transient
    private Integer offset = 0;

    @Transient
    private Integer limit = 10;

    public Integer getPage() {
        return page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
