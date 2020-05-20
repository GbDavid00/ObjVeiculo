/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work;

/**
 *
 * @author gabri
 */
public class Aviao extends Veiculo {
    //Atributo

    private int motores;
    private String carga;

    //Get e Set
    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    public Aviao(String nome, String cor, String combustivel, int portas, int rodas, int motores, String carga) {
        super(nome, cor, combustivel, portas, rodas);
        setMotores(motores);
        setCarga(carga);
    }
}
