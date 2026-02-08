from abc import ABC, abstractmethod

# SRP/OCP: Abstract Base Class defines the contract.
# Logic for "what an account is" is separated from "how input is handled".
class Account(ABC):
    def __init__(self, account_no, account_name, balance=0.0):
        self.account_no = account_no
        self.account_name = account_name
        self.balance = balance

    @abstractmethod
    def withdraw(self, amount):
        pass

    def __str__(self):
        return f"Account No: {self.account_no}\nAccount Name: {self.account_name}\nBalance: {self.balance}"

# OCP/LSP: SavingAccount implements specific rules.
# You can add new Account types (e.g. FixedDeposit) without changing this class.
class SavingAccount(Account):
    MIN_BALANCE = 500

    def withdraw(self, amount):
        new_balance = self.balance - amount
        if new_balance < self.MIN_BALANCE:
            raise Exception("Insufficient funds! Minimum balance of 500 required.")
        self.balance = new_balance
        return self.balance

# OCP/LSP: CurrentAccount implements its own specific rules.
class CurrentAccount(Account):
    def withdraw(self, amount):
        # Current accounts might imply overdraft, but for now simple subtraction
        self.balance -= amount
        return self.balance

# SRP: Factory responsible only for object creation logic
class AccountFactory:
    @staticmethod
    def create_account(acc_type, acc_no, acc_name, balance):
        if acc_type == "SAVING":
            return SavingAccount(acc_no, acc_name, balance)
        elif acc_type == "CURRENT":
            return CurrentAccount(acc_no, acc_name, balance)
        else:
            raise Exception("Invalid Account Type. Please enter SAVING or CURRENT.")

# SRP: Handles User Input/Output only. Separates UI from Business Logic.
class BankingSystemUI:
    def run(self):
        try:
            acc_no = input("Enter Account Number: ")
            acc_name = input("Enter Customer Name: ")
            acc_type = input("Enter Account Type (SAVING/CURRENT): ").upper()
            balance = float(input("Enter Balance: "))

            # Create account using Factory (DIP/OCP)
            account = AccountFactory.create_account(acc_type, acc_no, acc_name, balance)
            
            amount = float(input("\nEnter Amount to be Withdrawn: "))
            account.withdraw(amount)

            print("\n--- After Withdrawal ---")
            print(account)

        except Exception as e:
            print(f"Error: {e}")

if __name__ == "__main__":
    app = BankingSystemUI()
    app.run()
