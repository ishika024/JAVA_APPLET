import java.awt.*;
import java.applet.*;
public class MyApplet extends Applet  // DECLARE GRAPHICS CLASS
{
	public void paint(Graphics g)  
	{
		g.setColor(Color.yellow);
		/* 
		   SET THE GRAPHICS CURRENT COLOR TO THE SPECIFIED COLOR.
		   public abstract void setColor(Color c)     
		*/
		g.fillOval(100,100,300,300);
		/*
		  FILL OVAL WITH SPECIFIED 'WIDTH' AND 'HEIGHT' AT POSITION 'X' FROM LEFT AND 'Y' FROM TOP. 
		  public abstract void fillOval(int x, int y, int width, int height)
		*/
		
		g.setColor(Color.black);
		
		g.fillOval(175,175,40,40);
		g.fillOval(280,175,40,40);
		g.setColor(Color.red);
		
		g.fillArc(175,175,150,150,180,180);
		/*
		  FILL A CIRCULAR OR ELLIPTICAL ARC. 
		  public abstract void fillArc(int x, int y, int height, int startAngle, int arcAngle)
		*/
	}
}

/*

   FOR COMPILE JAVA PROGRAM:       JAVAAC MyApplet.java
   FOR RUN JAVA PROGRAM:           appletviewer Tags.html
   
*/