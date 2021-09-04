import javax.swing.JOptionPane;

public class Inicio {

	public static void main(String[] args) {
		System.out.println("Testando o GitHubDesktop com o Eclipse.");
		System.out.println("Editando remoto no GitHub");
		
		String nome = JOptionPane.showInputDialog("Informe o nome do usuario.");
		int resposta = JOptionPane.showConfirmDialog(null,"Usuario "+nome+" esta correto ?");
		
		if(resposta == 0) {
			
			JOptionPane.showMessageDialog(null, "Usuario confirmado.");
			
		}else if (resposta == 1) {
			JOptionPane.showInputDialog("Informe novamente nome do usuario.");
		}
			
		

	}

}
