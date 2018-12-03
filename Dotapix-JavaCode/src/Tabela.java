import java.awt.*;
import javax.swing.*;

/** Kjo klase krijon kornizen me dy panela si dhe shton
 * 	shiritin e menyse. */
public class Tabela extends JFrame {
	/** Konstuktori krijon kornizes me dy panela
	 *  Paneli qe vizaton katroret dhe paneli kontrollues i butonave
	 *  */
	public Tabela() {
		Numruesi num=new Numruesi(0);
		JPanel butona=new PanBut(num);
		JPanel kuti=new Pixelat_View();
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.add(kuti,BorderLayout.CENTER);
		c.add(butona, BorderLayout.SOUTH);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("images\\logo.png"));
		setJMenuBar(new Menyja());
		setTitle("Dotapix");
		setSize(610,768);
		setVisible(true);
	}


}