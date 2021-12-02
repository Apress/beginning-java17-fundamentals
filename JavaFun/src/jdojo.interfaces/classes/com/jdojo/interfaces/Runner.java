// Runner.java
package com.jdojo.interfaces;

// Enforces that Runner is a functional interface
@FunctionalInterface
public interface Runner {
    
    public void run();
}

class RunnerTester {
    
    // Demonstrates using a functional interface
    public void test() {
        Runner r = () -> System.out.println("Running");
        
        // later on...
        r.run();
    }
}
