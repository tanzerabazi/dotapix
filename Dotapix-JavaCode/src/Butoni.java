import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Butoni extends JButton implements ActionListener {

	private Dimension dim = new Dimension(50, 50);
	private Numruesi rrit;
	private PanBut but;
	private Color ngjyra_butonit;

	public Butoni(){}

	public Butoni(Color ngj, Numruesi rrite, PanBut but) {
		super();
		this.but = but;
		rrit = rrite;
		this.ngjyra_butonit=ngj;
		this.setBackground(ngj);
		this.setPreferredSize(dim);
		addActionListener(this);

	}
	public void setNumruesi(){
		rrit.setCount(0);
	}

	public void actionPerformed(ActionEvent e) {
		//rrite numrin e hapave
		rrit.increment();
		// rifreskon nr. e hapave ne panel
		but.update();

		if (rrit.checkOf()) {
			JOptionPane.showMessageDialog(null,"Loja Mbaroj!\nJu keni tejkaluar 24 Hapa.");

		}

		for(int i=0;i<12;i++)
			for(int j=0;j<13;j++)
				Pixelat_View.check(i, j, ngjyra_butonit);

		if(Pixelat_View.mbaroi()&&rrit.countOf()<24)
			{JOptionPane.showMessageDialog(null,"Perfunduat Lojen me sukses!\nNumri Hapave:"+rrit.countOf());
			}
	}

}
