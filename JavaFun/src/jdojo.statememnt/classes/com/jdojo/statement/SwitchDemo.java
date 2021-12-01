// SwitchDemo.java
package com.jdojo.statement;

/**
 *
 * @author adavis
 */
public class SwitchDemo {

    public static void main(String[] args) {
        demo1();
        demo2();
        demo3();
        switchExpression();
        switchExpression2();
    }

    private static void demo1() {
        int i = 10;
        switch (i) {
            case 10: // Found the match
                System.out.println("Ten"); // Execution starts here
            case 20:
                System.out.println("Twenty"); // Also executes this statement
            default:
                System.out.println("No-match"); // Also executes this statement
        }
    }

    private static void demo2() {
        int i = 50;
        switch (i) {
            case 10: // Found the match
                System.out.println("Ten");
            case 20:
                System.out.println("Twenty");
            default:
                System.out.println("No-match"); // Execution starts here
        }
    }

    private static void demo3() {
        int i = 50;
        switch (i) {
            case 10: // Found the match
                System.out.println("Ten");
            default:
                System.out.println("No-match"); // Execution starts here
            case 20:
                System.out.println("Twenty");
        }
    }

    private static void switchExpression() {
        int i = 10;
        switch (i) {
            case 10 ->
                System.out.println("i is 10");
            case 20 ->
                System.out.println("i is 20");
            default ->
                System.out.println("i is neither 10 nor 20");
        }
        String message = switch (i) {
            case 10 ->
                "i is 10";
            case 20 ->
                "i is 20";
            default ->
                "i is neither 10 nor 20";
        };
        System.out.println(message);
    }

    private static void switchExpression2() {
        var i = 50;
        var message = switch (i) {
            case 10, 15 ->
                "i is ten or fifteen";
            case 20 -> {
                String str = "i is";
                yield str + " twenty";
            }
            default ->
                throw new RuntimeException("i is not 10, 15, or 20");
        };
        System.out.println(message);
    }
    
    
}
