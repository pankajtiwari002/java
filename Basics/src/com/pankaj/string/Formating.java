package com.pankaj.string;

import java.text.DecimalFormat;

public class Formating {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("00.0000");
        float f = 323.412121f;
        System.out.println(df.format(f));

    }
}
