package com.zwt.utils;

import lombok.Data;

//This object is designed to keep the data consistency of backend and frontend
@Data
public class Chars {

    private Boolean flag;
    private Object data;
    private String msg;

    public Chars() {}
    public Chars (Boolean flag){
        this.flag = flag;
    }

    public Chars(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }

    public Chars(Boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }

    public Chars(String msg) {
        this.flag = false;
        this.msg = msg;
    }
}
