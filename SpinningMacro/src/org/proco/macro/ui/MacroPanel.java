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

		g.drawString("예약 정보", 25, 90);
		g.drawLine(10, 85, 20, 85);
		g.drawLine(80, 85, 160, 85);
		g.drawLine(10, 85, 10, 175);
		g.drawLine(160, 85, 160, 175);
		g.drawLine(10, 175, 160, 175);
	}
}
