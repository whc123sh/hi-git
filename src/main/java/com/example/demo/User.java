package com.example.demo;

/**
 * @description:
 * @author: Andy
 * @time: 2020/9/23 11:00
 */
public class User {
    private  String gco;
    private  String gna;

    public String getGco() {
        return gco;
    }

    public void setGco(String gco) {
        this.gco = gco;
    }

    public String getGna() {
        return gna;
    }

    public void setGna(String gna) {
        this.gna = gna;
    }

    @Override
    public String toString() {
        return "User{" +
                "gco='" + gco + '\'' +
                ", gna='" + gna + '\'' +
                '}';
    }
}
