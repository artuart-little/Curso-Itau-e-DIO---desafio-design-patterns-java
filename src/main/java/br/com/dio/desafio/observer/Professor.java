package br.com.dio.desafio.observer;

import br.com.dio.desafio.model.Evento;

public class Professor implements Inscrito {
    private String nome;
    private String departamento;

    public Professor(String nome, String departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }

    @Override
    public void atualizar(Evento evento) {
        System.out.println("💼 [Professor] Prezado(a) Prof. " + nome + " (" + departamento + "), informamos sobre o evento acadêmico:");
        System.out.println("    -> Evento: " + evento.getTitulo() + " | Data: " + evento.getDataHoraFormatada() + " | Local: " + evento.getLocal() + "\n");
    }
}