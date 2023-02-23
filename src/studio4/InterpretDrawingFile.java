package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String type = in.nextLine();
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		boolean filled = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double halfWidth = in.nextDouble();
		double halfHeight = in.nextDouble();
		if(type.equals("rectangle"))
		{
			Color black = new Color(r, g, b);
			StdDraw.setPenColor(black);
			StdDraw.setPenRadius(0.25);
			StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
		}
	}
}
