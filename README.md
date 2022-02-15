# RecursiveCircles

Program for drawing a recursive circle pattern and displaying it. Utilizes Swing, AWT, and a recursive algorithm.

### Features

- **`RecursiveCircles:`** Displays the main initialization of the canvas in `main()`.

- **`MyCanvas:`** Holds the program that conducts the drawing components.

  - **`paint():`** Paints to the canvas with contained commands.

  - **`drawCircle():`** First, draws a circle with given `radius`, *n*. Second, calls two more times with radii of *n / 2*, and recursively draws two circles who's midpoints occur at the two intersections of the previous circle's perimeter and the constant x-axis.
  
---

*CSCI 112 001 15A SP22 - COMPUTER SCIENCE II*
