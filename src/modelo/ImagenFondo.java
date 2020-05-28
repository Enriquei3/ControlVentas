/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.border.Border;



/**
 *
 * @author Enrique Isales
 */
public class ImagenFondo implements Border {
    
  public BufferedImage back;
 
    public ImagenFondo(){
        try {
            URL imagePath = new URL(getClass().getResource("../img/fondo3.png").toString());
            back = ImageIO.read(imagePath);
        } catch (IOException ex) {            
        }
    }

  @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawImage(back, (x + (width - back.getWidth())),(y + (height - back.getHeight())), null);
    }
 
  @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(0,0,0,0);
    }
 
  @Override
    public boolean isBorderOpaque() {
        return false;
    }  
    
    
    
    
    
    
    
}
