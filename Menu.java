import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.io.*;
public class Menu
{
    public static void mainGUI()
    {
        JFrame j = new JFrame("Jeopardy!");
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(768,432);
        j.setLayout(null);
        j.setVisible(true);
        try
        {
            ImageIcon img = new ImageIcon(ImageIO.read(new File("JeopardyLogo.jpg")));
            j.setContentPane(new JLabel(img));
            ImageIcon icon = new ImageIcon(ImageIO.read(new File("JeopardyIcon.png")));
            j.setIconImage(icon.getImage());
        }
        catch(IOException e)
        {
            System.out.println("Image not found.");
        }
        j.pack();
        j.setResizable(false);
    
        JButton play = new JButton("Play");
        play.setBounds(231, 325, 128, 72);
        j.add(play);
        
        JButton select = new JButton("Select");
        select.setBounds(409, 325, 128, 72);
        j.add(select);
    }
}

