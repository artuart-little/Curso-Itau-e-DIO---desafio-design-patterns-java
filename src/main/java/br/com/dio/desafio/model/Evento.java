package br.com.dio.desafio.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Evento {
    private String titulo;
    private LocalDateTime dataHora;
    private String local;

    public Evento(String titulo, LocalDateTime dataHora, String local) {
        this.titulo = titulo;
        this.dataHora = dataHora;
        this.local = local;
    }

    public String getTitulo() { return titulo; }
    public String getLocal() { return local; }
    
    public String getDataHoraFormatada() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm");
        return dataHora.format(formatter);
    }
}