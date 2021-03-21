package com.khekrn.patterns.strategy.solution.compression.impl;

import com.khekrn.patterns.strategy.solution.compression.ICompression;

public class PNGCompression implements ICompression{

    @Override
    public byte[] compress(byte[] data) {
        System.out.println("PNG Compression");
        return data;
    }
    
}
