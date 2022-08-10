package org.proco.macro.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.time.LocalDate;
import java.util.Calendar;

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

		this.setSize(450, 340);
		this.setTitle("리조트 휘트니스 예약 프로그램");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		createTimeView(panel);
		createLogView(panel);
	}

	/**
	 * 
	 * @param panel
	 */
	private void createTimeView(JPanel panel) {
		JLabel currTimeLabel = new JLabel("현재시간 : ");
		currTimeLabel.setBounds(20, 202, 100, 15);
		currTimeLabel.setFont(DEFAULT_FONT);
		panel.add(currTimeLabel);

		JLabel currTime = new JLabel();
		currTime.setBounds(80, 199, 70, 20);
		currTime.setFont(DEFAULT_FONT);
		panel.add(currTime);

		JLabel targetTimeLabel = new JLabel("대상시간 : ");
		targetTimeLabel.setBounds(20, 222, 100, 15);
		targetTimeLabel.setFont(DEFAULT_FONT);
		panel.add(targetTimeLabel);

		JTextField targetTime = new JTextField();
		targetTime.setBounds(80, 220, 70, 20);
		targetTime.setText("22:30:00");
		panel.add(targetTime);

		listener.setTargetTime(targetTime);
		new Thread(getTimerThread(currTime)).start();
	}

	/**
	 * 
	 * @param currTime
	 * @return
	 */
	private Runnable getTimerThread(JLabel currTime) {
		return new Runnable() {
			@Override
			public void run() {
				while (true) {
					try {
						Thread.sleep(100);
						currTime.setText(getCurrentTime());
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

			public String getCurrentTime() {
				Calendar c = Calendar.getInstance();
				int hour = c.get(Calendar.HOUR_OF_DAY);
				int min = c.get(Calendar.MINUTE);
				int sec = c.get(Calendar.SECOND);

				String time = hour + ":" + min + ":" + sec;
				return time;
			}
		};
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
		JLabel nameLabel = new JLabel("Name : ");
		nameLabel.setBounds(20, 100, 110, 15);
		nameLabel.setFont(DEFAULT_FONT);
		panel.add(nameLabel);

		JTextField nameInput = new JTextField();
		nameInput.setBounds(65, 97, 85, 20);
		nameInput.setText("스피닝");
		nameInput.setFont(DEFAULT_FONT);
		panel.add(nameInput);

		JLabel dateLabel = new JLabel("Date : ");
		dateLabel.setBounds(20, 125, 110, 15);
		dateLabel.setFont(DEFAULT_FONT);
		panel.add(dateLabel);

		JTextField dateInput = new JTextField();
		dateInput.setBounds(65, 122, 85, 20);
		dateInput.setText(LocalDate.now().plusDays(1).toString());
		dateInput.setFont(DEFAULT_FONT);
		panel.add(dateInput);

		JLabel timeLabel = new JLabel("Time : ");
		timeLabel.setBounds(20, 150, 110, 15);
		timeLabel.setFont(DEFAULT_FONT);
		panel.add(timeLabel);

		JTextField timeInput = new JTextField();
		timeInput.setBounds(65, 147, 85, 20);
		timeInput.setText("20:00 ~ 20:50");
		timeInput.setFont(DEFAULT_FONT);
		panel.add(timeInput);

		JButton reservationButton = new JButton("예약 시작");
		reservationButton.setFont(DEFAULT_FONT);
		reservationButton.setBounds(10, 255, 151, 35);
		reservationButton.setFocusable(false);
		reservationButton.addActionListener(listener);
		panel.add(reservationButton);

		listener.setNameField(nameInput);
		listener.setDateField(dateInput);
		listener.setTimeField(timeInput);
	}

	/**
	 * create log view
	 * 
	 * @param panel
	 */
	private void createLogView(JPanel panel) {
		JTextArea log = new JTextArea();
		log.setEditable(false);
		log.setLineWrap(true);

		JScrollPane pane = new JScrollPane(log, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		pane.setBounds(170, 10, 255, 280);
		pane.setBorder(new LineBorder(Color.darkGray));
		panel.add(pane);

		listener.setLogField(log);
	}
}
