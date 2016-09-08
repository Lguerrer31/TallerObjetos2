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
    
    public Mixto suma(Mixto m2) throws DenominadorCeroException{
        int ent, num, den;
        Mixto m;
        num = this.numerador + m2.numerador;
        den = this.denominador * m2.denominador;
        ent = this.entero + m2.entero;
        m = new Mixto(num, den, ent);
        return m;
    }
    
    public Mixto resta(Mixto m2) throws DenominadorCeroException{
        int ent, num, den;
        Mixto m;
        num = this.entero * this.denominador + this.numerador - m2.entero * m2.denominador + m2.numerador;
        den = this.denominador * m2.denominador;
        ent = num / den;
        m = new Mixto(ent, num, den);
        return m;
    }
    
    public Mixto multiplicacion(Mixto m2) throws DenominadorCeroException{
        int ent, num, den;
        Mixto m;
        num = this.entero * this.denominador + this.numerador * m2.entero * m2.denominador + m2.numerador;
        den = this.denominador * m2.denominador;
        ent = num / den;
        m = new Mixto(ent, num, den);
        return m;
    }
    
}
