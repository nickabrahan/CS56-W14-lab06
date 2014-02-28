package edu.ucsb.cs56.w14.drawings.nabrahan.advanced;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;  // single lines
import java.awt.geom.Ellipse2D;  // ellipses and circles
import java.awt.geom.Rectangle2D; // for the bounding box
import java.awt.Rectangle;  // squares and rectangles
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;


import edu.ucsb.cs56.w14.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.w14.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Phill Conrad 
 * @version for CS10, lab06, Spring 2009
 */


public class AllMyDrawings
{
    /** Draw a picture with a few houses 
     */
	 public static void drawPicture1(Graphics2D g2) {
	 
	 pciComponent h1 = new pciComponent(100, 250, 50, 75);
	 g2.setColor(Color.BLUE); g2.draw(h1);
	 
       	 Shape h2 = ShapeTransforms.scaledCopyOfLL(h1, 0.5, 0.5);
	 h2 = ShapeTransforms.translatedCopyOf(h2, 150, 0);
	 g2.setColor(Color.BLACK); g2.draw(h2);
	 
	 h2 = ShapeTransforms.scaledCopyOfLL(h2, 4, 4);
	 h2 = ShapeTransforms.translatedCopyOf(h2, 150, 0);
	 
	 Stroke thick = new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	 
	 Stroke orig = g2.getStroke();
	 g2.setStroke(thick);
	 g2.setColor(new Color(0x002FA7));
	 g2.draw(h2);
	 
	 graphicsCard gc1 = new graphicsCard(50, 350, 40, 75);
	 graphicsCard gc2 = new graphicsCard(200, 350, 200, 100);
	 
	 g2.draw(gc1);
	 g2.setColor(new Color(0x8F00FF)); g2.draw(gc2);
	 
	 g2.setStroke(orig);
	 g2.setColor(Color.BLACK);
	 g2.drawString("Crappy PCIE Components and GPUs by Nicholas Abrahan", 20, 20);
	 
	}


    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {

	// Draw some coffee cups.
	
	graphicsCard large = new graphicsCard(100,50,225,150);
	graphicsCard smallCC = new graphicsCard(20,50,40,30);
	graphicsCard tallSkinny = new graphicsCard(20,150,20,40);
	graphicsCard shortFat = new graphicsCard(20,250,40,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	pciComponent h1 = new pciComponent(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(h1);
	
	// Make a black house that's half the size, 
	// and moved over 150 pixels in x direction
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// Here's a house that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	
	// Draw two houses with Windows
	
	graphicsCard hw1 = new graphicsCard(50,350,40,75);
	graphicsCard hw2 = new graphicsCard(200,350,200,100);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); 

	// Rotate the second house 45 degrees around its center.
	Shape hw3 = ShapeTransforms.rotatedCopyOf(hw2, Math.PI/4.0);

	g2.draw(hw3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("a little bit of everything, Nicholas Abrahan", 20,20);
    }
  
    /** Draw a different picture with a few houses and coffee cups
     */

    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("Graphics cards, by Nicholas A", 20,20);

	
	// Draw some coffee cups.
	
       graphicsCard large = new graphicsCard(100,50,225,150);
       graphicsCard smallCC = new graphicsCard(20,50,40,30);
       
       g2.setColor(Color.RED);     g2.draw(large);
       g2.setColor(Color.GREEN);   g2.draw(smallCC);
       
       
    }
    

}
