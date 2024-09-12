package Concorrência.Conditions;

import javax.swing.JOptionPane;

import Threads.Wait_Notify_NotifyAll.Domínio.Membros;
import Threads.Wait_Notify_NotifyAll.Services.EmailDeliveryService;

public class Principal {

	public static void main(String[] args) {
		Membros m = new Membros();
		Thread ana = new Thread(new EmailDeliveryService(m), "Ana");
		Thread mateus = new Thread(new EmailDeliveryService(m), "Mateus");
		ana.start();
		mateus.start();
		while(true) {
			String email = JOptionPane.showInputDialog("Preencha o email:");
			if(email == null || email.isEmpty()) {
				m.close();
				break;
			}
			m.addMembersEmail(email);
		}
	}
}