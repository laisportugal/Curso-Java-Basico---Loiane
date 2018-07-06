package aula24.handson;

import java.util.Date;

public class Exer04 {

	public static void main(String[] args) {
		LivroDeBiblioteca livro = new LivroDeBiblioteca();
		livro.dataEmprestimo = new Date();
		livro.anoLancamento="1992";
		livro.titulo= "Livro da Loiane";
		livro.autor = "Loiane";
		livro.emprestado = true;
	}

}
