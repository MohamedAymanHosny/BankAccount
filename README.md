# Banking System in Java

This project simulates a simple banking system. It allows users to create and manage bank accounts, perform deposits and withdrawals, and retrieve account details.

## Overview of Components

### BankAccount Class

- **Purpose**: 
  - Represents a single bank account. 
  - Provides methods to manage account data and operations.

- **Key Attributes**:
  - **Account Number**: A unique identifier for each bank account.
  - **Customer Name**: The name of the account holder.
  - **Balance**: The current amount of money in the account.

- **Key Functions**:
  - **Constructor**: Initializes a new account with an account number, customer name, and balance.
  - **Getters**: Methods to retrieve the account number, customer name, and balance.
  
  - **Deposit Function**:
    - Allows adding money to the account.
    - Validates that the deposit amount is positive.
  
  - **Withdraw Function**:
    - Allows removing money from the account.
    - Validates that there are sufficient funds and the amount is positive.

  - **Display Function**:
    - Prints the account details (account number, customer name, and balance) to the console.

### Main Class

- **Purpose**: 
  - Manages user interaction and operations related to multiple bank accounts.

- **Key Functions**:
  - **User Input Handling**: 
    - Prompts users for the number of accounts and collects their details.
  
  - **Menu Display**:
    - Shows available options such as viewing account details, searching for accounts, depositing, and withdrawing funds.
  
  - **Operations**:
    - **Display All Accounts**: Lists all account details.
    - **Search by Account Number**: Allows users to find specific accounts.
    - **Deposit and Withdraw**: Facilitates the addition and removal of funds from accounts.

## Project Workflow

1. **Initial Setup**:
   - The user specifies the number of customers/accounts to create.
   - The user enters details for each account.

2. **Menu Navigation**:
   - After creating accounts, a menu is presented for various operations:
     - View all accounts.
     - Search for a specific account.
     - Deposit or withdraw funds.

3. **Account Management**:
   - Users interact with their accounts through the menu options.
   - Operations are validated to ensure correctness (e.g., no negative amounts, sufficient funds).

4. **Exit Process**:
   - The application runs in a loop until the user decides to exit.

## Conclusion

This project serves as a foundational example of a banking system in Java. It demonstrates essential programming concepts such as:
- Object-oriented design.
- User input handling.
- Basic data validation.

### Future Enhancements

- Consider adding features like:
  - Different types of accounts (savings, checking).
  - Transaction history for accounts.
  - A graphical user interface (GUI) for better user experience.
