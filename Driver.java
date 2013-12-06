import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
   Driver class runs the WarGameFrame
*/
public class Driver
{
	public static void main(String[] args)
	{
		JFrame frame = new WarGameFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      	frame.setSize(600, 450);
      	frame.validate();
      	frame.setVisible(true);
	}
}