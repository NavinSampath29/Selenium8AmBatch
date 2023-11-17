package recap.java;


import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class RoboScreenMethod {
	
	public void robocapture(BufferedImage br ,File dest , String filename) throws AWTException, IOException
	{
		Robot r = new Robot();
		
		// Dimension - ScreenSize 
		
		Dimension ss = Toolkit.getDefaultToolkit().getScreenSize();
		
		//Rectanagle class
		
		Rectangle rr = new Rectangle(ss);
		
		// BUFFERED IMAGE 
		
		br = r.createScreenCapture(rr);
		
		// File class is used to save the destination 
		
		dest = new File("C:\\Users\\gomat\\eclipse-workspace\\recaping\\target\\"+filename+".png");
		
		// ImageIO class write static method
		
		ImageIO.write(br, "png", dest);
	}

}