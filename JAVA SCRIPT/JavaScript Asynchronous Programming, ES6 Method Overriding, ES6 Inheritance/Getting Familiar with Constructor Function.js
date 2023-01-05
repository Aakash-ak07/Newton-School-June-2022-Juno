// Complete the constructor function account. It should contain the fields accountNum, name, password, amount and a method to addInterest with the name addInterest. The default interest rate is 10%

// Now create a new class savingsAccount extended from the previous constructor function such that it accepts a new field called interest
// Now in this class add another addInterest method such that the interest is not 10% now instead its the new interest passed to this class.

// In the both classes(i.e the parent class and the child class) the addInterest method should be completed which takes no arguments but returns the current balance of that instance after adding the interest.
// Input
// The Account class constructor will take 5 arguments

// typeofAccount(single char='N') accountNum(string) password(string) name(string) currentbalance(number)


// The SavingsAccount class will take 6 arguments

// typeofAccount(single char='S') accountNum(string) password(string) name(string) currentbalance(number) interest(number)
// Output
// The method addInterest will return the current balance after adding interest
// Example


// const hey = new savingsAccount('newton1103', '*****', 'company', 1500, 20);
// let bal = hey.addInterest()
// console.log(bal) //1800


function account(accountNum, password, name, balance){
    this.accountNum = accountNum;
    this.password = password;
    this.name = name;
    this.balance = balance;
    this.interest = 0.1;
    this.addInterest=() => {
        this.balance = this.balance + (this.balance * this.interest);
        return this.balance;
    }
}

class savingsAccount extends account{
    constructor(accountNum, password, name, balance,interest){
      super(accountNum, password, name, balance);
      this.interest = interest / 100;
    }
    addInterest(){
        this.balance = this.balance + (this.balance * this.interest);
        return this.balance;
    }
}
