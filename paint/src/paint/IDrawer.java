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
public interface IDrawer {
    public Color getSlateColor();
    public Tool getSlateTool();
    public boolean isSlateSmooth();
    public void newColorChoosen(Color color);
    public void newMousePosition(Point point);
}
