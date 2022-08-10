package org.proco.macro.ui.listener;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.proco.macro.net.SSLHandler;
import org.proco.macro.net.exception.InvalidAccountInfoException;
import org.proco.macro.net.exception.NeedUpdateProgramException;

public class ReservationListener implements ActionListener {

	/** field for get id */
	private JTextField idField;

	/** field for get pw */
	private JTextField pwField;

	/** field for get date */
	private JTextField dateField;

	/** field for get lesson name */
	private JTextField nameField;

	/** field for get lesson time */
	private JTextField timeField;

	/** field for write log */
	private JTextArea logField;

	/** field for reservation time */
	private JTextField targetTime;

	/** parent component */
	private Component parent;

	/**
	 * Constructor
	 */
	public ReservationListener() {
		super();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String id = idField.getText();
		String pw = pwField.getText();
		String date = dateField.getText();
		String lessonName = nameField.getText();
		String lessonTime = timeField.getText();

		if ((id.length() == 0) || (pw.length() == 0)) {
			JOptionPane.showMessageDialog(parent, "아이디 또는 패스워드가 비어 있습니다.");
			return;
		}

		new Thread(createReservationThread(id, pw, date, lessonName, lessonTime)).start();
	}

	/**
	 * 
	 * @param id
	 * @param pw
	 * @param date
	 * @param lessonName
	 * @param lessonTime
	 * @return
	 */
	private Runnable createReservationThread(String id, String pw, String date, String lessonName, String lessonTime) {
		return new Runnable() {
			/**
			 * 
			 */
			@Override
			public void run() {
				logField.append("# 서버 시간과 현재 시간의 오차가 발생할 수 있기 때문에 대상 시간 10초 전부터 작동합니다.\r\n");
				logField.append("# 대기중 ... \r\n");
				waitForTargetTime();

				logField.append("# 매크로 시작\r\n\r\n");
				runReservation(id, pw, date, lessonName, lessonTime);
			}

			/**
			 * 
			 */
			private void waitForTargetTime() {
				long targetTimeMills = (getTargetTimeMills(targetTime.getText()) / 1000) - 10;

				while (true) {
					long cur = System.currentTimeMillis() / 1000;

					if (targetTimeMills == cur) {
						break;
					}

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

			/**
			 * 
			 * @param text
			 * @return
			 */
			private long getTargetTimeMills(String text) {
				String[] times = text.split(":");
				Calendar c = Calendar.getInstance();

				int year = c.get(Calendar.YEAR);
				int month = c.get(Calendar.MONTH) + 1;
				int day = c.get(Calendar.DAY_OF_MONTH);
				int hour = Integer.valueOf(times[0]);
				int min = Integer.valueOf(times[1]);
				int sec = Integer.valueOf(times[2]);

				System.out.println(year + " " + month + " " + day + " " + hour + " " + min + " " + sec);
				return LocalDateTime.of(year, month, day, hour, min, sec).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
			}

			/**
			 * 
			 * @param id
			 * @param pw
			 * @param date
			 * @param lessonName
			 * @param lessonTime
			 */
			private void runReservation(String id, String pw, String date, String lessonName, String lessonTime) {
				int exitCode = -1;

				while (exitCode == -1) {
					try {
						exitCode = SSLHandler.doAction(id, pw, date, lessonName, lessonTime, logField);
					} catch (IOException e) {
						e.printStackTrace();
					} catch (InvalidAccountInfoException e) {
						JOptionPane.showMessageDialog(parent, "입력된 아이디와 비밀번호가 일치하지 않습니다.");
						e.printStackTrace();
						break;
					} catch (NeedUpdateProgramException e) {
						JOptionPane.showMessageDialog(parent, "예약 페이지의 HTML 코드가 변경되었습니다. 프로그램 업데이트가 필요합니다.");
						e.printStackTrace();
						break;
					}
				}
			}
		};
	}

	/**
	 * 
	 * @param idField
	 */
	public void setIdField(JTextField idField) {
		this.idField = idField;
	}

	/**
	 * 
	 * @param pwField
	 */
	public void setPwField(JTextField pwField) {
		this.pwField = pwField;
	}

	/**
	 * 
	 * @param dateField
	 */
	public void setDateField(JTextField dateField) {
		this.dateField = dateField;
	}

	/**
	 * 
	 * @param logField
	 */
	public void setLogField(JTextArea logField) {
		this.logField = logField;
	}

	/**
	 * 
	 * @param parent
	 */
	public void setParent(Component parent) {
		this.parent = parent;
	}

	/**
	 * 
	 * @return
	 */
	public JTextField getNameField() {
		return nameField;
	}

	/**
	 * 
	 * @param nameField
	 */
	public void setNameField(JTextField nameField) {
		this.nameField = nameField;
	}

	/**
	 * 
	 * @return
	 */
	public JTextField getTimeField() {
		return timeField;
	}

	/**
	 * 
	 * @param timeField
	 */
	public void setTimeField(JTextField timeField) {
		this.timeField = timeField;
	}

	/**
	 * 
	 * @return
	 */
	public JTextField getTargetTime() {
		return targetTime;
	}

	/**
	 * 
	 * @param targetTime
	 */
	public void setTargetTime(JTextField targetTime) {
		this.targetTime = targetTime;
	}
}
