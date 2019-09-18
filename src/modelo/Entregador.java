/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author ice
 */
public abstract class Entregador {
    protected ArrayList listaDocumentos = new ArrayList();
    private Entregador funcionarioSuperior;

    public Entregador getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Entregador funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }
    public abstract String getDescricaoCargo();
    
    public String assinarDocumento(Regiao regiao)
    {
        if(listaDocumentos.contains(regiao.getTipoRegiao()))
        {
            return getDescricaoCargo();
        }
        else
        {
            if(funcionarioSuperior!=null)
            {
                return funcionarioSuperior.assinarDocumento(regiao);
            }
            else
            {
                return "Sem assinatura";
            }
        
        }
    }
}
