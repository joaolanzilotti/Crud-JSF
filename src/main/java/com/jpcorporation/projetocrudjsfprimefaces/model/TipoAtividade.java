
package com.jpcorporation.projetocrudjsfprimefaces.model;


public enum TipoAtividade {
    
    APRESENTACAO("Apresentação"), CURSO("Curso"), MINICURSO("Minicurso"), PALESTRA("Palestra"), SEMINARIO("Seminário"), SIMPOSTO("Simpósito"), OUTRA("Outras");
    
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    private TipoAtividade(String descricao) {
        this.descricao = descricao;
    }

    private TipoAtividade() {
    }


    
    
}
