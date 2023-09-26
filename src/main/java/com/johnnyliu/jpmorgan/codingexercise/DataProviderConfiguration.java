package com.johnnyliu.jpmorgan.codingexercise;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataProviderConfiguration {
        @Value("${providers}")
    private List<DataProvider> dataProviders;

    public List<DataProvider> getDataProviders() {
        return dataProviders;
    }
    
}
