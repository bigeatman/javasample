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
	private JLabel dateField;

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

		if ((id.length() == 0) || (pw.length() == 0)) {
			JOptionPane.showMessageDialog(parent, "���̵� �Ǵ� �н����尡 ��� �ֽ��ϴ�.");
			return;
		}

		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					logField.setText("");
					SSLHandler.doAction(id, pw, date, logField);
				} catch (IOException e) {
					JOptionPane.showMessageDialog(parent, "���ͳ� ������ Ȯ���� �ּ���.");
				} catch (InvalidAccountInfoException e) {
					JOptionPane.showMessageDialog(parent, "�Էµ� ���̵�� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				} catch (NeedUpdateProgramException e) {
					JOptionPane.showMessageDialog(parent, "���� �������� HTML �ڵ尡 ����Ǿ����ϴ�. ���α׷� ������Ʈ�� �ʿ��մϴ�.");
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
	public void setDateField(JLabel dateField) {
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

}
