package br.com.dio.desafio;

import br.com.dio.desafio.model.Evento;
import br.com.dio.desafio.observer.Aluno;
import br.com.dio.desafio.observer.Professor;
import br.com.dio.desafio.subject.GerenciadorEventosTech;

import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        // 1. Cria o gerenciador da comunidade (Subject)
        GerenciadorEventosTech hubTech = new GerenciadorEventosTech();

        // 2. Cria os observadores genéricos (Alunos e Professores)
        Aluno aluno1 = new Aluno("Artur", "Ciência de Dados e IA");
        Aluno aluno2 = new Aluno("Maria", "Engenharia da Computação");
        Professor prof1 = new Professor("Carlos", "Instituto de Computação");

        // 3. Inscreve todos na comunidade
        hubTech.adicionarInscrito(aluno1);
        hubTech.adicionarInscrito(aluno2);
        hubTech.adicionarInscrito(prof1);

        // 4. Cria o evento usando a API java.time
        Evento eventoGemini = new Evento(
                "Introdução ao Google Gemini e IA Generativa",
                LocalDateTime.of(2026, Month.NOVEMBER, 15, 14, 0),
                "Auditório Principal do Campus"
        );

        // 5. Agenda o evento (dispara as notificações)
        hubTech.agendarWorkshop(eventoGemini);

        // 6. Testando a remoção e novo evento
        hubTech.removerInscrito(aluno2);

        Evento eventoAWS = new Evento(
                "AWS Student Builder: Arquitetura Cloud Prática",
                LocalDateTime.of(2026, Month.NOVEMBER, 22, 16, 30),
                "Laboratório de Redes e Nuvem"
        );

        hubTech.agendarWorkshop(eventoAWS);
    }
}