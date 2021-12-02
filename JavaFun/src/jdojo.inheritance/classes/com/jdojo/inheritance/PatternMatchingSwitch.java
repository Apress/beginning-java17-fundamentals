//
package com.jdojo.inheritance;

/**
 *
 * @author adavis
 */
public class PatternMatchingSwitch {

    static class Person {
        int id;
        float salary;

        public int getId() {
            return id;
        }

        public float getSalary() {
            return salary;
        }
    }
    static class Clerk extends Person {
        float totalSales;

        public float getTotalSales() {
            return totalSales;
        }
    }
    static class Manager extends Person {
        boolean senior;

        public boolean isSenior() {
            return senior;
        }        
    }
    static class Employee extends Person {
    }
    
    public static void main(String[] args) {
        System.out.println(getFormattedString(new Employee()));
        System.out.println(getFormattedString(new Clerk()));
        System.out.println(getFormattedString(new Manager()));
    }

    public static String getFormattedString(Object o) {
        return switch (o) {
            case Employee e -> String.format("Employee, ID is %d", e.getId());
            case Manager m -> String.format("Manager, salary is %f", m.getSalary());
            case Clerk c -> String.format("Clerk, total sales is %f", c.getTotalSales());
            default -> o.toString();
        };
    }

}
