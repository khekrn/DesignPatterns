package com.khekrn.patterns.strategy;

/**
 *  We need to build Image storage function which comprises of compressing, filtering and saving
 * 
 *  This class violets Single Responsibility Principle as it does compression, filtering, etc.
 * 
 *  With Stragegy Pattern, we should be easily decouple the compression and filter logic which helps to use them interchangeable.
 */
public class Problem {

    private String compression;
    private String filter;

    public Problem(String compression, String filter){
        this.compression = compression;
        this.filter = filter;
    }

    public void store(String fileName){
        if(compression.equals("jpeg")){
            System.out.println("Jpeg Compression");
        }else if(compression.equals("png")){
            System.out.println("PNG Compression");
        }

        if(filter.equals("B&W")){
            System.out.println("Black and White filter");
        }else if(filter.equals("high-contrast")){
            System.out.println("High Contrast filter");
        }

        System.out.println("Saving File - "+fileName);
    }
    
}
