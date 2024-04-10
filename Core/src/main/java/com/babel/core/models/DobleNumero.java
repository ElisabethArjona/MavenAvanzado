package com.babel.core.models;

import lombok.Data;
@Data
public class DobleNumero {
    private double num1;
    private double num2;

    public DobleNumero() {
    }

    public DobleNumero(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}
