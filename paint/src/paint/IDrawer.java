/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package paint;
import java.awt.Color;
import java.awt.Point;

import paint.models.Tool;
/**
 *
 * @author remi
 */
public abstract interface IDrawer {
    public abstract Color getSlateColor();
    public abstract Tool getSlateTool();
    public abstract boolean isSlateSmooth();
    public abstract void newColorChoosen(Color color);
    public abstract void newMousePosition(Point point);
    public abstract int getSlateWidth();
}
