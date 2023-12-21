/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.luv2code.springboot.restcruddemo.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.io.Serializable;

@MappedSuperclass
public abstract class BaseId<ID extends Serializable> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;

    protected BaseId() {}

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

}
