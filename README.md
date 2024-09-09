# My First Project with Java

This project will be a simple tool for an owner of a small corner shop to calculator their expenses
and find out how much they earned in that month.

As the name suggests, it's supposed to be the first project for Java track learners on Hyperskill.

## Stage 1/3: Print the prices

In this stage, the program prints the names and prices of some items to the console. Some of those items 
include pancake, ice cream, toffee, and milk chocolate.

[Stage 1 implementation](src/calculator/PricesPrinter.java)

Example: 

    Prices:
    Bubblegum: $2
    Toffee: $0.2
    Ice cream: $5
    Milk chocolate: $4
    Doughnut: $2.5
    Pancake: $3.2

## Stage 2/3: Measuring total income

This stage is built upon the previous one. In addition to printing items' details, the total income
is also calculated and printed out, which is the sum of all prices. 

[Stage 2 implementation](src/calculator/IncomeCalculator.java)

Example:

    Earned amount:
    Bubblegum: $202
    Toffee: $118
    Ice cream: $2250
    Milk chocolate: $1680
    Doughnut: $1075
    Pancake: $80
    
    Income: $7777.0

## Stage 3/3: Calculate net income

In this stage, in addition to items prices and the total income,net income is also calculated. 
For that, the program reads two integers from input, and cost of staff expenses, and additional expenses. 
Net income is calculated as follows:

`Net income = income - Staff expenses - Additional Costs `

[Stage 3 implementation](src/calculator/NetIncomeCalculator.java)

Example:

    Earned amount:
    Bubblegum: $202
    Toffee: $118
    Ice cream: $2250
    Milk chocolate: $1680
    Doughnut: $1075
    Pancake: $80
    
    Income: $5405
    Staff expenses:
    > 2000
    Other expenses:
    > 205
    Net income: $3200

