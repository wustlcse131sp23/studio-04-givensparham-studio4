package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.02);
		StdDraw.rectangle(0.4, 0.4, 0.3, 0.2);
		
		Color dark = new Color(48, 25, 2);
		Color green = new Color(185, 240, 77);
		Color pit = new Color(133, 80, 30);
		StdDraw.setPenColor(dark);
		StdDraw.filledRectangle(0.4, 0.4, 0.3, 0.2);
		StdDraw.setPenColor(green);
		StdDraw.filledRectangle(0.4, 0.4, 0.25, 0.15);
		StdDraw.setPenColor(pit);
		StdDraw.filledEllipse(0.4, 0.4, 0.1, 0.1);
		
	    //Color star = new Color(224, 204, 20);
	   // StdDraw.setPenColor(star);
	     
	    
	    
	}
}