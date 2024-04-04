9a 
•	Inheritance in object-oriented programming is where one class becomes an extension of another class, inheriting the members of that class.
•	Two parties involved in inheritance are a parent (superclass) and a child (subclass).
•	The child class inherits the members of the parent class, allowing for the reuse of data that already exists within other classes.
•	Subclasses should be a more specialized form of the superclass they inherit from.
•	If an "employee" class is created later, it can inherit from the person class, gaining access to the name, age, and gender fields.
•	The employee class can then focus on defining things specific to employees, such as employee ID and title.
•	The inheritance relationship is known as an "is-a" relationship, where an employee is a specialized type of person.
•	The video demonstrates inheritance with code by creating a person class and an employee class that inherits from the person class using the keyword "extends."
•	Inheritance allows for the reuse of code and simplifies the process of defining classes by inheriting attributes and methods from a superclass.


9b
•	Inheritance involves constructors working in a specific way.
•	When creating a new instance of a subclass, it first calls the superclass's constructor before executing the subclass's constructor.
•	If the superclass doesn't have a default constructor, the subclass must explicitly call one of its other constructors.
•	Explicit calls to the superclass's constructor must be the first line in the subclass's constructor.
•	By explicitly defining constructors in the subclasses, the default constructor from Java is not automatically provided.
•	Understanding the order in which constructors are called in inheritance ensures proper initialization of classes.


9c
•	She explains the concept of method overriding in object-oriented programming.
•	Example used is a square inheriting from a rectangle class to demonstrate method overriding.
•	Demonstrates how to create a square class that inherits the calculate perimeter method from the rectangle class but overrides it with a different implementation specific to squares.
•	Importance of using the @Override annotation in Java to indicate intentional method overriding.
•	touches on method overloading, involving having two methods with the same name but different parameter lists.
•	Demonstrates how method overloading can be applied in a subclass to overload a method inherited from a superclass.


9d
•	In object-oriented programming, not everything is inherited when a subclass inherits from a superclass.
•	Constructors are not technically members of a class and therefore are not inherited.
•	Public and protected methods and fields in a superclass are inherited, but private methods and fields are not.
•	Final methods, marked with the keyword "final" in the header, are inherited but cannot be overridden.
•	Access modifiers play a crucial role in inheritance.
•	Fields marked as protected or public can be inherited, but if marked as private, they cannot be inherited.
•	Methods with public access modifiers in the superclass must be declared as public in the subclass.
•	Attempting to assign weaker access privileges will result in an error.
•	In Java, a class can only directly inherit from one superclass, but a superclass can inherit from another class, forming a chain of inheritance.
•	All classes in Java implicitly inherit from the Object class.




10
•	Polymorphism in object-oriented programming allows a subclass to define its own unique behaviors while sharing some behaviors with its superclass.
•	An example of polymorphism is demonstrated using classes for animals, dogs, and cats.
•	Polymorphism is shown through overriding methods and casting objects to different types within the hierarchy.
•	Polymorphism enables passing different subclass objects as arguments to a method that accepts objects of the superclass.
•	Using the "instance of" operator, the program can determine the actual subclass type of an object passed to the method and execute specific behaviors accordingly.
•	Polymorphism allows an object to have a superclass type and in a subclass instance, polymorphic objects can only access the methods of their type, not their instance, unless casting is used.
•	If a method is overwritten by the subclass, the polymorphic object will execute the overridden method at runtime.
•	The instance of operator is used to determine if an object is an instance of a certain class.
•	Optional assignment: Create a class called Fruit with a field called calories and a method called make juice. Create two subclasses of the Fruit class, such as Apple and Banana, with specific methods for each. Set the calories within the constructors of these subclasses and override the make juice method to print a specific type of juice.
•	Finally, create a Market class to test polymorphism by creating variations of these objects.



11a
•	The video discusses the principle of abstraction in object-oriented programming.
•	Abstraction is defined as something that exists in theory but does not have a concrete existence.
•	In Java, the reserved word "abstract" is used as a modifier for classes and methods.
•	An abstract class is not meant to be instantiated but to be extended by subclasses.
•	Abstract methods have no body and are meant to be overridden by subclasses.
•	The video demonstrates creating abstract methods and classes in Java, extending abstract classes, implementing abstract methods in subclasses, and the concept of abstract classes serving as templates for more specific subclasses.
•	Abstraction helps in setting standards and providing behavior templates for subclasses.
•	If a subclass inherits from an abstract class, it must implement the abstract methods or the class itself must be declared as abstract.
•	Abstract classes cannot be instantiated; they are meant to be used as superclasses.
•	If even one method in a class is abstract, then the entire class must be declared abstract as well.


11b
The video explains the concept of interfaces in Java programming.
•	An interface is similar to an abstract class, but all methods in an interface are abstract by nature, meaning they have no implementation.
•	Interfaces are implemented, not extended, and any class that implements an interface must implement all of its methods or declare itself as abstract.
•	The video demonstrates creating a product interface with abstract methods for price, name, and color, and then creating a book class that implements the product interface.
•	It also explains how in Java 8, default methods were introduced in interfaces to provide a default implementation for added methods without breaking existing implementations.
•	Key points about interfaces include that they cannot be instantiated, methods in an interface are all abstract, and a class can implement multiple interfaces by specifying them in the class header.
•	an abstract class named Animal is created, which declares an abstract method called makeSound and implements a non-abstract method called eat.
•	Then, a Pig class and a Duck class are created, both of which extend the Animal class.
•	Finally, a Form class is created to test these implementations.
