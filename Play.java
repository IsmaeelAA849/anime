package anime;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



import java.util.Scanner;



public class Play extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;
public static JFrame frame = new JFrame("Let me Guess...");
JLabel label;
public static JPanel panel = new JPanel();
public static JPanel panel2 = new JPanel();
static boolean clicked=false;
static String answer;
Database all;







public void play() throws IOException{
	
	frame.setVisible(true);
	frame.setDefaultCloseOperation(3);
	frame.setSize(1200, 600);
	addButtons();
	
	label = new JLabel(
			"<html>WELCOME TO THE ANIME GUESSING GAME<br>by Ismaeel Abdulghani<br></html>", 
			0);
	label.setFont(new Font("", 1, 20));
	frame.add(label);
	label.setVisible(false);
	label.setVisible(true);
	pause(5000L);
	label.setVisible(false);
	boolean inPlay = true;
	playing:
		while (inPlay){
			all = new Database();
			label = new JLabel("Think of an anime character and I will guess it!", 0);
			label.setFont(new Font("", 1, 20));
			frame.add(label);
			frame.setVisible(true);
			pause(2500L);
			label.setVisible(false);
			while(all.database.size()>1) {
				clicked=false;
				boolean goodQuestion = false;
				String keyword="";
				while(!goodQuestion) {
					keyword = PickQuestion();
					all.previousWords.add(keyword);
					if(PropertyList.propertyList.size()==0){
						label = new JLabel("ERROR!", 0);
						label.setFont(new Font("", 1, 20));
						frame.add(label);
						frame.setVisible(true);
						pause(2500L);
						label.setVisible(false);
						continue playing;
					}
					goodQuestion = CheckQuestion(keyword);
				}
				OutputQuestion(keyword);

				if(answer=="restart") {
					panel2.setVisible(false);
					continue playing;
				}
				CheckResponse(answer,keyword);
				if(PropertyList.propertyList.size()==0){
					label = new JLabel("ERROR!", 0);
					label.setFont(new Font("", 1, 20));
					frame.add(label);
					frame.setVisible(true);
					pause(2500L);
					label.setVisible(false);
					continue playing;
				}
			}
			panel2.setVisible(false);
			label = new JLabel("Your character is...", 0);
			label.setFont(new Font("", 1, 20));
			frame.add(label);
			frame.setVisible(true);
			
			
			JLabel a1 = new JLabel(all.database.get(0).name, 0);
			label.setFont(new Font("", 1, 20));
			String path = all.database.get(0).path;
		    URL url = new URL(path);
		    BufferedImage image = ImageIO.read(url);
		    JLabel a2 = new JLabel(new ImageIcon(image));
		    JPanel pane = new JPanel();
		    pane.add(a1);
		    pane.add(a2);
		    label.setVisible(false);
			frame.add(pane);
			frame.setVisible(true);
			pause(2500L);
			

			 int anotherRound = JOptionPane.showConfirmDialog(frame, "Play Again?", "", 0);
		        if (anotherRound != 0) {
		          inPlay = false;
		          
		        } 
		        pane.setVisible(false);
			
			
		    
		   
		


		}
	System.exit(0);
}



public String PickQuestion() {

	int rand = (int)(Math.random()*PropertyList.propertyList.size());
	
	return PropertyList.propertyList.remove(rand);
}

public boolean CheckQuestion(String keyword) {

	boolean pos1 = false;
	boolean pos2 = false;
	for(Individual a:all.database) {
		if(a.properties.get(keyword).equals("yes")) {
			pos1=true;
		}
		if(a.properties.get(keyword).equals("no")){
			pos2=true;
		}
	}
	return pos1&&pos2;
}

