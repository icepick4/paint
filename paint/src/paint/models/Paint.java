/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paint.models;
import java.awt.Color;
/**
 *
 * @author Rémi JARA
 */
public class Paint {
    private Color color;
    private int x;
    private int y;
    private int width;
    private boolean smooth;
    private Tool tool;
    private String string;

    public Paint(int x, int y, int width, boolean smooth, Color color, Tool tool, String string) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.smooth = smooth;
        this.color = color;
        this.tool = tool;
        this.string = string;
    }

    //getters
    public Color getColor() {
        return color;
    }

    public Tool getTool() {
        return tool;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public boolean isSmooth() {
        return smooth;
    }    

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
