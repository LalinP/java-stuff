package com.java.stuff.designpatterns.singleton;

public class Singleton {

  private Singleton() {

  }
  //lazy loading AND thread safe. Now the singleton is created on demand. Not eager loading
  private static class LazyInstanceLoader {
     static final Singleton INSTANCE =  new Singleton();
  }
  public static Singleton getInstance() {
      return LazyInstanceLoader.INSTANCE;
  }
}
/**
 * The implementation of the idiom relies on the initialization phase of execution within the Java Virtual Machine (JVM)
 * as specified by the Java Language Specification (JLS).[3] When the class Something is loaded by the JVM,
 * the class goes through initialization. Since the class does not have any static variables to initialize,
 * the initialization completes trivially. The static class definition LazyInstanceLoader within it is not initialized until
 * the JVM determines that LazyInstanceLoader must be executed. The static class LazyInstanceLoader is only executed when the static
 * method getInstance is invoked on the class Singleton, and the first time this happens the JVM will load and initialize
 * the LazyInstanceLoader class.
 * The initialization of the LazyInstanceLoader class results in static variable INSTANCE being initialized by executing
 * the (private) constructor for the outer class Singleton.
 * Since the class initialization phase is guaranteed by the JLS to be sequential,
 * i.e., non-concurrent, no further synchronization is required in the static getInstance method during loading and initialization.
 * And since the initialization phase writes the static variable INSTANCE in a sequential operation,
 * all subsequent concurrent invocations of the getInstance will return the same correctly
 * initialized INSTANCE without incurring any additional synchronization overhead.
 */