/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extensores;

import implementadores.TipoRegiaoQuartoDeposito;
import modelo.Entregador;

/**
 *
 * @author ice
 */
public class EntregadorNorte extends Entregador{

    public EntregadorNorte(Entregador superior) {
        listaDocumentos.add(TipoRegiaoQuartoDeposito.getTipoRegiaoQuartoDeposito());
        setFuncionarioSuperior(superior);
    }
    public String getDescricaoCargo()
    {
        return "Coordenador";
    }

    
}
