package com.vinicius.finances.projections;

import java.time.LocalDate;

public interface DespesaProjection extends MovimentacaoProjection {

    String getNome();
    Long getCategoriaDespesaId();
    Long getIdParcela();
    LocalDate getDataDeVencimento();
    Double getValorParcela();
    Long getDespesaId();
}
