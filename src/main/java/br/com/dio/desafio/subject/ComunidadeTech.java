package br.com.dio.desafio.subject;

import br.com.dio.desafio.observer.Inscrito;

public interface ComunidadeTech {
    void adicionarInscrito(Inscrito inscrito);
    void removerInscrito(Inscrito inscrito);
    void notificarInscritos();
}
