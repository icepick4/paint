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
        if (string == null) {
            this.string = "Default text";
        } else if (tool == Tool.STRING) {
            this.string = string;
        }
    }

    // getters
    public Color getColor() {
        return this.color;
    }

    public Tool getTool() {
        return this.tool;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isSmooth() {
        return this.smooth;
    }

    public String getString() {
        return this.string;
    }
}
