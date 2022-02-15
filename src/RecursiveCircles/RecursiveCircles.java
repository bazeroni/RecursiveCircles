// RecursiveCircles.java
// program for drawing a recursive circle pattern and displaying it for CSCI 112
// last edited Feb. 14, 2022 by S. Gutierrez

package RecursiveCircles;

// imports drawing and graphics libraries
import java.awt.*;
import javax.swing.*;

// the RecursiveCircles class displays the main initialization of the canvas in main()
public class RecursiveCircles {

    public static void main(String[] args) {

        // creates a MyCanvas object
        MyCanvas canvas1 = new MyCanvas();

        // sets up a JFrame to hold the canvas
        JFrame frame = new JFrame();
        frame.setTitle("Recursive Circles Showcase");
        frame.setSize(1200, 1200);
        frame.setLocation(0, 0);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // adds the canvas to the frame as a content panel
        frame.getContentPane().add(canvas1);
        frame.setVisible(true);

    } // ends main class

} // ends RecursiveCircles() class

// MyCanvas class holds the program that conducts the drawing components
class MyCanvas extends Canvas {

    // constructor
    public MyCanvas() { } // end MyCanvas() constructor

    // paint() method paints to the canvas with contained commands
    public void paint(Graphics g) {

        // calls the circle method with given arguments
        drawCircle(g, 600, 600, 600);

    } // end paint() method

    // drawCircle is a recursive method that draws a circle with given radius, n
    // it then calls two more times with radii of n / 2, recursively drawing two circles who's midpoints occur at the two intersections of the original previous circle's perimeter and the constant x-axis
    public void drawCircle(Graphics graphics, int radius, int x, int y) {

        // base case checks if the radius size is below a certain threshold
        if (radius < 1) { return; } // end base case

        // draws circle with given coordinates adjusted to midpoint of circle
        // dimensions of circle calculated with diameter = radius * 2
        graphics.drawOval(x - radius, y - radius, radius*2, radius*2);

        // recursively calls method two times for each side of the circle
        // each call adjusts midpoint to edge of each side of circle according to given radius
        drawCircle(graphics, radius / 2, x - radius, y);
        drawCircle(graphics, radius / 2, x + radius, y);

    } // end drawCircle() class

} // end MyCanvas() class