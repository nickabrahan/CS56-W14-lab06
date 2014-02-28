package edu.ucsb.cs56.w14.drawings.nabrahan.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes


import java.awt.geom.*;
import java.awt.Rectangle;

import edu.ucsb.cs56.w14.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.w14.drawings.utilities.GeneralPathWrapper;


public class pcieComponent extends GeneralPathWrapper implements Shape
{


	public pcieComponent(double x, double y, double width, double height)
	{
	
		final double ORIG_ULX = 100.0;
		final double ORIG_ULY = 100.0;
		final double ORIG_HEIGHT = 600.0;
		final double ORIG_WIDTH = 700.0;
		
		GeneralPath inputSlot = new GeneralPath();
		
		inputSlot.moveTo(200, 400);
		inputSlot.lineTo(260, 400);
		inputSlot.lineTo(260, 800);
		
		GeneralPath pciePins = new GeneralPath();
		
		inputSlot.moveTo(260, 650);
		inputSlot.lineTo(300, 650);
		inputSlot.lineTo(300, 610);
		inputSlot.lineTo(350, 610);
		inputSlot.lineTo(350, 650);
		inputSlot.lineTo(370, 650);
		inputSlot.lineTo(370, 610);
		inputSlot.lineTo(380, 610);
		inputSlot.lineTo(380, 670);
		inputSlot.lineTo(410, 670);
		inputSlot.lineTo(410, 620);
		inputSlot.lineTo(420, 620);
		inputSlot.lineTo(420, 670);
		inputSlot.lineTo(600, 670);
		inputSlot.lineTo(600, 620);
		inputSlot.lineTo(620, 620);
		inputSlot.lineTo(620, 635);
		inputSlot.lineTo(650, 635);
		inputSlot.lineTo(650, 620);
		inputSlot.lineTo(635, 620);
		inputSlot.lineTo(635, 610);
		inputSlot.lineTo(670, 610);
		
		GeneralPath cardoutline = new GeneralPath();
		
		cardoutline.moveTo(670, 610);
		cardoutline.moveTo(670, 500);
		cardoutline.moveTo(260, 500);
	
	
		GeneralPath generalCard = new GeneralPath();
		generalCard.append(inputSlot, false);
		generalCard.append(pciePins, false);
		generalCard.appen(cardoutline.false);
		
		
		Shape s = ShapeTransforms.translatedCopyOf(generalCard, -ORIG_ULX + x, -ORIG_ULY + y);
		
		s = ShapeTransforms.scaledCopyOf(s, width/ORIG_WIDTH, height/ORIG_HEIGHT) ;
		
		
		
		this.set(new GeneralPath(s));
	}
}