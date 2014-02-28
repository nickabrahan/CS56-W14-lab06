package edu.ucsb.cs56.w14.drawings.nabrahan.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes


import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;

import java.awt.Rectangle;

import edu.ucsb.cs56.w14.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.w14.drawings.utilities.GeneralPathWrapper;


public class pciComponent extends GeneralPathWrapper implements Shape
{


	public pciComponent(double x, double y, double width, double height)
	{
	
		final double ORIG_ULX = 100.0;
		final double ORIG_ULY = 100.0;
		final double ORIG_HEIGHT = 600.0;
		final double ORIG_WIDTH = 700.0;
		
		GeneralPath inputSlot = new GeneralPath();
		
		inputSlot.moveTo(200, 400);
		inputSlot.lineTo(260, 400);
		inputSlot.lineTo(260, 700);
		
		GeneralPath pciePins = new GeneralPath();
		
		pciePins.moveTo(260, 650);
		pciePins.lineTo(300, 650);
		pciePins.lineTo(300, 610);
		pciePins.lineTo(350, 610);
		pciePins.lineTo(350, 650);
		pciePins.lineTo(370, 650);
		pciePins.lineTo(370, 610);
		pciePins.lineTo(380, 610);
		pciePins.lineTo(380, 670);
		pciePins.lineTo(410, 670);
		pciePins.lineTo(410, 620);
		pciePins.lineTo(420, 620);
		pciePins.lineTo(420, 670);
		pciePins.lineTo(600, 670);
		pciePins.lineTo(600, 620);
		pciePins.lineTo(620, 620);
		pciePins.lineTo(620, 635);
		pciePins.lineTo(650, 635);
		pciePins.lineTo(650, 620);
		pciePins.lineTo(635, 620);
		pciePins.lineTo(635, 610);
		pciePins.lineTo(670, 610);
		
		GeneralPath cardoutline = new GeneralPath();
		
		cardoutline.moveTo(670, 610);
		cardoutline.moveTo(670, 500);
		cardoutline.moveTo(260, 500);
	
	
		GeneralPath generalCard = new GeneralPath();
		generalCard.append(inputSlot, false);
		generalCard.append(pciePins, false);
		generalCard.append(cardoutline, false);
		
		
		Shape s = ShapeTransforms.translatedCopyOf(generalCard, -ORIG_ULX + x, -ORIG_ULY + y);
		
		s = ShapeTransforms.scaledCopyOf(s, width/ORIG_WIDTH, height/ORIG_HEIGHT) ;
		
		
		
		this.set(new GeneralPath(s));
	}
}
