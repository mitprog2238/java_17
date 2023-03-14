package org.mitprog1.j17.research.hierarchies.secure.sealed.classes;

/**
 * Sealed classes can help by imposing restrictions on the class hierarchies at the language level.
 *
 * */
public abstract sealed class Plant permits Herb, Shrub, Climber {
}
