package com.backend.DesafioRelogio.entity;

public enum TipoVidroEnum {

    MINERAL, SAFIRA, ACRILICO;

    //todo: fazer o fromApi() para converter a string da api para o enum, caso a string seja nula ou vazia, retornar null
    public static TipoVidroEnum fromApi(String valor) {
        if (valor == null || valor.isBlank()) {
            return null;
        }
        return switch (valor) {
            case "mineral" -> TipoVidroEnum.MINERAL;
            case "safira" -> TipoVidroEnum.SAFIRA;
            case "acrilico" -> TipoVidroEnum.ACRILICO;
            default -> throw new IllegalArgumentException("tipo de vidro invalido " + valor);
        };
    }

    //todo: fazer o toApi() para converter o enum para string
    public String toApi() {
        return switch (this) {
            case MINERAL -> "mineral";
            case SAFIRA -> "safira";
            case ACRILICO -> "acrilico";
        };
    }
}
