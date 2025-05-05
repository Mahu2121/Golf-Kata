package edu.estatuas;

public class Hole {
    private Byte number;
    private Byte par;

    Hole(Byte number, Byte par) {
        this.number = number;
        this.par = par;
    }

    public Byte getNumber() {
        return number;
    }

    public Byte getPar() {
        return par;
    }

    @Override
    public String toString() {
        return "\s\s\s" + getNumber() + " - " + getPar();
    }

}
