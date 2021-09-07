package cursojava.classes;

public class AlunoMain {

	public static void main(String[] args) {
		/*Objero ainda não existe na memoria*/
		@SuppressWarnings("unused")
		Aluno aluno1;
		
		/*Agora temos um objeto real na memoria*/
		Aluno aluno2 = new Aluno(null, 0, null, null, null, null, null, null, null, null);
		
		aluno2.setNome("Rodrigo");
		aluno2.setNomeEscola("Escola DAVAR");
		aluno2.setNomeMae("Eudera");
		aluno2.setNomePai("Jão");
		aluno2.setIdade(23);
		aluno2.setDataNascimento("10/08/2003");
		aluno2.setDataMatricula("01/01/2022");
		aluno2.setNumeroCpf("123.456.789.10");
		aluno2.setRg("2020191");
		aluno2.setSerieMatriculado("5º");
		aluno2.setNota1(92.4);
		aluno2.setNota2(72.4);
		aluno2.setNota3(76.4);
		aluno2.setNota4(82.4);
		System.out.println("O nome do Aluno é "+aluno2.getNome());
		System.out.println("Nome da escola: "+aluno2.getNomeEscola());
		System.out.println("Idade: "+aluno2.getIdade());
		System.out.println("Série: "+aluno2.getSerieMatriculado());
		
		System.out.println("A Media da nota: "+aluno2.getMedianota());
		

	}

}
