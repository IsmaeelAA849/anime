package anime;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameButtons implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void create(JPanel a) {
		JButton button = new JButton("Click me");
		button.addActionListener(this);
		a.add(button);
	}
}
