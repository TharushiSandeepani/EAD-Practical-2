# SOLID Design Principles

The SOLID principles are a set of five design guidelines intended to make software designs more understandable, flexible, and maintainable. They help developers avoid code rot and refactor code efficiently.

## 1. Single Responsibility Principle (SRP)
> **"A class should have one, and only one, reason to change."**

This principle states that a class should only handle one specific functionality. If a class has multiple responsibilities, it becomes coupled; a change to one responsibility might impair or inhibit the ability of the class to meet the others.

* **Goal:** High cohesion and low coupling.

## 2. Open/Closed Principle (OCP)
> **"Software entities should be open for extension, but closed for modification."**

You should be able to add new functionality to a class without changing its existing code. This is typically achieved by using interfaces or abstract classes, allowing you to add new behaviors by creating new classes rather than editing existing ones.

* **Goal:** Make the system easy to extend without risking bugs in existing code.

## 3. Liskov Substitution Principle (LSP)
> **"Subtypes must be substitutable for their base types."**

If class `B` is a subclass of class `A`, you should be able to pass an object of class `B` to any method that expects an object of class `A` without breaking the program. Subclasses should extend the behavior of the parent class without changing its fundamental characteristics.

* **Goal:** Ensure inheritance is used correctly and reliably.

## 4. Interface Segregation Principle (ISP)
> **"Clients should not be forced to depend on methods they do not use."**

It is better to have many small, specific interfaces than one general-purpose interface. Classes should not be forced to implement interfaces they don't need. This keeps the system decoupled and easier to refactor.

* **Goal:** Split large interfaces into smaller, more specific ones.

## 5. Dependency Inversion Principle (DIP)
> **"High-level modules should not depend on low-level modules. Both should depend on abstractions."**

Instead of high-level classes (business logic) depending directly on low-level classes (database connections, IO), both should depend on interfaces. This decouples the code and makes it easier to swap out dependencies (e.g., changing databases).

* **Goal:** Reduce dependencies between modules.
