package com.edvinsson;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank myBank = new Bank("Citi");
        myBank.addBranch("Uptown");
        myBank.addBranch("Downtown");
        myBank.addCustomer("Steve","Uptown");
        myBank.addCustomer("Mary","Uptown");
        myBank.addCustomer("Steve","Downtown");
        myBank.addCustomer("Kate","Downtown");
        myBank.makeDeposit("Uptown","Steve",100.00);
        myBank.makeDeposit("Downtown","Steve",200.00);
        myBank.makeDeposit("Uptown","Mary",300.00);
        myBank.makeDeposit("Downtown","Kate",500.00);
        myBank.makeWithdrawal("Uptown","Steve",50.00);
        myBank.makeWithdrawal("Downtown","Steve",50.00);
        myBank.makeWithdrawal("Uptown","Mary",50.00);
        myBank.makeWithdrawal("Downtown","Steve",100.00);
        myBank.printTransactions("Downtown", "Steve");




    }
}
