package javaproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BookingRoomClient_seat {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookingRoomClient_seat window = new BookingRoomClient_seat();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BookingRoomClient_seat() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 818, 585);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn_seat_13 = new JButton("\uC88C\uC11D13");
		btn_seat_13.setBounds(668, 10, 97, 57);
		frame.getContentPane().add(btn_seat_13);
		
		JButton btn_seat_14 = new JButton("\uC88C\uC11D14");
		btn_seat_14.setBounds(559, 10, 97, 57);
		frame.getContentPane().add(btn_seat_14);
		
		JButton btn_seat_15 = new JButton("\uC88C\uC11D15");
		btn_seat_15.setBounds(450, 10, 97, 57);
		frame.getContentPane().add(btn_seat_15);
		
		JButton btn_seat_16 = new JButton("\uC88C\uC11D16");
		btn_seat_16.setBounds(339, 10, 97, 57);
		frame.getContentPane().add(btn_seat_16);
		
		JButton btn_seat_17 = new JButton("\uC88C\uC11D17");
		btn_seat_17.setBounds(230, 10, 97, 57);
		frame.getContentPane().add(btn_seat_17);
		
		JButton btn_seat_18 = new JButton("\uC88C\uC11D18");
		btn_seat_18.setBounds(121, 10, 97, 57);
		frame.getContentPane().add(btn_seat_18);
		
		JButton btn_seat_19 = new JButton("\uC88C\uC11D19");
		btn_seat_19.setBounds(12, 10, 97, 57);
		frame.getContentPane().add(btn_seat_19);
		
		JButton btn_seat_20 = new JButton("\uC88C\uC11D20");
		btn_seat_20.setBounds(12, 77, 97, 57);
		frame.getContentPane().add(btn_seat_20);
		
		JButton btn_seat_21 = new JButton("\uC88C\uC11D21");
		btn_seat_21.setBounds(12, 145, 97, 57);
		frame.getContentPane().add(btn_seat_21);
		
		JButton btn_seat_22 = new JButton("\uC88C\uC11D22");
		btn_seat_22.setBounds(12, 212, 97, 57);
		frame.getContentPane().add(btn_seat_22);
		
		JButton btn_seat_24 = new JButton("\uC88C\uC11D24");
		btn_seat_24.setBounds(12, 412, 97, 57);
		frame.getContentPane().add(btn_seat_24);
		
		JButton btn_seat_25 = new JButton("\uC88C\uC11D25");
		btn_seat_25.setBounds(12, 479, 97, 57);
		frame.getContentPane().add(btn_seat_25);
		
		JButton btn_seat_23 = new JButton("\uC88C\uC11D23");
		btn_seat_23.setBounds(12, 345, 97, 57);
		frame.getContentPane().add(btn_seat_23);
		
		JButton btn_seat_01 = new JButton("\uC88C\uC11D01");
		btn_seat_01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btn_seat_01.setBounds(230, 145, 97, 57);
		frame.getContentPane().add(btn_seat_01);
		
		JButton btn_seat_02 = new JButton("\uC88C\uC11D02");
		btn_seat_02.setBounds(361, 145, 97, 57);
		frame.getContentPane().add(btn_seat_02);
		
		JButton btn_seat_08 = new JButton("\uC88C\uC11D08");
		btn_seat_08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"사용할 수 없습니다.","좌석선택",JOptionPane.ERROR_MESSAGE);
			}
		});
		btn_seat_08.setBounds(230, 229, 97, 57);
		frame.getContentPane().add(btn_seat_08);
		
		JButton btn_seat_07 = new JButton("\uC88C\uC11D07");
		btn_seat_07.setBounds(361, 229, 97, 57);
		frame.getContentPane().add(btn_seat_07);
		
		JButton btn_seat_03 = new JButton("\uC88C\uC11D03");
		btn_seat_03.setBounds(539, 145, 97, 57);
		frame.getContentPane().add(btn_seat_03);
		
		JButton btn_seat_04 = new JButton("\uC88C\uC11D04");
		btn_seat_04.setBounds(668, 145, 97, 57);
		frame.getContentPane().add(btn_seat_04);
		
		JButton btn_seat_06 = new JButton("\uC88C\uC11D06");
		btn_seat_06.setBounds(539, 229, 97, 57);
		frame.getContentPane().add(btn_seat_06);
		
		JButton btn_seat_05 = new JButton("\uC88C\uC11D05");
		btn_seat_05.setBounds(668, 229, 97, 57);
		frame.getContentPane().add(btn_seat_05);
		
		JButton btn_seat_09 = new JButton("\uC88C\uC11D09");
		btn_seat_09.setBounds(293, 412, 97, 57);
		frame.getContentPane().add(btn_seat_09);
		
		JButton btn_seat_10 = new JButton("\uC88C\uC11D10");
		btn_seat_10.setBounds(411, 412, 97, 57);
		frame.getContentPane().add(btn_seat_10);
		
		JButton btn_seat_11 = new JButton("\uC88C\uC11D11");
		btn_seat_11.setBounds(411, 479, 97, 57);
		frame.getContentPane().add(btn_seat_11);
		
		JButton btn_seat_12 = new JButton("\uC88C\uC11D12");
		btn_seat_12.setBounds(293, 479, 97, 57);
		frame.getContentPane().add(btn_seat_12);
	}

}
