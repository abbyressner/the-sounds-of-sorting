package edu.grinnell.csc207.soundsofsorting;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * A drawing panel for visualizing the contents of a @NoteIndices object.
 */
public class ArrayPanel extends JPanel {
    @SuppressWarnings("unused")
    private NoteIndices notes;
   
    /**
     * Create a new <code>ArrayPanel</code> with the given notes and dimensions.
     * @param notes the note indices 
     * @param width the width of the panel
     * @param height the height of the panel
     */
    public ArrayPanel(NoteIndices notes, int width, int height) {
        this.notes = notes;
        this.setPreferredSize(new Dimension(width, height));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Integer[] noteIndices = notes.getNotes();
        int width = getWidth();
        int height = getHeight();
        int barWidth = width / noteIndices.length;
        
        int maxValue = 0;
        for (int i = 0; i < noteIndices.length; i++) {
            maxValue = Math.max(maxValue, noteIndices[i]);
        }
        
        for (int i = 0; i < noteIndices.length; i++) {
            int barHeight = (int) ((double) noteIndices[i] / maxValue * height);
            int x = i * barWidth;
            int y = height - barHeight;
            if (notes.isHighlighted(i)) {
                g.setColor(Color.RED);
            } else {
                g.setColor(Color.BLUE);
            }
            g.fillRect(x, y, barWidth - 1, barHeight);
        }
    }
}