package com.fil.bankingapp;

import com.fil.bankingapp.tdd.AccountNotAvailableException;
import com.fil.bankingapp.tdd.BankAccountRepository;
import com.fil.bankingapp.tdd.BankAccountService;
import com.fil.bankingapp.tdd.SystemNotAvailableException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class BankAccountServiceTest {

    @Test
    public void fetchBalanceForGivenCustomerId() throws  Exception  {
        String customerId ="cust-123";
//        BankAccountRepository bankAcccountRepository = new BankAccountRepository();
        BankAccountRepository bankAccountRepository = Mockito.mock(BankAccountRepository.class);

        BankAccountService bankAccountService = new BankAccountService(bankAccountRepository);
         Mockito.when(bankAccountRepository.fetchBalance("cust-123")).thenReturn(100.0);
        double balance = bankAccountService.fetchBalance(customerId);
        Assertions.assertEquals(100.0,balance);
        Mockito.verify(bankAccountRepository,times(1)).fetchBalance("cust-123");
    }

    @Test
    public void fetchBalanceShouldThrowAnExceptionWhenInvalidCustomerIdIsPassed(){

        String customerId ="cust-123";
//        BankAccountRepository bankAcccountRepository = new BankAccountRepository();
        BankAccountRepository bankAccountRepository = Mockito.mock(BankAccountRepository.class);

        BankAccountService bankAccountService = new BankAccountService(bankAccountRepository);
        Mockito.when(bankAccountRepository.fetchBalance("cust-123")).thenThrow(RuntimeException.class);
        Assertions.assertThrows(AccountNotAvailableException.class, () -> bankAccountService.fetchBalance(customerId));

        Mockito.verify(bankAccountRepository,times(1)).fetchBalance("cust-123");
    }

    @Test
    public void fetchBalanceShouldThrownAnExceptionDatabaseUnavailableWhenDatabaseIsDown(){
        String customerId ="cust-123";
//        BankAccountRepository bankAcccountRepository = new BankAccountRepository();
        BankAccountRepository bankAccountRepository = Mockito.mock(BankAccountRepository.class);

        BankAccountService bankAccountService = new BankAccountService(bankAccountRepository);
        Mockito.when(bankAccountRepository.fetchBalance("cust-123")).thenThrow(RuntimeException.class);
        Assertions.assertThrows(SystemNotAvailableException.class, () -> bankAccountService.fetchBalance(customerId));

        Mockito.verify(bankAccountRepository,times(1)).fetchBalance("cust-123");
    }

    @Test
    public void fetchBalanceShouldThrownANetworkExceptionWhenNetworkIsUnavailable(){

    }

    public void shouldSendEmailNotificationToUsers(){
        BankAccountRepository bankAccountRepository = new BankAccountRepository();
        BankAccountService bankAccountService = new BankAccountService(bankAccountRepository);

    }
}
