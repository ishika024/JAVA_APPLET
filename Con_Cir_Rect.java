/*
	IMPLEMENT RECTANGLE AND CIRCLE USING APPLET
*/
import java.awt.*;
import java.applet.*;
public class Con_Cir_Rect extends Applet
{
	public void paint(Graphics g)  
	{
		
		for(int i=1; i<=50; i++)
		{
			Color c = new Color(50,150,250);
			g.setColor(c);
			int x=i*10;
			g.drawRect(100+x/2, 100+x/2, 250-x, 250-x);
		}
		Color c = new Color(30,100,100);
		g.setColor(c);
		for(int i=0;i<=50;i++)
		{
			int x = i*10;
			g.drawOval(100+x/2, 100+x/2, 250-x, 250-x);
		}
	}
}

/*
	IN COMMAND PROMPT
	FOR COMPILE       JAVAAC Con_Cir_Rect.java
	FOR RUN           appletviewer Tages.html
*/