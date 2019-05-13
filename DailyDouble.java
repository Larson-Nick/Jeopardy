import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.io.*;
public class DailyDouble
{
    public static void mainGUI()
    {
        JFrame j = new JFrame("Daily Double!");
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(620, 343);
        j.setLayout(null);
        j.setVisible(true);
        try
        {
            ImageIcon img = new ImageIcon(ImageIO.read(new File("DailyDouble.jpg")));
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
    }
}
