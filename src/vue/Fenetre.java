package vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import controleur.Controleur;
import main.FormulaireException;

public class Fenetre extends JFrame implements ActionListener{
	//Cr�er tous les composants de notre fen�tre
		private Panneau pan = new Panneau();
		private Box b1 = Box.createHorizontalBox();
		private JLabel title = new JLabel("R�server un billet");
	    private Box b2=Box.createHorizontalBox();
	    private JLabel nom = new JLabel("Nom");
	    private JTextField inp1 = new JTextField();
	    private Box b3=Box.createHorizontalBox();
		private JLabel prenom = new JLabel("Pr�nom");
		private JTextField inp2 = new JTextField();
	    private Box b4=Box.createHorizontalBox(); 
		private JLabel mail = new JLabel("Mail");
	    private JTextField inp3 = new JTextField();
	    private Box b5=Box.createHorizontalBox();
		private JComboBox<String> liste = new JComboBox<>();
		private JLabel concerts = new JLabel("Concerts");
	    private Box b6=Box.createHorizontalBox();
		private JRadioButton assise = new JRadioButton("Place assise");
		private JRadioButton debout = new JRadioButton("Place Debout");
		private ButtonGroup choixPlace = new ButtonGroup();
	    private Box b7=Box.createHorizontalBox();
		private JButton bouton = new JButton("Valider");
	    private Box b10 =Box.createVerticalBox();
		
	    public Fenetre(String n, String p, String m, String c, String pl) {
	    	this.setNom(n);
	    	this.setPrenom(p);
	    	this.setMail(m);
	    	this.setConcert(c);
	    	this.setPlace(pl);
	    }
		public Fenetre() {
			//Param�tres de notre fen�tre : 
			//Titre de la fen�tre:
		    this.setTitle("Billeterie");
		    //Taille de la fen�tre:
		    this.setSize(800, 550);
		    //Pour que l'objet se positionne au centre
		    this.setLocationRelativeTo(null);
		    //Pour que le programme arr�te de tourner quand on clique sur la croix rouge
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		    
		    //Box 1 (titre)
		    title.setFont(new java.awt.Font("Helvetica", java.awt.Font.BOLD, 25));
		    title.setForeground(Color.BLUE);
		    b1.add(title);
		    
		    //Box 2 (nom)
		    b2.add(nom);
		    b2.add(Box.createRigidArea(new Dimension(35,0)));
		    b2.add(inp1);
		    
		    //Box 3 (prenom)    
		    b3.add(prenom);
		    b3.add(Box.createRigidArea(new Dimension(16,0)));
		    b3.add(inp2);
		    
		    //Box 4 (mail)
		    b4.add(mail);
		    b4.add(Box.createRigidArea(new Dimension(38,0)));
		    b4.add(inp3);
		    
		    //Box 5 choix concert
		    b5.add(concerts);
		    b5.add(Box.createRigidArea(new Dimension(50,0)));
		    liste.addItem("Bigflo et Oli 12/04/2018");
		    liste.addItem("Orelsan 30/05/2018");
		    liste.addItem("Christophe Ma� 01/07/2018");
		    b5.add(liste);
		    
		    //Box6 (choix place)
		    //Pour que le bouton radio "assise" soit s�lectionn� par d�faut
		    assise.setSelected(true);
		    //Pour que l'arri�re-plan des boutons radio soit transparent
		    assise.setOpaque(false);
		    debout.setOpaque(false);
		    assise.setActionCommand("Assise");
		    debout.setActionCommand("Debout");
		    choixPlace.add(assise);
		    choixPlace.add(debout);
		    b6.add(assise);
		    b6.add(Box.createRigidArea(new Dimension(30,0)));
		    b6.add(debout);
		    
		    //Box 7 bouton Valider
		    b7.add(bouton);
		     
		    //Box 10 vertical box 
		    b10.add(Box.createRigidArea(new Dimension(0,10)));
		    b10.add(b1);
		    b10.add(Box.createRigidArea(new Dimension(0,30)));
		    b10.add(b2);
		    b10.add(Box.createRigidArea(new Dimension(0,10)));
		    b10.add(b3);
		    b10.add(Box.createRigidArea(new Dimension(0,10)));
		    b10.add(b4);
		    b10.add(Box.createRigidArea(new Dimension(0,10)));
		    b10.add(b5);
		    b10.add(Box.createRigidArea(new Dimension(0,10)));
		    b10.add(b6);
		    b10.add(Box.createRigidArea(new Dimension(0,10)));
		    b10.add(b7);
		    
		    //Mon panneau est le content Pane de ma fen�tre
		    this.setContentPane(pan);
		    //On ajoute la box verticale au panneau
		    this.getContentPane().add(b10);
		    //On rend visible la fen�tre
		    this.setVisible(true);
		    
		    //On informe le bouton que cette fen�tre l'�coute
		    bouton.addActionListener(this);
		    
		  }
	//Les getter
		public String getNom() {
			return inp1.getText();
		}
		public String getPrenom() {
			return inp2.getText();
		}
		public String getMail() {
			return inp3.getText();
		}
		public String getConcert() {
			return liste.getSelectedItem().toString();
		}
		public String getPlace() {
			return choixPlace.getSelection().getActionCommand();
		}
		
		//Les setter 
		public void setNom(String nom) {
			this.inp1.setText(nom);
		}
		public void setPrenom(String prenom) {
			this.inp2.setText(prenom);
		}
		public void setMail(String mail) {
			this.inp3.setText(mail);
		}
		public void setConcert(String concert) {
			this.liste.setSelectedItem("Bigflo et Oli 12/04/2018");
		}
		/*public void setPlace(String place) {
			this.choixPlace.setSelected(assise, true);
		}*/
		
		//M�thode qui est automatiquement appel�e quand on clique sur le bouton
		public void actionPerformed(ActionEvent arg0) throws FormulaireException{
			try {
				Controleur controleur=new Controleur();
				controleur.reserverPlace(this);
				inp1.setText(null);
				inp2.setText(null);
				inp3.setText(null);
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}

}
