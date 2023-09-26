package com.johnnyliu.jpmorgan.codingexercise;

public class ValidateBankAccountResponse {
    private String provider;
    private boolean isValid;

    public ValidateBankAccountResponse() {
    }

    public ValidateBankAccountResponse(String provider, boolean isValid) {
        this.provider = provider;
        this.isValid = isValid;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }
    
}
