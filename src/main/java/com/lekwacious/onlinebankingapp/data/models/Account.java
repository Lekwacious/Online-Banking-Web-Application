package com.lekwacious.onlinebankingapp.data.models;

import lombok.Data;

import java.io.Serializable;

@Data
public class Account implements Serializable {
    private static final long serialVersionUID = 1L;

    Integer accountId;
    Double balance;
    Integer customerId;
    String accountType;
    String branchCode;
    String bank;

    public Account() {
        super();
    }

    public Account(Integer accountId, Double balance, Integer customerId, String accountType, String branchCode, String bank) {
        super();
        this.accountId = accountId;
        this.balance = balance;
        this.customerId = customerId;
        this.accountType = accountType;
        this.branchCode = branchCode;
        this.bank = bank;
    }
}
