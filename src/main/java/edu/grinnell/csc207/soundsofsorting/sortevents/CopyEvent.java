package edu.grinnell.csc207.soundsofsorting.sortevents;

import java.util.Collections;
import java.util.List;

/**
 * A <code>CopyEvent</code> logs a copy of a value into an index of the array.
 */
public class CopyEvent<T> implements SortEvent<T> {

    private int index;
    private T value;

    public CopyEvent(int index, T value) {
        this.index = index;
        this.value = value;
    }

    @Override
    public void apply(T[] arr) {
        arr[index] = value;
    }

    @Override
    public List<Integer> getAffectedIndices() {
        return Collections.singletonList(index);
    }

    @Override
    public boolean isEmphasized() {
        return true;
    }
}
