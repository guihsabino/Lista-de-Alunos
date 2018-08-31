package ListadeAlunos;

import javax.swing.JOptionPane;

public class ListadeAlunos {
	private String dados[];
	private int tamanho;

	public ListadeAlunos(int TamanhoDaLista) {
		dados = new String[TamanhoDaLista];
		tamanho = 0;
	}

	public String toString() {

		String resp = "";
		for (int i = 0; i < tamanho; i++) {

			resp = resp + "\n" + dados[i].toString();

		}
		return resp;

	}

	public void adiciona(String e) {

		if (tamanho == dados.length) {
			JOptionPane.showMessageDialog(null, "Lista Cheia!");

		} else {

			int i = tamanho;
			while (i > 0 && dados[i - 1].compareTo(e) > 0) {
				dados[i] = dados[i - 1];
				i--;
			}

			dados[i] = e;
			tamanho++;
		}

	}

	public int busca(int inicio, int fim, String nome) {

		int r = -1;
		int meio;

		while (inicio <= fim && r == 1) {

			meio = (inicio + fim) / 2;
			if (dados[meio].equals(nome)) {
				r = meio;
			} else if (dados[meio].compareTo(nome) > 0) {
				fim = meio - 1;
			} else {
				inicio = meio + 1;
			}

		}
		return r;

	}

	public int remove(String nome) {
		int resp = -1;
		if (tamanho == 0) {
			System.out.println("ERRO!LISTA VAZIA");
		} else {
			int i = busca(0, tamanho - 1, nome);
			if (i == -1) {
				System.out.println("Nome não encontrado");
			} else {
				resp = i;
				while (i < tamanho - 1) {
					dados[i] = dados[i + 1];
					i++;
				}
				tamanho--;
			}
		}
		return resp;
	}

}