# Strategy pattern

The Strategy Design Pattern defines a family of algorithms, encapsulating each one, and making them interchangeable. 
Strategy lets the algorithm vary independently of the clients that use it.

The Strategy pattern is useful when there is a set of related algorithms and a client object needs to be able to 
dynamically pick and choose an algorithm from this set that suits its current need. The Strategy pattern suggests
keeping the implementation of each of the algorithms in a separate class. Each such algorithm encapsulated in a 
separate class is referred to as a strategy. An object that uses a Strategy object is often referred to as a context object.

### Design Principles used in strategy pattern

```markdown
    1. Identify the aspects of your application that vary and separate them from what stays the same.
    2. Program to an interface, not an implementation.
    3. Favor composition over inheritance(HAS-A can be better than IS-A).
```



- ###### Identify the aspects of your application that vary and separate them from what stays the same.
```text
In other words, if you’ve got some aspect of your code that is changing, say with every new requirement, then you know 
you’ve got a behavior that needs to be pulled out and separated from all the stuff that doesn’t change.

Here’s another way to think about this principle: take the parts that vary and encapsulate them, so that later you can
alter or extend the parts that vary without affecting those that don’t.
```

- ###### Program to an interface, not an implementation.
```text
We’ll use an interface to represent each behavior — for instance, FlyBehavior and QuackBehavior, and each implementation 
of a behavior will implement one of those interfaces.

As you’ve seen, creating systems using composition gives you a lot more flexibility. Not only does it let you 
encapsulate a family of algorithms into their own set of classes, but it also lets you change behavior at runtime as 
long as the object you’re composing with implements the correct behavior interface.
```

- ###### Favor composition over inheritance.
```text
HAS-A can be better than IS-A

When you put two classes together like this you’re using composition. Instead of inheriting their behavior, the ducks 
get their behavior by being composed with the right behavior object.
```