package main;


import java.util.Date;

import model.Usuario;
import model.Emprestimo;
import model.Livro;
import model.Exemplar;

public class Main {
	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		
		usuario.nome = "";
		usuario.cpf = 0123456;
		usuario.telefone = "";
		usuario.matricula = "";
		
		Emprestimo emprestimo = new Emprestimo();
		
		emprestimo.dataDeEmprestimo = new Date();
		emprestimo.dataPrevistaDeDevolucao = new Date();
		emprestimo.dataDeEntregaReal = new Date();
		emprestimo.situacao = 12;
		
		Livro livro = new Livro();
		
		livro.titulo = "";
		livro.autor = "";
		livro.ano = new Date();
		livro.edicao = 34;
		livro.editora = "";
		livro.ISBN = "";
		
		Exemplar exemplar = new Exemplar();
		
		exemplar.codigo = 1234;
		exemplar.cativa = false;
		exemplar.emprestada = true;
	}
}