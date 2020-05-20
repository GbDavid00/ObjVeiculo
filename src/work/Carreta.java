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
public class Carreta extends Veiculo {
    //Atributo

    private int eixos;

    //Get Set
    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    //Construtor      
    public Carreta(String nome, String cor, String combustivel, int portas, int rodas, int eixos) {
        super(nome, cor, combustivel, portas, rodas);
        setEixos(eixos);
    }
}
