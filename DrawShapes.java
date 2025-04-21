import java.applet.Applet;
import java.awt.*;

/*<applet code="DrawShapes" width="400" height="400"></applet>
*/
public class DrawShapes extends Applet
{
    public void paint(Graphics g)
    {
        g.setColor(Color.GREEN);
        g.drawLine(50,200,300,200);
        g.setColor(Color.RED);
        g.drawRect(50,50,150,100); 
  