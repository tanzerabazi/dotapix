import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
// Krijon shiritin e menyse.
public class Menyja extends JMenuBar{

	public Menyja(){

		JMenu fileMenu = new JMenu("Dosja");
        JMenu editMenu = new JMenu("Info");
        this.add(fileMenu);
        this.add(editMenu);


        JMenuItem newAction = new JMenuItem("Rigjenero");
        JMenuItem exitAction = new JMenuItem("Dil");
        JMenuItem instAction = new JMenuItem("Instrukcione");
        JMenuItem aboutAction = new JMenuItem("Reth Lojes");


        fileMenu.add(newAction);
        // Ndan elementet e menys me vije horizontale
        fileMenu.addSeparator();
        fileMenu.add(exitAction);
        editMenu.add(instAction);
        editMenu.add(aboutAction);

        newAction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	Pixelat_View.mbush_ngjyr();
            	new Pixelat_View().shiko_fillimin();
            	PanBut.setNumruesi();
            	repaint();
            }
        });
        exitAction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	int reply = JOptionPane.showConfirmDialog(null, "Nese deshironi te dilni nga loja shtyp YES\nPerndryshe shtyp NO", "Dil nga Loja?", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION)
                {
                  System.exit(0);
                }

            }
        });
        instAction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	String text="DOTAPIX eshte nje loje e bazuar ne strategji,\nqe kerkon aftesi dhe fat per\n" +
            			"ta perfunduar. Objekti i lojes eshte te ndryshohen\nngjyrat e katroreve perderisa\n" +
            			"siperfaqja merr nje ngjyre te vetme.\nDuke filluar prej kendit te majt-lart mund ti\n"+
            			"ndryshon ngjyrat ne ate menyre qe ti marresh\nedhe katroret me ngjyra rreth pixelave\n"+
            			"perkates.\n"+
            			"Qellimi i lojes eshte qe siperfaqja te behet\nnje ngjyreshe me sa me pake numer te hapave. ";
            	JOptionPane.showMessageDialog(null, text, "INSTRUKCION", 1, new ImageIcon("images\\logo.png"));
            }
        });
        aboutAction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	ImageIcon a=new ImageIcon("images\\logo.png");
            	String text="DOTAPIX Copyright 2011-2012 Version 1.1.\nZhvilluar nga: Tanzer A.\n tanki_7@hotmail.com";
            	JOptionPane.showMessageDialog(null, text, "RRETH", 1, a);
            }
        });
	}

}
