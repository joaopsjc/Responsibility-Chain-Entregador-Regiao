/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ice
 */
public class Regiao {
    private TipoRegiao tipoRegiao;

    public Regiao(TipoRegiao tipoRegiao) {
        this.tipoRegiao = tipoRegiao;
    }

    public TipoRegiao getTipoRegiao() {
        return tipoRegiao;
    }

    public void setTipoRegiao(TipoRegiao tipoRegiao) {
        this.tipoRegiao = tipoRegiao;
    }

}
