import java.awt.*;
import java.applet.*;
public class IndianFlag_Applet extends Applet  // DECLARE GRAPHICS CLASS
{
	public void paint(Graphics g)  
	{
		g.setColor(new Color(255,153,51));
		/* 
		   SET THE GRAPHICS CURRENT COLOR TO THE SPECIFIED COLOR.
		   public abstract void setColor(Color c)     
		*/
		g.fillRect(100,100,600,133);
		/*
		  DRAE A FILLED RECTANGE OF DEFAULT COLOR WITH SPECIFIED 'WIDTH' AND 'HEIGHT' AT POSITION [X' FROM LEFT AND 'Y' FROM TOP. 
		  public abstract void fillRect(int x, int y, int width, int height)
		*/	
		g.setColor(Color.white);
		g.fillRect(100,233,600,133);
		g.setColor(new Color(19,136,8));
		g.fillRect(100,366,600,133);
		g.setColor(new Color(0,0,128));
		for(int i=1; i<=24; i++)
		{
			int x = (int)(66*Math.cos(360/24*i));
			int y = (int)(6*Math.sin(360/24*i));
			g.drawLine(400,300,400+x,300+y);
			/*
		      DRAW LINE BETWEEN THE POINTS (X1,Y1) AND (X2,Y2).
			  public abstract void drawLine(int x1, int y1, int x2, int y2)
			*/
		}
		g.drawOval(332,234,132,132);
		/*
		  FILL OVAL WITH SPECIFIED 'WIDTH' AND 'HEIGHT' AT POSITION 'X' FROM LEFT AND 'Y' FROM TOP. 
		  public abstract void fillArc(int x, int y, int height, int startAngle, int arcAngle)
		*/
	}
}

/*
   IN COMMAND PROMPT
   FOR COMPILE JAVA PROGRAM:        JAVAAC IndianFlag_Applet.java
   FOR RUN JAVA PROGRAM:            appletviewer IndianFlag_Applet_Tags.html
   
*/