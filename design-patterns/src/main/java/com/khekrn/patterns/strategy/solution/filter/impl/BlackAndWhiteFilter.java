package com.khekrn.patterns.strategy.solution.filter.impl;

import com.khekrn.patterns.strategy.solution.filter.IFilter;

public class BlackAndWhiteFilter implements IFilter{

    @Override
    public byte[] apply(byte[] data) {
        System.out.println("Black And White Filter "+data.length);
        return data;
    }
    
}
