package edu.grinnell.csc207.soundsofsorting.events;

import java.util.Arrays;
import java.util.List;

/**
 * A <code>CompareEvent</code> logs a comparison a sort makes between two
 * indices in the array.
 */
public class CompareEvent<T> implements SortEvent<T> {

    private int index1, index2;

    /**
     * Creates a new CompareEvent with the given indices.
     *
     * @param index1 the first index to compare
     * @param index2 the second index to compare
     */
    public CompareEvent(int index1, int index2) {
        this.index1 = index1;
        this.index2 = index2;
    }

    @Override
    public void apply(T[] arr) {
        // no action needed
    }

    /**
     * Returns the indices affected by this event.
     *
     * @return a list of the indices affected by this event
     */
    @Override
    public List<Integer> getAffectedIndices() {
        return Arrays.asList(index1, index2);
    }


    @Override
    public boolean isEmphasized() {
        return false;
    }
}