package com.backend.DesafioRelogio.entity;

public enum MaterialCaixaEnum {
    ACO, TITANIO, RESINA, BRONZE, CERAMICA;

//todo: fazer o fromApi() para converter a string da api para o enum, caso a string seja nula ou vazia, retornar null
    public static MaterialCaixaEnum fromApi(String valor) {
        if (valor == null || valor.isBlank()) {
            return null;
        }
        return switch (valor) {
            case "steel" -> MaterialCaixaEnum.ACO;
            case "titanium" -> MaterialCaixaEnum.TITANIO;
            case "resin" -> MaterialCaixaEnum.RESINA;
            case "bronze" -> MaterialCaixaEnum.BRONZE;
            case "ceramic" -> MaterialCaixaEnum.CERAMICA;
            default -> throw new IllegalArgumentException("material da caixa invalido " + valor);
        };
    }


    //todo: fazer o toApi() para converter o enum para string
    public String toApi() {
        return switch (this) {
            case ACO -> "steel";
            case TITANIO -> "titanium";
            case RESINA -> "resin";
            case BRONZE -> "bronze";
            case CERAMICA -> "ceramic";
        };
    }

}
