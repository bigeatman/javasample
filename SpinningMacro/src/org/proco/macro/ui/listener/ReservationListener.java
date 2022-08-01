package org.proco.macro.ui.listener;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JLabel;
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

		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					logField.setText("");
					SSLHandler.doAction(id, pw, date, lessonName, lessonTime, logField);
				} catch (IOException e) {
					JOptionPane.showMessageDialog(parent, "인터넷 연결을 확인해 주세요.");
					e.printStackTrace();
				} catch (InvalidAccountInfoException e) {
					JOptionPane.showMessageDialog(parent, "입력된 아이디와 비밀번호가 일치하지 않습니다.");
					e.printStackTrace();
				} catch (NeedUpdateProgramException e) {
					JOptionPane.showMessageDialog(parent, "예약 페이지의 HTML 코드가 변경되었습니다. 프로그램 업데이트가 필요합니다.");
					e.printStackTrace();
				}
			}
		}).start();
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

}
