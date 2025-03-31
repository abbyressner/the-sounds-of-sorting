package edu.grinnell.csc207.soundsofsorting.events;

import java.util.Arrays;
import java.util.List;

/**
 * A <code>CompareEvent</code> logs a comparison a sort makes between two
 * indices in the array.
 */
public class CompareEvent<T> implements SortEvent<T> {

    private int index1, index2;

    public CompareEvent(int index1, int index2) {
        this.index1 = index1;
        this.index2 = index2;
    }

    @Override
    public void apply(T[] arr) {}

    @Override
    public List<Integer> getAffectedIndices() {
        return Arrays.asList(index1, index2);
    }

    @Override
    public boolean isEmphasized() {
        return false;
    }
}