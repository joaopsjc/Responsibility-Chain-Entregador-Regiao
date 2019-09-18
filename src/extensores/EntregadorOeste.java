/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extensores;

import implementadores.TipoRegiaCorregoDoOuro;
import modelo.Entregador;

/**
 *
 * @author ice
 */
public class EntregadorOeste extends Entregador{

    public EntregadorOeste(Entregador superior) {
        listaDocumentos.add(TipoRegiaCorregoDoOuro.getTipoRegiaCorregoDoOuro());
        setFuncionarioSuperior(superior);
    }
    public String getDescricaoCargo()
    {
        return "Reitor";
    }

    
}
