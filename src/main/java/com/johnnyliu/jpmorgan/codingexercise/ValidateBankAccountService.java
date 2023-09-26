package com.johnnyliu.jpmorgan.codingexercise;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ValidateBankAccountService {

    private final DataProviderConfiguration dataProviderConfiguration;

    public ValidateBankAccountService(DataProviderConfiguration dataProviderConfiguration) {
        this.dataProviderConfiguration = dataProviderConfiguration;
    }

    public List<ValidateBankAccountResponse> validate(String accountNumber, List<String> providers) {
        List<ValidateBankAccountResponse> responses = new ArrayList<>();

        for (DataProvider dataProvider : dataProviderConfiguration.getDataProviders()) {
            if (providers == null || providers.contains(dataProvider.getName())) {
                boolean isValid = dataProvider.validate(accountNumber);

                responses.add(new ValidateBankAccountResponse(dataProvider.getName(), isValid));
            }
        }

        return responses;
    }
    
}
