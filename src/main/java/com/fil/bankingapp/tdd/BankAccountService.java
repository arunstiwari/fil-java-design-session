package com.fil.bankingapp.tdd;

public class BankAccountService {

    private BankAccountRepository bankAccountRespository;

    public BankAccountService(BankAccountRepository bankAccountRespository) {
        this.bankAccountRespository = bankAccountRespository;
    }

    public double fetchBalance(String customerId) throws AccountNotAvailableException {
        try {
            return this.bankAccountRespository.fetchBalance(customerId);
        } catch (RuntimeException e) {
            throw new AccountNotAvailableException("Account is Not Available in System");
        } catch (DatabaseException e) {
            throw new DatabaseUnavailableException("Database is unavailable");
        }


    }
}
