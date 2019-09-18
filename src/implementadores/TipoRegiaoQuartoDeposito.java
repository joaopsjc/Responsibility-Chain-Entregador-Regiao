/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementadores;

import modelo.TipoRegiao;

/**
 *
 * @author ice
 */
public class TipoRegiaoQuartoDeposito implements TipoRegiao {
    
    private static TipoRegiaoQuartoDeposito tipoRegiaoQuartoDeposito = new TipoRegiaoQuartoDeposito();
    
    public static TipoRegiaoQuartoDeposito getTipoRegiaoQuartoDeposito()
    {
        return tipoRegiaoQuartoDeposito;
    }
}
