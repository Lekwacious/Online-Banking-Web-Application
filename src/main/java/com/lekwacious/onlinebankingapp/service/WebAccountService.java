package com.lekwacious.onlinebankingapp.service;

import com.lekwacious.onlinebankingapp.data.models.Account;
import com.lekwacious.onlinebankingapp.exception.AccountNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
public class WebAccountService {
    @Autowired
    protected RestTemplate  restTemplate;

    protected String serviceUrl = "http://ACCOUNT_SERVICE"; //account service is the name of the microservice we are calling

    public Account getByAccountNumber(String accountNumber){
        Account account = restTemplate.getForObject(serviceUrl + "/account/{accountId}", Account.class, accountNumber);
        if (account == null){
            throw new AccountNotFoundException(accountNumber);
        }
        else return account;
    }
    public List<Account> getAllAccount(){
        return restTemplate.getForObject(serviceUrl +  "/account",  List.class);
    }
}
