package com.backend.DesafioRelogio.entity;

public enum TipoMovimentoEnum {

    QUARTZ, AUTOMATICO, MANUAL;


//todo: fazer o fromApi() para converter a string da api para o enum, caso a string seja nula ou vazia, retornar null
    public static TipoMovimentoEnum fromApi(String valor) {

        if (valor == null || valor.isBlank()) {
            return null;
        }
        return switch (valor) {
            case "QUARTZ" -> TipoMovimentoEnum.QUARTZ;
            case "AUTOMATICO" -> TipoMovimentoEnum.AUTOMATICO;
            case "MANUAL" -> TipoMovimentoEnum.MANUAL;
            default -> throw new IllegalArgumentException("tipo de movimento invalido " + valor);
        };


    }

    //todo: fazer o toApi() para converter o enum para string
    public String toApi() {
        return switch (this) {
            case QUARTZ -> "quartz";
            case AUTOMATICO -> "automatico";
            case MANUAL -> "manual";
        };
    }
}
