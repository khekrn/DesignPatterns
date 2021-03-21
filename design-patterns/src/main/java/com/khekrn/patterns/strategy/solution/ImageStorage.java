package com.khekrn.patterns.strategy.solution;

import com.khekrn.patterns.strategy.solution.compression.ICompression;
import com.khekrn.patterns.strategy.solution.filter.IFilter;

public class ImageStorage {

    private final ICompression compression;
    private final IFilter filter;

    public ImageStorage(ICompression compression, IFilter filter) {
        this.compression = compression;
        this.filter = filter;
    }

    public void store(String fileName){
        byte[] compressed = compression.compress(fileName.getBytes());
        byte[] appliedFilter = filter.apply(compressed);

        System.out.println("Saving File - "+appliedFilter.length);
    }
    
}
