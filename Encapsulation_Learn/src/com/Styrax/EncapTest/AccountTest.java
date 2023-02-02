package com.Styrax.EncapTest;

public class AccountTest {
    public static void main(String[] args) {
        Account myAccount = new Account();
        myAccount.setName("苏荷雅");
        myAccount.setBalance(2200);
        myAccount.setPwd("123123");

        myAccount.showInfo();
    }
}
