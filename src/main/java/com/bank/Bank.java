package com.bank;

import java.util.ArrayList;

public class Bank {
    private int accountNo = 0;
    private Double interestRate = 4.0;
    private ArrayList<Customer> customers = new ArrayList<>();

    public int addCustomer(String name) {
        Customer c = new Customer(name, 100.0, ++accountNo);
        customers.add(c);
        return accountNo;
    }

    public Double gatBalance(int accountNo) {
        for (Customer k : customers) {
            if (k.accountNo == accountNo) {
                return k.balance;
            }
        }
        return null;
    }

    public Double Deposit(Double money, int accountNo) {

        for (Customer k : customers) {
            if (k.accountNo == accountNo) {
                return k.balance = k.balance + money;
            }
        }
        return null;
    }

    public Double Withdraw(int accountNo, Double money) {
        for (Customer k : customers) {
            if (k.accountNo == accountNo && money <= k.balance) {
                return k.balance = k.balance - money;
            }
        }
        return null;
    }

    public void deleteAccount(int accountNo) {
        for (Customer k : customers) {
            if (k.accountNo == accountNo) {
                customers.remove(k);
                break;
            }
        }
    }

    public Double getInterest(int accountNo) {
        for (Customer k : customers) {
            if (k.accountNo == accountNo) {
                Double interest = k.balance / 100 * interestRate;
                return interest;
            }
        }
        return null;
    }

    public String changeName( int accountNo ,String name) {
        for (Customer k : customers) {
            if (k.accountNo == accountNo) {
                k.name = name;
                return "name changed successfully";
            }

        }
        return " Account Number is incorrect";
    }

    public Customer getDetails(int accountNo){
        for(Customer c : customers){
            if(c.accountNo == accountNo) return c;
        }

        return null;
    }
}