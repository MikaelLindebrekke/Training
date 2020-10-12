package paintingTest;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Images extends JPanel {

    private Image star;

    public Images() {

        initBoard();
    }
    
    private void initBoard() {
        
        loadImage();
        
        int w = star.getWidth(this);
        int h =  star.getHeight(this);
        setPreferredSize(new Dimension(w, h));        
    }
    
    private void loadImage() {
        
        ImageIcon ii = new ImageIcon("C:\\Users\\Mikael Lindebrekke\\My projects\\TestArea\\Resources\\GS.png");
        star = ii.getImage();        
    }

    @Override
    public void paintComponent(Graphics g) {

        g.drawImage(star, 0, 0, null);
    }
}