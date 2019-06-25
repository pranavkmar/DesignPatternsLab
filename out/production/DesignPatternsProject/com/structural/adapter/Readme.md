# Java Design Patterns Adapter

## Adapter (aka Wrapper) Overview

In the Adapter Design Pattern, a class converts the interface of one class to be what another class expects. 

The adapter does this by taking an instance of the class to be converted (the adaptee) and uses the methods the adaptee has available to create the methods which are expected. 

In this example we have a TeaBall class which takes in an instance of LooseLeafTea. The TeaBall class uses the steepTea method from LooseLeafTea and adapts it to provide the steepTeaInCup method which the TeaCup class requires.

### TeaBag.java - the class which the adapter will make the adaptee adapt to
//code for TeaBag.java

### TeaBall.java - the adapter
//code for TeaBall.java

### LooseLeafTea.java - the adaptee
// Code for the LooseLeafTea.java

### TeaCup.java - the class that accepts class TeaBag in it's steepTeaBag() method, and so is being adapted for.
// code for TeaCup.java


### TestTeaBagAdaptation.java - testing the adapter
// Code for TestTeaBagAdaptation.java



