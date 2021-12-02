// Security.java
package com.jdojo.inheritance;

/**
 * Sealed class
 * 
 * @author adavis
 */
public abstract sealed class Security { 
// code here...
	public final class Password extends Security { }
	public non-sealed class Lock extends Security { }
}
