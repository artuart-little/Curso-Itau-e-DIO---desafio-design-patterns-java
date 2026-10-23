package br.com.dio.desafio.observer;

import br.com.dio.desafio.model.Evento;

public class Aluno implements Inscrito {
    private String nome;
    private String curso;

    public Aluno(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
    }

    @Override
    public void atualizar(Evento evento) {
        System.out.println("🎓 [Aluno] Olá " + nome + " (" + curso + ")! Novo workshop agendado:");
        System.out.println("    -> Tema: " + evento.getTitulo());
        System.out.println("    -> Quando: " + evento.getDataHoraFormatada());
        System.out.println("    -> Onde: " + evento.getLocal() + "\n");
    }
}