
package com.jpcorporation.projetocrudjsfprimefaces.medicamento.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Medicamento implements Serializable, Base{
    
    private Long id;
    private String name;
    private String apresentacao;
    private String laboratorio;
    private String registro;
    private BigDecimal preco;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Medicamento other = (Medicamento) obj;
        return Objects.equals(this.id, other.id);
    }

}
