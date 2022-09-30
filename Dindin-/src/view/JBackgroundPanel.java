package view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
 
public class JBackgroundPanel extends JPanel {
    protected BufferedImage backgroundImage = null;
 
    //construtor default
    public JBackgroundPanel() {
        super();
        setLayout(null);
    }
    
    //construtor com argumento URL para adicionar imagem no fundo do JPanel
    public JBackgroundPanel(URL url) throws IOException {
        super();
        setLayout(null);
        setBackgroundImage(url);
    }

    public void setBackgroundImage(URL url) throws IOException {
        this.backgroundImage = ImageIO.read(url);
    }
 
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
 
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), null);
        }
    }
}
