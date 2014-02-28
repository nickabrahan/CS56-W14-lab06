package edu.ucsb.cs56.w14.drawings.nabrahan.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes


import java.awt.geom.*;
import java.awt.Rectangle;

import edu.ucsb.cs56.w14.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.w14.drawings.utilities.GeneralPathWrapper;


public class graphicsCard extends pcieComponent implements Shape
{
	public graphicsCard(double x, double y, double width, double height)
	{
	super(x, y, width, height);
	
	GeneralPath gp = this.get();
	
	Circle gpuFan = new Circle ( 
			x - 50,
			y - 100,
			height/2
	);
	
	}











}