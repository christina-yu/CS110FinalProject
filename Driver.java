import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Driver
{
	public static void main(String[] args)
	{
		JFrame frame = new WarGameFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.pack();
      	// OR
      	frame.setSize(600, 450);
      	frame.validate();
      	frame.setVisible(true);
	}
}