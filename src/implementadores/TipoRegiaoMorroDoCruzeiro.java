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
public class TipoRegiaoMorroDoCruzeiro implements TipoRegiao {
    
    private static TipoRegiaoMorroDoCruzeiro tipoRegiaoMorroDoCruzeiro = new TipoRegiaoMorroDoCruzeiro();
    
    public static TipoRegiaoMorroDoCruzeiro getTipoRegiaoMorroDoCruzeiro()
    {
        return tipoRegiaoMorroDoCruzeiro;
    }
}
