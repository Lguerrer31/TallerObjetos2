/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author coste
 */
public class Mixto {

    private int entero;
    private int numerador;
    private int denominador;

    public Mixto(int entero, int numerador, int denominador) throws DenominadorCeroException {
        this.entero = entero;
        this.numerador = numerador;
        this.denominador = denominador;
        if (denominador == 0) {
            throw new DenominadorCeroException();
        }
    }

    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    public Mixto suma(Mixto m2, Mixto ent1){
        int ent, num, den;
        Mixto m;
        num = ((this.entero * this.denominador) + this.numerador) + ((this.entero * m2.denominador) + m2.numerador);
        den = this.denominador * m2.denominador;   
        m = new Mixto(num, den);
        return m;
    }
    
}
