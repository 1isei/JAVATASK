/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.siswaa;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
/**
 *
 * @author WAHYU
 */
public class Siswaa extends JApplet {

  final static BasicStroke wideStroke = new BasicStroke(8.0f);  
  public void init() {
    setBackground(Color.white);
    setForeground(Color.white);
  }
  public void paint(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);

    g2.setPaint(Color.gray);
    int x = 5;
    int y = 7;

    g2.setStroke(wideStroke);
    g2.draw(new Siswaa.Double(x, y, 200, 200, 90, 135,
        Siswaa.OPEN));
    g2.drawString("Arc2D", x, 250);
  }

  public static void main(String s[]) {
    JFrame f = new JFrame("");
    f.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
    JApplet applet = new Siswaa();
    f.getContentPane().add("Center", applet);
    applet.init();
    f.pack();
    f.setSize(new Dimension(300, 300));
    f.show();
  }
}
           
