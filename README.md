# Inheritance and Polymorphism Examples in Java

## Exercise 1: Contract Installments Calculation

### Exercise description:
A company wants to automate the processing of its contracts. Processing a contract consists of generating the installments to be paid for that contract, based on the desired number of months. The company uses an online payment service to process the installments. The online payment service charges monthly interest and a payment fee. Currently, the company uses Paypal, which applies simple interest of 1% per installment, plus a 2% payment fee.

Create a program that reads the contract data (contract number, contract date, and total contract value). The program should then read the number of installments and generate records of the installments to be paid (date and value). The first installment is due one month after the contract date, the second installment two months after the contract date, and so on. Finally, print the installment details on the screen.

### Example:
Enter contract data:<br>
Number: 8028<br>
Date (dd/MM/yyyy): 25/06/2018<br>
Contract value: 600.00<br>
Enter the number of installments: 3<br>

Installments:<br>
25/07/2018 - 206.04<br>
25/08/2018 - 208.08<br>
25/09/2018 - 210.12<br>

Installment #1:<br>
200 + 1% * 1 = 202<br>
202 + 2% = 206.04<br>

Installment #2:<br>
200 + 1% * 2 = 204<br>
204 + 2% = 208.08<br>

Installment #3:<br>
200 + 1% * 3 = 206<br>
206 + 2% = 210.12<br>

## Exercise 2: Employees Payment System

### Exercise description:
A company has both regular employees and outsourced employees. For each employee, the company wants to store the name, worked hours, and hourly rate. Outsourced employees also have an additional charge for expenses. The salary of regular employees is calculated by multiplying the worked hours by the hourly rate, while outsourced employees receive an additional 110% of their additional charge as a bonus.

Write a program to read the data of `N` employees (N is provided by the user) and store them in a list. After reading all the data, display the name and salary of each employee in the order they were entered.
