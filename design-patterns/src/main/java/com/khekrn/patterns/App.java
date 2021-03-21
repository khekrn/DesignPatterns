package com.khekrn.patterns;

import com.khekrn.patterns.strategy.solution.ImageStorage;
import com.khekrn.patterns.strategy.solution.compression.impl.PNGCompression;
import com.khekrn.patterns.strategy.solution.filter.impl.HighContrastFilter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var compression = new PNGCompression();
        var filter = new HighContrastFilter();

        var imageStorage = new ImageStorage(compression, filter);
        imageStorage.store("Awesome");
    }
}
