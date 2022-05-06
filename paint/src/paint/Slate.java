/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paint;
import java.awt.Dimension;
import java.util.ArrayList;

import paint.models.Paint;
/**
 *
 * @author remi
 */
public class Slate {
    private Dimension dimension;
    private IDrawer drawer;
    private ArrayList<Paint> paints;
    
    
    public Slate(Dimension dimension, IDrawer drawer) {
        this.dimension = dimension;
        this.drawer = drawer;
        this.paints = new ArrayList<Paint>();
    }
}
