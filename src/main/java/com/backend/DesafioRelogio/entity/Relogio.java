package com.backend.DesafioRelogio.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "relogio", indexes = {
        @Index(name = "idx_relogio_marca", columnList = "marca"),
        @Index(name = "idx_relogio_criado_em", columnList = "criadoEm"),
        @Index(name = "idx_relogio_preco", columnList = "precoEmCentavos")
})
public class Relogio {

    @Id
    @Column(nullable = false, updatable = false)
    private UUID id;

    @Column(nullable = false, length = 80)
    private String marca;

    @Column(nullable = false, length = 125)
    private String modelo;

    @Column(nullable = false, length = 80)
    private String referencia;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private TipoMovimentoEnum tipoMovimentoEnum;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private MaterialCaixaEnum materialCaixaEnum;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private TipoVidroEnum tipoVidroEnum;

    @Column(nullable = false)
    private int resistenciaAguaM;

    @Column(nullable = false)
    private int diametroM;

    @Column(nullable = false)
    private int lugToLugm;

    @Column(nullable = false)
    private int espessura;

    @Column(nullable = false)
    private int larguraM;

    @Column(nullable = false)
    private long precoEmCentavos;

    @Column(nullable = false, length = 600)
    private String urlImagem;

    @Column(nullable = false)
    private Instant criadoEm;


}
