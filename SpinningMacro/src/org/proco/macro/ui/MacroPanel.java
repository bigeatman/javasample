package org.proco.macro.ui;

import java.awt.Graphics;

import javax.swing.JPanel;

public class MacroPanel extends JPanel {

	/** serialVersinoUID */
	private static final long serialVersionUID = -5615937352386909343L;

	/**
	 * Constructor
	 */
	public MacroPanel() {
		super();
		this.setLayout(null);
	}

	/**
	 * paint borders
	 */
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.drawString("계정 정보", 25, 15);
		g.drawLine(10, 10, 20, 10);
		g.drawLine(80, 10, 160, 10);
		g.drawLine(10, 10, 10, 70);
		g.drawLine(160, 10, 160, 70);
		g.drawLine(10, 70, 160, 70);

		g.drawString("예약 정보", 185, 15);
		g.drawLine(170, 10, 180, 10);
		g.drawLine(240, 10, 330, 10);
		g.drawLine(170, 10, 170, 70);
		g.drawLine(170, 70, 330, 70);
		g.drawLine(330, 70, 330, 10);
	}
}
