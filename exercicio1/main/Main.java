package main;

import java.util.Date;

import model.Emprestimo;
import model.Livro;
import model.Pessoa;

public class Main {
    public static void main(String[]args){

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.idEmprestimo = (long) 130;
        emprestimo.dataEmprestimo = new Date(0,0,0);
        emprestimo.dataDevolucao = new Date(0,0,0);

        emprestimo.livro = new Livro();
        emprestimo.livro.idLivro = (long) 400;
        emprestimo.livro.titulo = ""; 
        emprestimo.livro.autor = ""; 
        emprestimo.livro.emprestado = false;
        
        emprestimo.pessoa = new Pessoa();
        emprestimo.pessoa.idPessoa = (long) 550;
        emprestimo.pessoa.nome = "";        
    }
}