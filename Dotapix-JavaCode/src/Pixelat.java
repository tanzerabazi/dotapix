import java.awt.*;
// Pixelat- ka atributet Ngjyre dhe Blokuar.
public class Pixelat {
	private Color pix;
	private boolean block = false;

	public Pixelat() {
		this.pix = new Color(255, 0, 0);

	}

	public void setColor(Color a) {
		this.pix = a;
	}

	public Color getColor() {
		return this.pix;
	}

	public boolean getblok() {

		return block;
	}

	public void setblok() {
		block = true;
	}

}
