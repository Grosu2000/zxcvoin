\# API Reference: Console Calculator



\## Package Structure



com.calculator

├── Main

├── Menu

└── operations

&#x20;   ├── AddSub

&#x20;   ├── MulDiv

&#x20;   ├── PowMod

&#x20;   └── AdvancedMath


Classes and Methods

Class: Main

Entry point of the application.



Method: main(String\[] args)

Runs the main program loop.



Class: Menu

Displays the menu to the user.



Method: show()

Prints the menu with all available operations.



Class: AddSub

Basic arithmetic: addition and subtraction.



Method: add(double a, double b)

Returns the sum of two numbers.



Parameters:



a — first number



b — second number



Returns: a + b



Method: subtract(double a, double b)

Returns the difference of two numbers.



Returns: a - b



Class: MulDiv

Basic arithmetic: multiplication and division.



Method: multiply(double a, double b)

Returns the product of two numbers.



Returns: a \* b



Method: divide(double a, double b)

Returns the quotient of two numbers.



Throws: ArithmeticException if b == 0



Returns: a / b



Class: PowMod

Power and modulus operations.



Method: power(double a, double b)

Returns a raised to the power b.



Returns: Math.pow(a, b)



Method: modulus(double a, double b)

Returns the remainder of division.



Throws: ArithmeticException if b == 0



Returns: a % b



Class: AdvancedMath

Advanced mathematical operations.



Method: sqrt(double a)

Returns the square root of a number.



Throws: ArithmeticException if a < 0



Returns: Math.sqrt(a)



Method: log(double a)

Returns the natural logarithm of a number.



Throws: ArithmeticException if a <= 0



Returns: Math.log(a)



Method: sin(double a)

Returns the sine of a number (in radians).



Returns: Math.sin(a)

