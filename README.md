Assignment 3 

This project demonstrates the Adapter Design Pattern using the example of cars and a salesman.

i added different types of cars that can show their details.

The client (customer) does not directly interact with the car classes.

Instead, a Salesman ( as adapter) acts as the middleman, adapting the car’s behavior into a simple method sellCar().

This illustrates how the Adapter Pattern allows two incompatible interfaces (car details vs. selling process) to work together.

Classes that i used

1)Car (Interface)

Defines the basic showDetails() method for all cars.

2)Sedan (concrete class)

Implements car, prints sedan details.

3)SUV (also concrete lass)

Implements car, prints SUV details.

4)SalesmanAdapter (adapter)

Provides the method sellCar that calls the car’s details and simulates selling.

5)Main (Client)

Demonstrates usage of the adapter.

Creates cars and uses the SalesmanAdapter to sell them.


Adapters main wrok:

1)Cars only know how to show details.

2)The client expects a action: selling.

3)The SalesmanAdapter translates between the car and the customer by adapting showDetails() into sellCar().

-Example Output
Salesman:
Sedan: this car is very good
Car sold

Salesman:
SUV: this is better than little sedan
Car sold


So, the adapter pattern is used to bridge the gap between car details and the selling process.
Just like in real life, cars cannot sell themselves — the salesman acts as the adapter to connect products with customers.
