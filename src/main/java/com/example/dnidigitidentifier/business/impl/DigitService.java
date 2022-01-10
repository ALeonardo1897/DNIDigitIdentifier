package com.example.dnidigitidentifier.business.impl;

import com.example.dnidigitidentifier.business.IDigitService;

import java.util.Arrays;

public class DigitService implements IDigitService {

    @Override
    public String calculate(String dni) {
        int[] digitos = split(dni);

    }

    private int[] split(String dni){
        return Arrays.stream(dni.split("")).mapToInt(Integer::valueOf).toArray();
    }
}
