package com.bank.controller;

import com.bank.Bank;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankingController {

    Bank iciciBank = new Bank();

    @GetMapping("/hello")
    public String addCustomer(){
        return "Hello World";
    }

    @GetMapping("/add/{name}")
    public int addCustomer(@PathVariable("name") String name){
        return iciciBank.addCustomer(name);
    }

    @GetMapping("/balance/{accountNo}")
    public Double getBalance(@PathVariable("accountNo") int accountNo){

        Double balance = iciciBank.gatBalance(accountNo);
        return balance;
    }

    @GetMapping("/deposit/{acc}/{money}")
    public Double Deposit(@PathVariable("acc") int accountNo , @PathVariable("money") Double money){
        return iciciBank.Deposit(money,accountNo);
    }

    @GetMapping("/interest/{accountNo}")
    public Double getInterest(@PathVariable("accountNo") int accountNo ){
        return iciciBank.getInterest(accountNo);
    }
}
