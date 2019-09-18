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
public class TipoRegiaCorregoDoOuro implements TipoRegiao {
    
    private static TipoRegiaCorregoDoOuro tipoRegiaCorregoDoOuro = new TipoRegiaCorregoDoOuro();
    
    public static TipoRegiaCorregoDoOuro getTipoRegiaCorregoDoOuro()
    {
        return tipoRegiaCorregoDoOuro;
    }
}
