# Clean-Code
Explanation of SOLID principles with examples

S of SOLID : Single Responibility Principle
The single responsibility principle states that every Java class must perform a single functionality. Implementation of multiple functionalities in a single class mashup the code.

O of SOLID : Open/closed Principle
The Open/Closed principle states that according to new requirements, the module should be open for extension but closed for modification.

L of SOLID : Liskov Substitution Principle
It applies to inheritance in such a way that the derived class must be completely substitutable for their base class. In other words, if class A is a subtype of class B, then we should be able to replace B with A without interrupting the behaviour of the program.

I of SOLID : Interface Segregation Principle
Interface Segregation Principle states that the larger interfaces split into smaller ones. Because the implementation classes use only the methods that are required. We should not force the client to use the methods that they do not want to use.

D of SOLID : Dependency Inversion Principle
This principle states that we must use abstraction (abstract class and interface) instead of concrete implementations. High-level modules should not depend on the low-level module but both should depend on the abstraction.
