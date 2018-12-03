import javax.swing.*;
import java.awt.*;

// Paneli i butonave
public class PanBut extends JPanel {
	private static Numruesi llogaritesi;
	private JLabel klik = new JLabel("Nr. Hapave= 0");

	public PanBut(){}

	public PanBut(Numruesi llogarites) {
		llogaritesi = llogarites;
		this.add(klik);
		this.add(new Butoni(Color.red, llogaritesi,this));
		this.add(new Butoni(Color.blue,llogaritesi,this));
		this.add(new Butoni(Color.green,llogaritesi,this));
		this.add(new Butoni(Color.magenta,llogaritesi,this));
		this.add(new Butoni(Color.cyan, llogaritesi,this));
		this.add(new Butoni(Color.orange,llogaritesi,this));

	}
	public static void setNumruesi(){
		llogaritesi.setCount(0);
	}

	public void update() {
		klik.setText("Nr.Hapave= " + llogaritesi.countOf());
		repaint();
	}

}
