import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WarGameFrame extends JFrame
{
	WarGame game;
	private JButton hitButton;
	private JPanel frame1, frame2, frame3, frame4, frame5, frame6, frame7, frame8;
	private JLabel picFront1, picFront2, p1, p2, p1cards, p2cards, text;
	private ImageIcon front1, front2, back;

	public WarGameFrame()
	{
		game = new WarGame();

		setLayout(new GridLayout(3, 3));

		setTitle("War of Cards");

		frame1 = new JPanel(new BorderLayout());
		p1 = new JLabel("Player 1");
		p1cards = new JLabel("Cards in deck: " + game.getHand1().size());
		frame1.add(p1, BorderLayout.NORTH);
		frame1.add(p1cards, BorderLayout.CENTER);

		back = new ImageIcon("back.gif");
		JLabel picBack = new JLabel(back);
		frame2 = new JPanel(new FlowLayout());
		frame2.add(picBack);

		frame3 = new JPanel();
		picFront1 = new JLabel();
		frame3.add(picFront1);

		frame4 = new JPanel(new BorderLayout());
		p2 = new JLabel("Player 2");
		p2cards = new JLabel("Cards in deck: " + game.getHand2().size());
		frame4.add(p2, BorderLayout.NORTH);
		frame4.add(p2cards, BorderLayout.CENTER);

		frame5 = new JPanel();
		JLabel picBack2 = new JLabel(back);
		frame5.add(picBack2);

		frame6 = new JPanel();
		picFront2 = new JLabel();
		frame6.add(picFront2);

		frame7 = new JPanel();
		hitButton = new JButton("Next Move");
		hitButton.addActionListener(new ButtonListener());
		frame7.add(hitButton);

		frame8 = new JPanel();
		text = new JLabel();
		frame8.add(text);

		add(frame1);
		add(frame2);
		add(frame3);
		add(frame4);
		add(frame5);
		add(frame6);
		add(frame7);
		add(frame8);
	}

	class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
//			while(!game.gameOver())
//			{
			if(!game.gameOver())
			{
				front1 = game.getHand1().peek().getImage();
				front2 = game.getHand2().peek().getImage();
				picFront1.setIcon(front1);
				picFront2.setIcon(front2);

				int num = 0;

				if(game.getHand1().peek().getRank() > game.getHand2().peek().getRank())
					num = 1;
				else
					num = 2;

				game.turn();

				if(num != 0)
					text.setText("Player " + num + " wins this round.");
				else
					text.setText("War!");

				p1cards.setText("Cards in deck: " + game.getHand1().size());
				p2cards.setText("Cards in deck: " + game.getHand2().size());

				//setLabelFor(p1cards("Cards in deck: " + game.getHand1().size()));
//			}
//
//			text.setText("Game over.");
			}
			else
				text.setText("Game over.");
		}
	}
}