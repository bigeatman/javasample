package org.proco.macro.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import org.proco.macro.ui.listener.ReservationListener;

public class MainFrame extends JFrame {

	/** serialVersionUID */
	private static final long serialVersionUID = -3795773577486358411L;

	/** default font */
	private static final Font DEFAULT_FONT = Font.getFont("arial");

	/** listener for reservation loop */
	private final ReservationListener listener;

	/**
	 * Constructor
	 * 
	 * @throws HeadlessException
	 */
	public MainFrame() throws HeadlessException {
		super();
		listener = new ReservationListener();
		listener.setParent(this);

		this.setSize(355, 330);
		this.setTitle("리조트 휘트니스 예약 프로그램");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.createViews();
		this.setVisible(true);
	}

	/**
	 * create views
	 */
	private void createViews() {
		JPanel panel = new MacroPanel();
		this.add(panel, BorderLayout.CENTER);

		createLoginViews(panel);
		createReservationViews(panel);
		createLogView(panel);
	}

	/**
	 * create login view
	 * 
	 * @param panel
	 */
	private void createLoginViews(JPanel panel) {
		JLabel idLabel = new JLabel("ID : ");
		idLabel.setBounds(20, 25, 100, 10);
		idLabel.setFont(DEFAULT_FONT);
		panel.add(idLabel);

		JTextField idInput = new JTextField();
		idInput.setBounds(50, 20, 100, 20);
		panel.add(idInput);

		JLabel pwLabel = new JLabel("PW : ");
		pwLabel.setBounds(20, 50, 100, 10);
		pwLabel.setFont(DEFAULT_FONT);
		panel.add(pwLabel);

		JTextField pwInput = new JTextField();
		pwInput.setBounds(50, 45, 100, 20);
		panel.add(pwInput);

		listener.setIdField(idInput);
		listener.setPwField(pwInput);
	}

	/**
	 * create reservation view
	 * 
	 * @param panel
	 */
	private void createReservationViews(JPanel panel) {
		JLabel dateLabel = new JLabel("Date : ");
		dateLabel.setBounds(180, 25, 110, 10);
		dateLabel.setFont(DEFAULT_FONT);
		panel.add(dateLabel);

		JLabel dateInput = new JLabel();
		dateInput.setBounds(215, 20, 110, 20);
		dateInput.setText(LocalDate.now().toString());
		dateInput.setFont(DEFAULT_FONT);
		panel.add(dateInput);

		JButton reservationButton = new JButton("예약 시작");
		reservationButton.setFont(DEFAULT_FONT);
		reservationButton.setBounds(180, 45, 145, 20);
		reservationButton.setFocusable(false);
		reservationButton.addActionListener(listener);
		panel.add(reservationButton);

		listener.setDateField(dateInput);
	}

	/**
	 * create log view
	 * 
	 * @param panel
	 */
	private void createLogView(JPanel panel) {
		JTextArea log = new JTextArea();
		log.setEditable(false);

		JScrollPane pane = new JScrollPane(log, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		pane.setBounds(10, 80, 320, 200);
		pane.setBorder(new LineBorder(Color.darkGray));
		panel.add(pane);

		listener.setLogField(log);
	}
}
