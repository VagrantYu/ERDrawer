/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erdrawer;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
/**
 *
 * @author Wayne
 */
public class Diamond {
    Page parent;
    Diamond(Page p,Point p1,Point p2,Color c)
    {
        parent = p;
        Color color;
        Graphics g=this.parent.getGraphics();
        color=new Color(this.parent.getBackground().getRed()^c.getRed(),this.parent.getBackground().getGreen()^c.getGreen(),this.parent.getBackground().getBlue()^c.getBlue());
        g.setXORMode(color);
        g.drawLine( p1.x,(p2.y+p1.y)/2,(p2.x+p1.x)/2,p1.y);
        g.drawLine( (p2.x+p1.x)/2, p1.y, p2.x, (p2.y+p1.y)/2);
        g.drawLine( p2.x, (p2.y+p1.y)/2, (p2.x+p1.x)/2, p2.y);
        g.drawLine( (p2.x+p1.x)/2, p2.y, p1.x,(p2.y+p1.y)/2);
        
    }
}
