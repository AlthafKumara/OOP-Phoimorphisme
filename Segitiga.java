package oop.pholimorphisme;

public class Segitiga extends BangunDatar {
    int alas;
    int tinggi;
    
    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public double luas(){
    return this.alas*this.tinggi*1/2;
    }
            
            
            
}
