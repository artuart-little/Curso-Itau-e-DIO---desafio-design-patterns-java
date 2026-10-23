package br.com.dio.desafio.subject;

import br.com.dio.desafio.model.Evento;
import br.com.dio.desafio.observer.Inscrito;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorEventosTech implements ComunidadeTech {
    private List<Inscrito> inscritos = new ArrayList<>();
    private Evento ultimoEvento;

    @Override
    public void adicionarInscrito(Inscrito inscrito) {
        inscritos.add(inscrito);
    }

    @Override
    public void removerInscrito(Inscrito inscrito) {
        inscritos.remove(inscrito);
    }

    @Override
    public void notificarInscritos() {
        for (Inscrito inscrito : inscritos) {
            inscrito.atualizar(ultimoEvento);
        }
    }

    public void agendarWorkshop(Evento evento) {
        this.ultimoEvento = evento;
        System.out.println("=================================================");
        System.out.println("📣 [SISTEMA] Disparando notificações para: " + evento.getTitulo());
        System.out.println("=================================================\n");
        notificarInscritos();
    }
}
