#The purpose of this program is to refence an example of how a bank account works. 

class Account
    attr_reader :name
    attr_reader :balance
  
    def initialize(name, balance= 100)
      @name = name 
      @balance = balance
    end
  
    private #pin private method
    def pin
      @pin = 1234
    end
  
    private #pin error private method
    def pin_error
      return "Access denied: incorrect PIN."
    end
  
    public #checking balance
    def display_balance(pin_number)
      if pin_number == pin
        puts "Balance: $#{@balance}"
      else
        puts pin_error
      end
    end
  
    public #withdraw method
    def withdraw(pin_number, amount)
      if pin_number == pin
        @balance -= amount
        puts "Withdrew #{amount}. Your new balance is: $#{@balance}"
      else
        puts pin_error
      end
    end
  
    public 
    def deposit(pin_number, amount)
      if pin_number == pin
        @balance += amount
        puts "Your deposit with the amount of: #{amount} was successful. your new balance is: $#{@balance}"
      else
        puts pin_error
      end
    end
      
  end #end of Account class
  
  checking_account = Account.new("savings", 3000)
  checking_account.deposit(1234, 200)
  checking_account.display_balance(1234)


  