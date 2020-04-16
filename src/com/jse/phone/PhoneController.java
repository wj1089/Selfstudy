package com.jse.phone;

import javax.swing.JOptionPane;
import com.jse.phone.Phone.*;
import Util.Constants;

public class PhoneController {

	public static void main(String[] args) {
		
		PhoneServiceImpl service = new PhoneServiceImpl();
		
		while(true) {
			switch(JOptionPane.showInputDialog(Constants.MENU)) {
			case "0":return;
			case "1":
				for(int i=0;i<3;i++) {
					String[] values = JOptionPane.showInputDialog(Constants.PHONE_INPUT).split(",");
					service.add(new Phone(values[0],values[1],values[2]));
				}
				
				break;
			case "2":
				Phone[] phones = service.getPhones();
				String message = "";
				for(int i=0; i<5; i++) {
					message += phones[i].toString();
				}
				JOptionPane.showMessageDialog(null, message);
				
				break; 
//			case "3":
//								JOptionPane.showInputDialog(Constants.CELPHONE_MENU);
//
//				JOptionPane.showInputDialog(Constants.IPHONE_MENU);
//
//				break; 
//			case "4":
//				JOptionPane.showInputDialog(Constants.GALAXYNOTE_MENU);
//
//				break; 	
			}
		}
		
	}

}
