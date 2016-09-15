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
        ent = this.entero + m2.entero;
        num = (this.entero * this.denominador + this.numerador) + (m2.entero * m2.denominador + m2.numerador);
        den = this.denominador * m2.denominador;
        m = new Mixto(ent, num, den);
        return m;
    }
    
    public Mixto resta(Mixto m2) throws DenominadorCeroException{
        int ent, num, den;
        Mixto m;
        num = (this.entero * this.denominador + this.numerador) - (m2.entero * m2.denominador + m2.numerador);
        den = this.denominador * m2.denominador;
        ent = num / den;
        m = new Mixto(ent, num, den);
        return m;
    }
    
    public Mixto multiplicacion(Mixto m2) throws DenominadorCeroException{
        int ent, num, den;
        Mixto m;
        num = (this.entero * this.denominador + this.numerador) * (m2.entero * m2.denominador + m2.numerador);
        den = this.denominador * m2.denominador;
        ent = num / den;
        m = new Mixto(ent, num, den);
        return m;
    }
    
    public Mixto division(Mixto m2) throws DenominadorCeroException{
        int ent, num, den, help, hel;
        Mixto m;
        ent = 0;
        help = (this.entero * this.denominador + this.numerador);
        hel = (m2.entero * m2.denominador + m2.numerador);
        num = help * m2.denominador;
        den = hel * m2.numerador;
        m = new Mixto(ent, num, den);
        return m;
    }
    
    public Mixto fraccionario() throws DenominadorCeroException{
        int num4, den4, ent = 0;
        Mixto m3;
        num4 = (this.getEntero() * this.getDenominador()) + this.getNumerador();
        den4 = this.getDenominador();
        m3 = new Mixto(ent, num4, den4);
        return m3;
    }
    
}
