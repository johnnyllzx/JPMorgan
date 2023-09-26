package com.johnnyliu.jpmorgan.codingexercise;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidateBankAccountController {

    private final ValidateBankAccountService validateBankAccountService;

    public ValidateBankAccountController(ValidateBankAccountService validateBankAccountService) {
        this.validateBankAccountService = validateBankAccountService;
    }

    @PostMapping("/validate-bank-account")
    public List<ValidateBankAccountResponse> validateBankAccount(@RequestBody ValidateBankAccountRequest request) {
        return validateBankAccountService.validate(request.getAccountNumber(), request.getProviders());
    }
}