public void OutputQuestion(String keyword) {
	System.out.println(keyword);
	
	switch(keyword) {
	case "One Piece":
	case "Naruto":
	case "Bleach":
	case "My Hero Academia":
	case "Jujutsu Kaisen":
	case "Hunter x Hunter":
	case "Code Geass":
	case "Black Clover":
	case "Seven Deadly Sins":
	case "Demon Slayer":
		label = new JLabel("Is your character from "+keyword+"?", 0);
		label.setFont(new Font("", 1, 20));
		frame.add(label);
		label.setVisible(true);
		frame.setVisible(true);

		break;
	case "Black Hair":
	case "Yellow Hair":
	case "Green Hair":
	case "Orange Hair":
	case "No Hair":
	case "Red Hair":
	case "White Hair":
	case "Pink Hair":
	case "Eye Powers":
	case "Violet Eyes":
	case "Brown Eyes":
	case "Blue Eyes":
	case "Green Eyes":
	case "Black Eyes":
	case "Golden Eyes":
	case "Red Eyes":
	case "naturally different colored eyes":
	case "Gray Eyes":
	case "Gray Hair":
	case "Blue Hair":
	case "White Eyes":
	case "Pink Eyes":
		label = new JLabel("Does your character have "+keyword+"?", 0);
		label.setFont(new Font("", 1, 20));
		
		break;
	case "Use Shadows":
		label = new JLabel("Does your character "+keyword+"?", 0);
		label.setFont(new Font("", 1, 20));
		
		break;
	case "Female":
	case "Protagonist":
	case "Villain": 
	case "Sannin":
	case "Sensei":
	case "Curse":
	case "Younger Brother":
	case "Younger Sister":
	case "Pirate":
	case "Devil Fruit User":
	case "Demon or Devil":
	case "Hollow":
		label = new JLabel("Is your character a "+keyword+"?", 0);
		label.setFont(new Font("", 1, 20));
		
		break;
	case "Older Brother":
	case "Older Sister":
		label = new JLabel("Is your character an "+keyword+"?", 0);
		label.setFont(new Font("", 1, 20));
		
	}
	
	
	label.setVisible(true);
	frame.add(label,BorderLayout.CENTER);
	panel2.setVisible(true);
	frame.setVisible(true);
	while(!clicked) {
		pause(20);
	}
	label.setVisible(false);
	 
	
}

public void addButtons() {
	JButton a = new JButton("yes");
	JButton b = new JButton("no");
	JButton c = new JButton("idk");
	JButton d = new JButton("undo answer");
	JButton e = new JButton("restart");
	a.addActionListener(this);
	b.addActionListener(this);
	c.addActionListener(this);
	d.addActionListener(this);
	e.addActionListener(this);
	panel2.add(a);
	panel2.add(b);
	panel2.add(c);
	panel2.add(d);
	panel2.add(e);
	frame.add(panel2,BorderLayout.NORTH);
	panel2.setVisible(false);
	
}

public void getResponse(ActionEvent e) {
	
	answer =((JButton) e.getSource()).getText();
	
	
	
	label.setVisible(false);
	
	
}

public void CheckResponse(String answer, String keyword) {


	switch(answer) {

	case "undo answer":
		for(Individual a:all.justDeleted) {
			all.database.add(a);
		}
		PropertyList.propertyList.add(keyword);
		if(all.previousWords.size()>0){
			for(String a:all.previousWords) {
				PropertyList.propertyList.add(a);
			}
			
		}
		break;

	case "yes":

		all.justDeleted = new ArrayList<Individual>();
		for(int i=0;i<all.database.size();i++) {

			if(all.database.get(i).properties.get(keyword).equals("no")) {

				all.justDeleted.add(all.database.remove(i));
				i--;
			}
		}
		
		break; 
	case "no":
		all.justDeleted = new ArrayList<Individual>();
		for(int i=0;i<all.database.size();i++) {
			if(all.database.get(i).properties.get(keyword).equals("yes")) {

				all.justDeleted.add(all.database.remove(i));
				i--;
			}
		}
		

	}
	all.previousWords=new ArrayList<String>();
	all.previousWords.add(keyword);

}

public static void pause(long time) {
	try {
		Thread.sleep(time);
		
	} catch (InterruptedException e) {
		System.out.println("Error Occured.");
	} 
}



@Override
public void actionPerformed(ActionEvent e) {
	clicked=true;
	getResponse(e);
	
}





}
