package com.atguigu.springcloud.entities;

import java.io.Serializable;

/**
 * Description: TODO
 * Project: cloud-H
 *
 * @author : Julian
 * @date :2020/9/5 15:23
 */
public class Payment implements Serializable {

    private Long id;
    private String serial;

    public Payment() {
    }

    public Payment(Long id, String serial) {
        this.id = id;
        this.serial = serial;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}
