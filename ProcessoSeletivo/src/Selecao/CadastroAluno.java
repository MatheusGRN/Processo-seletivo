package Selecao;

import java.io.File;
import java.util.Calendar;
import java.util.Date;

public interface CadastroAluno {
	
	public void cadastrarAluno(String nome, File foto, int matricula, int idade, Calendar dataDeNascimento, String curso);

}
