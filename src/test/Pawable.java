package test;

public interface Pawable<T extends Pawable> {

    public default void hasPaws(){};
}
