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
public class TipoRegiaoCentro implements TipoRegiao {
    
    private static TipoRegiaoCentro tipoRegiaoCentro = new TipoRegiaoCentro();
    
    public static TipoRegiaoCentro getTipoRegiaoCentro()
    {
        return tipoRegiaoCentro;
    }
}
