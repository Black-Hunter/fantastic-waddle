package Main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


class MainPannel extends JPanel{
	
	
	public MainPannel(){
		
		
	}
	
	
}


 class M {


   private	String Text = "Hallo World";

public String getText() {
	return Text;
}

public void setText(String text) {
	Text = text;
}
 
   
   
   
}

 class V extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton button;
	private JLabel jLabel;

	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
	}

	public JLabel getjLabel() {
		return jLabel;
	}

	public void setjLabel(JLabel jLabel) {
		this.jLabel = jLabel;
	}

	V() {

		setSize(400, 400);
		getContentPane().setBackground(Color.RED);
		 button = new JButton("Action");
		button.setBounds(20, 20, 100, 100);
		add(button);
		 jLabel = new JLabel();
		jLabel.setBounds(20, 100, 100, 100);
		add(jLabel);

	}



}

class C implements ActionListener {
	JButton button;
	V v;
	M m;

     
	
	public  C( M m , V v ){
		System.out.println("I am in C ");

		this.v = v;
		this.m = m;
		v.setVisible(true);
		button = v.getButton();
		button.addActionListener(this);

			
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(button)) {
			System.out.println("Button 2 pressed");

			v.getjLabel().setText(m.getText());
			
		}
	
	}

}
class mainWindow extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton button;
	
	
	public mainWindow() {
		// TODO Auto-generated constructor stub
		System.out.println("I am in Main ");


		setSize(400, 400);
		getContentPane().setBackground(Color.RED);
		button = new JButton("Next");
		button.setBounds(20, 20, 100, 100);
		button.addActionListener(this);
		add(button);
		JLabel jLabel = new JLabel();
		jLabel.setBounds(20, 100, 100, 100);
		add(jLabel);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		
		
		if (e.getSource().equals(button)) {
			System.out.println("Button pressed");
			V v = new V();
			M m = new M();
			C c = new C(m, v);
            this.setVisible(false);
			
		}
		
	}
}

public class Main {

	public static void main(String[] args) {

		 new mainWindow().setVisible(true);
		 
		
	}

	

}
