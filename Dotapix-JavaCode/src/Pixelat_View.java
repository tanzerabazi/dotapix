import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.*;
/* Kjo eshte MAIN Klasa ku mbushen me ngjyre katroret
 * vizaton mbrenda panelit e katroreve dhe
 */
public class Pixelat_View extends JPanel {
	private static Color[] ngjyrat = { Color.red, Color.green, Color.blue,
			Color.MAGENTA, Color.cyan, Color.orange };
	private static Pixelat[][] kutia = new Pixelat[12][13];

	public Pixelat_View() {
	}

	// Metoda paintComponent vizaton panelin
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int k = 0;
		for (int i = 0; i < 12; i += 1) {
			for (int j = 0; j < 13; j += 1) {
				g.setColor(Color.black);
				g.drawRect(i * 50, j * 50, 50, 50);
				g.setColor(kutia[i][j].getColor());
				g.fillRect(i * 50, j * 50, 50, 50);
				k++;
			}
		}
		repaint();

	}



	public static boolean mbaroi() {
		boolean procesi=true;
		for(int i=0;i<12;i++)
			{for(int j=0;j<13;j++)
				{if(!kutia[i][j].getblok())
					procesi=false;
				}}
		return procesi;

	}


	// Metoda check verifikon se pixelat reth qendres
	// a kan blok.
	public static void check(int i, int j, Color ngj) {
		kutia[0][0].setblok();
		if(kutia[0][1].getColor()==ngj&&!kutia[0][1].getblok())
			kutia[0][1].setblok();
		if(kutia[1][0].getColor()==ngj&&!kutia[1][0].getblok())
			kutia[1][0].setblok();

		if(kutia[i][j].getblok()){

		if (i >= 1 && i <= 11 && j == 0) {
			//if(i > 1)
			if (kutia[i - 1][j].getColor() == ngj) {
				kutia[i - 1][j].setblok();
				//new Pixelat_View().check(i - 1, j, ngj);
			}
			if (kutia[i][j + 1].getColor() == ngj) {
				kutia[i][j + 1].setblok();
				//new Pixelat_View().check(i, j + 1, ngj);
			}
			if(i<11)
			if (kutia[i + 1][j].getColor() == ngj) {
				kutia[i + 1][j].setblok();

				//new Pixelat_View().check(i + 1, j, ngj);
			}
		} else if (j >= 1 && j <= 12 && i == 0) {
			//if(j > 1)
			if (kutia[i][j - 1].getColor() == ngj) {
				kutia[i][j - 1].setblok();
				//new Pixelat_View().check(i, j - 1, ngj);
			}
			if (kutia[i + 1][j].getColor() == ngj) {
				kutia[i + 1][j].setblok();

				//new Pixelat_View().check(i + 1, j, ngj);
			}
			if(j<12)
			if (kutia[i][j + 1].getColor() == ngj) {
				kutia[i][j + 1].setblok();

				//new Pixelat_View().check(i, j + 1, ngj);
			}
		}

		else if (i >= 1 && j >= 1 && j <= 12 && i <= 11) {
			//if(i > 1)
			if (kutia[i - 1][j].getColor() == ngj) {
				kutia[i - 1][j].setblok();
				//new Pixelat_View().check(i - 1, j, ngj);
			}
			//if(j>1)
			if (kutia[i][j - 1].getColor() == ngj) {
				kutia[i][j - 1].setblok();
				//new Pixelat_View().check(i - 1, j, ngj);
			}
			if(i<11)
			if (kutia[i + 1][j].getColor() == ngj) {
				kutia[i + 1][j].setblok();
				//new Pixelat_View().check(i + 1, j, ngj);
			}
			if(j<12)
			if (kutia[i][j + 1].getColor() == ngj) {
				kutia[i][j + 1].setblok();
				//new Pixelat_View().check(i, j + 1, ngj);
			}
		}
		}
		// Te gjitha katrore ne rethin ti blokoj dhe tua jep nje
		// ngjyre te vetme.
		for (int m = 0; m < 12; m++) {
			for (int n = 0; n < 13; n++) {
				if (kutia[m][n].getblok() == true)
					kutia[m][n].setColor(ngj);
					//check(m, n, ngj);
			}
		}


	}
	// Secilit katrore ia jep ngjyren nga numrat e rastesishem
	// 1-6. Dhe nga vargu ngjyrat[] merr ngjyren per secilin katrore
	public static void mbush_ngjyr(){
		Random diceRoller = new Random();

		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 13; j++) {
				int roll = diceRoller.nextInt(6);
				// System.out.println(roll);
				kutia[i][j] = new Pixelat();
				kutia[i][j].setColor(ngjyrat[roll]);
			}
		}
	}

	// Metoda MAIN

	public static void main(String[] args) {

		mbush_ngjyr();
		new Pixelat_View().shiko_fillimin();
		new Tabela();

	}
	// Rishikon se a jan katroret fqinje ne fillim te lojes
	// me ngjyre te njejt.
	public void shiko_fillimin(){
		if(kutia[0][0].getColor()==kutia[0][1].getColor()||
			kutia[0][0].getColor()==kutia[1][0].getColor())
			for(int i=0;i<12;i++){
				for(int j=0;j<13;j++)
					check(i,j,kutia[0][0].getColor());
			}

	}
}
