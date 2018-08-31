package ListadeAlunos;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		ListadeAlunos l = new ListadeAlunos(5);
		int opc = 0;

		while (opc != 9) {

			opc = Integer.parseInt(JOptionPane
					.showInputDialog("MENU PRINCIPAL "
							+ "\n1 - Adiciona Aluno"
							+ "\n2 - Remove Aluno" 
							+ "\n3 - Buscar Aluno"
							+ "\n9 - Sair"));
			switch (opc) {
			case 1:
				l.adiciona(JOptionPane.showInputDialog("Digite o nome do aluno: "));
				JOptionPane.showMessageDialog(null, "Adicionado");
				break;
				
			case 2:
				l.remove(JOptionPane.showInputDialog("Digite o nome do aluno: "));
				JOptionPane.showMessageDialog(null, "Removido");
				break;
			case 3:
				//JOptionPane.showInputDialog("Digite o nome do aluno: "));
				//l.busca(inicio, fim, nome)
				break;
			case 9:
				System.exit(0);
				break;

			default:
				JOptionPane.showMessageDialog(null, "OPÇÂO INVALIDA");

			}

		}
	}
}
