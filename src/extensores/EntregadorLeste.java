/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extensores;

import implementadores.TipoRegiaoGraminha;
import modelo.Entregador;

/**
 *
 * @author ice
 */
public class EntregadorLeste extends Entregador{

    public EntregadorLeste(Entregador superior) {
        listaDocumentos.add(TipoRegiaoGraminha.getTipoRegiaoGraminha());
        setFuncionarioSuperior(superior);
    }
    public String getDescricaoCargo()
    {
        return "Diretor";
    }

    
}
