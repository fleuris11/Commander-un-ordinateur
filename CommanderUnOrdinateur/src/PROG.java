import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class PROG {
	public static void main(String[]args )
	{
		try {
	 String motif = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";

	 String metal = "javax.swing.plaf.metal.MetalLookAndFeel";

	 String windows = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";

     String XPlook="com.stefankrause.xplookandfeel.skin;";

     UIManager.setLookAndFeel(motif);
     //mettez ici le look & Feel que vous voulez

       }

    catch (Exception err){}

	progEteindre start = new progEteindre();
	 }
		//on lance le prog

	}

class progEteindre extends  JFrame {

 String cmd1="shutdown -s";
 String cmd2="shutdown -r";
 String cmd3="shutdown -l";
 JTextArea scannAREA= new JTextArea("",50,50);
 JTextField se = new JTextField();
 JButton eteindre = new JButton("Eteindre");
 JButton redemarer = new JButton("redemarrer");
 JButton logOff= new  JButton("se deconnecter");
JLabel l1=new JLabel(new ImageIcon(("lb.png")));
public progEteindre()
	{
			JFrame MaFenetre = new JFrame("Fleuris APP");
        	MaFenetre.setVisible(true);
        	MaFenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	MaFenetre.setSize(400,400);
        	scannAREA.setEditable(false);
        	MaFenetre.setIconImage(Toolkit.getDefaultToolkit().getImage("France.png"));
        	Container m = getContentPane();


        	FlowLayout g = new FlowLayout(FlowLayout.RIGHT);
        	m.setLayout(g);
        	//les labels




			GridLayout experimentLayout = new GridLayout(10,9);
			m.setLayout(experimentLayout);







//les boutons

        	m.add(l1);
        	m.add(eteindre);
        	m.add(redemarer);
        	m.add(logOff);
        	//m.add(se);







        	//on lance lecouteur d'action
        	eteindre.addActionListener( new TraitementBut1());
        	redemarer.addActionListener( new TraitementBut1());
        	logOff.addActionListener( new TraitementBut1());

        	//MaFenetre.pack();
        	MaFenetre.setContentPane(m);


		//on ouvre le flux de la lecture

}
private void eteindre(){


		//on ouvre le flux de la lecture
		try{







						System.out.println("execution");
						 Process p = Runtime.getRuntime().exec(cmd1);
						 InputStream in = p.getInputStream();



         StringBuilder build = new StringBuilder();
		//on demarre la lecture
		char c = (char) in.read();
		while (c != (char) -1)
		{
		build.append(c);
		c = (char) in.read();
		}



        //attente jusqua la fin du processus: on sait jamais
        // p.wait();





	}catch (IOException t){
			System.out.println(t);
		}
		}
		private void redemarer(){
			try{





						System.out.println("execution");
						 Process p = Runtime.getRuntime().exec(cmd2);
						 InputStream in = p.getInputStream();



         StringBuilder build = new StringBuilder();
		//on demarre la lecture
		char c = (char) in.read();
		while (c != (char) -1)
		{
		build.append(c);
		c = (char) in.read();
		}



        //attente jusqua la fin du processus: on sait jamais
        // p.wait();





	}catch (IOException t){
			System.out.println(t);
		}
		}
		private void logOff(){
			try{







						System.out.println("execution");
						 Process p = Runtime.getRuntime().exec(cmd3);
						 InputStream in = p.getInputStream();



         StringBuilder build = new StringBuilder();
		//on demarre la lecture
		char c = (char) in.read();
		while (c != (char) -1)
		{
		build.append(c);
		c = (char) in.read();
		}



        //attente jusqua la fin du processus: on sait jamais
        // p.wait();





	}catch (IOException t){
			System.out.println(t);
		}
		}





class   TraitementBut1 implements   ActionListener
			{

 public  void    actionPerformed(ActionEvent e)
 {

if (e.getSource()==eteindre){
	System.out.print("debut de l'action");

eteindre();



  }else if (e.getSource()==redemarer){
  	redemarer();
  }
  else if (e.getSource()==logOff){
  	logOff();
  }
}
}


}
