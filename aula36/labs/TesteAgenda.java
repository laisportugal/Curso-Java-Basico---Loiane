package aula36.labs;

public class TesteAgenda {

	public static void main(String[] args) {

		Agenda agenda = new Agenda();
		
		Contato contato = new Contato();
		contato.setNome("Luana");
		contato.setEmail("luana@gmail.com");
		contato.setTelefone("2222 22222");

		Contato contato2 = new Contato();
		contato2.setNome("Luana");
		contato2.setEmail("luana@gmail.com");
		contato2.setTelefone("2222 22222");
		
		Contato contato3 = new Contato();
		contato3.setNome("Luana");
		contato3.setEmail("luana@gmail.com");
		contato3.setTelefone("2222 22222");
		
		Contato[] contatos = new Contato[3];
		contatos[0] = contato;
		contatos[1] = contato2;
		contatos[2] = contato3;
		
		agenda.setContatos(contatos);
		
	}

}
