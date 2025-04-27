GuessTheNum.java
🎯 About
GuessTheNum is a simple console-based number guessing game.

A random number between 0 and 99 is generated.

The user tries to guess the number.

The program gives hints whether the guess is too high or too low.

After each wrong guess, the user can choose whether to continue or quit.

If the user guesses correctly, the game ends with a success message.

🛠️ Features
Random number generation

User-friendly hints after each guess

Option to quit anytime

Displays correct answer if the user quits

Proper input validation

🧠 How It Works
User inputs a guess.

Program checks and tells:

"Too high"

"Too low"

"Correct!"

If wrong, user chooses whether to continue guessing.

On quitting, the correct number is shown.

********************************************************************************************************************************************************************************************************************
GradeStudent.java
🎯 About
GradeStudent is a console application for calculating a student's academic performance.

It asks for marks in four subjects (Math, Science, English, Social Studies).

It calculates:

Total marks

Average marks

Percentage

(Optional extension: Letter grade system)

🛠️ Features
Input marks for multiple subjects

Calculates and displays total, average, and percentage

Allows user to recheck info multiple times

Input validation for choices

🧠 How It Works
The user chooses whether to check their grades.

If "yes":

Enter marks for each subject.

Program calculates and displays the results.

After displaying, user can choose to repeat or exit.

********************************************************************************************************************************************************************************************************************
Bank Account System Simulation
This project simulates a Bank Account System where users can perform actions such as depositing money, withdrawing money, and checking their balance. The system follows Object-Oriented Programming principles, specifically Abstraction, to model the bank account and user operations.

Features:
Deposit Money:

Allows users to deposit a specified amount into their account balance.

Withdraw Money:

Allows users to withdraw a specified amount from their account balance.

Checks for sufficient balance before proceeding with the withdrawal.

Check Balance:

Displays the current balance of the user’s account.

Account Handling:

The BankAccount class is an abstract class that defines the basic operations (deposit, withdrawal, and balance display).

The UserAccount class extends the BankAccount class and implements the methods for depositing, withdrawing, and displaying the balance.

How it Works:
User Initialization:

The program creates a UserAccount object with an initial balance of 0 (or any specified amount).

Menu System:

The program repeatedly shows a menu with options: Deposit, Withdraw, Check Balance, and Exit.

The user selects an option by entering the corresponding number.

Deposit:

When the user selects Deposit, the system prompts the user to enter the amount to deposit.

The account balance is updated accordingly, and the new balance is displayed.

Withdraw:

When the user selects Withdraw, the system prompts the user to enter the amount to withdraw.

If the user has enough balance, the withdrawal is successful, and the updated balance is displayed.

If the user has insufficient balance, an error message is shown.

Check Balance:

When the user selects Check Balance, the current balance is displayed.

Exit:

If the user selects Exit, the program thanks them and ends the session.

Code Structure:
BankAccount (Abstract Class):

Defines abstract methods for deposit, withdrawal, and displayBalance.

UserAccount (Concrete Class):

Implements the methods from BankAccount.

Handles the logic for depositing, withdrawing, and displaying the balance.

Main Method:

The Main method controls the flow of the program. It interacts with the user, processes their input, and calls the appropriate methods for each action.


