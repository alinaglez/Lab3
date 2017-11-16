import java.awt.Color;

import java.awt.Graphics;

import java.awt.Insets;

import java.awt.Polygon;



import javax.swing.JPanel;

 

public class MyPanelClass extends JPanel {

            /**

* 

*/

private static final long serialVersionUID = 1L;


public void paintComponent(Graphics g) {

                        super.paintComponent(g);

 

                        //Compute interior coordinates

                        Insets myInsets = this.getInsets();

                        int x1 = myInsets.left;

                        int y1 = myInsets.top;

                        int x2 = getWidth() - myInsets.right - 1;

                        int y2 = getHeight() - myInsets.bottom - 1;

                        int width = x2 - x1;

                        int height = y2 - y1;

 

                        //Painted the background

                        g.setColor(Color.RED);

                        g.fillRect(x1, y1, width+1, height+1);

                        

//                        //Draw a border

//                        g.setColor(Color.YELLOW);

//                        g.drawRect(x1, y1, width, height);

//                        g.setColor(Color.WHITE);

//                        g.drawRect(x1+3, y1+3, width-6, height-6);

//                        

//                        g.setColor(Color.WHITE);

//                        g.drawLine(x1, y1, x2, y2);

//                        g.setColor(Color.BLACK);

//                        g.drawLine(x2, y1, x1, y2);

//                          

//                        Polygon p = new Polygon();

//                        p.addPoint(x1 + 5, y1 + 25);

//                        p.addPoint(x1 + 20, y1 + 10);

//                        p.addPoint(x1 + 35, y1 + 25);

//                        p.addPoint(x1 + 25, y1 + 25);

//                        p.addPoint(x1 + 25, y1 + 45);

//                        p.addPoint(x1 + 15, y1 + 45);

//                        p.addPoint(x1 + 15, y1 + 25);

//                        g.setColor(Color.YELLOW);

//                        g.fillPolygon(p);

//                        

                        g.setColor(Color.WHITE);

                        g.fillRect(x1+30, y1+110, 380, 40);

                        

                        g.setColor(Color.WHITE);

                        g.fillRect(x1+30, y1+26, 380, 40);

                       

                        

                        Polygon p3 = new Polygon();

                        p3.addPoint(x1, y1 + 184);

                        p3.addPoint(x1 + 115, y1 + 90);

                        p3.addPoint(x1 , y1);

                        

                        g.setColor(Color.BLUE);

                        g.fillPolygon(p3);

                        

                        

                        Polygon p2 = new Polygon();

                        p2.addPoint(x1 + 25, y1 + 75);

                        p2.addPoint(x1 + 41, y1 + 75);

                        p2.addPoint(x1 + 47, y1 + 60);

                        p2.addPoint(x1 + 53, y1 + 75);

                        p2.addPoint(x1 + 69, y1 + 75);

                        p2.addPoint(x1 + 56, y1 + 85);

                        p2.addPoint(x1 + 61, y1 + 100);

                        p2.addPoint(x1 + 47, y1 + 90);

                        p2.addPoint(x1 + 34, y1 + 100);

                        p2.addPoint(x1 + 38, y1 + 83);

                        g.setColor(Color.WHITE);

                        g.fillPolygon(p2);

                        

                       

            }


}