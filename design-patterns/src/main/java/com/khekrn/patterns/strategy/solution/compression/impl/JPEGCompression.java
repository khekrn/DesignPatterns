package com.khekrn.patterns.strategy.solution.compression.impl;

import com.khekrn.patterns.strategy.solution.compression.ICompression;

public class JPEGCompression implements ICompression{

    @Override
    public byte[] compress(byte[] data) {
        System.out.println("JPEG Compression");
        return data;
    }

}