package com.khekrn.patterns.strategy.solution.filter.impl;

import com.khekrn.patterns.strategy.solution.filter.IFilter;

public class HighContrastFilter implements IFilter{

    @Override
    public byte[] apply(byte[] data) {
        System.out.println("High Contrast Filter - "+data.length);
        return data;
    }
    
}
