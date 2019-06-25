### Java Design Patterns Factory Method

# Factory Method Overview

Methods to make and return components of one object various ways. 

In this example the SoupFactoryMethod defines the makeSoupBuffet method which returns a SoupBuffet object. The SoupFactoryMethod also defines the methods needed in creating the SoupBuffet. 

The BostonSoupFactoryMethodSubclass and the HonoluluSoupFactoryMethodSubclass both extend the SoupFactoryMethod. An object can be defined as an SoupFactoryMethod, and instantiated as either a BostonSoupFactoryMethodSubclass (BSFMS) or a HonoluluSoupFactoryMethodSubclass (HSFMS). 

Both BSFMS and HSFMS override SoupFactoryMethod's makeFishChowder method. The BSFMS returns a SoupBuffet with a FishChowder subclass of BostonFishChowder, while the HSFMS returns a SoupBuffet with a FishChowder subclass of HonoluluFishChowder.


### SoupFactoryMethod.java - a Factory Method

// code for SoupFactoryMethod.java 

### BostonSoupFactoryMethodSubclass.java - One of Two Subclass Factory Method

// code for BostonSoupFactoryMethodSubclass.java

### HonoluluSoupFactoryMethodSubclass.java - Two of Two Subclass Factory Methods

// code for HonoluluSoupFactoryMethodSubclass.java

### Soup.java - A helper class

//code for Soup.java

### SoupBuffet.java - A helper class
//code for SoupBuffet.java

### TestSoupFactoryMethod.java - testing the factory method
//code for TestSoupFactoryMethod.java
