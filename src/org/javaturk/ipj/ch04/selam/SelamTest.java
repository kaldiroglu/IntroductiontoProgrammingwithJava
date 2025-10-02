package org.javaturk.ipj.ch04.selam;

public class SelamTest{
    public static void main(String[] args){
        Selam nesne = new Selam();
        String cevap = nesne.selamSoyle("Ali");
        System.out.println(cevap);
    }
}

class Selam{
    String world = "millet";

    public String selamSoyle(String kime) {
        String cumle;
        if (kime != "")
            cumle = "Selam " + kime + " :)";
        else
            cumle = "Selam " + world + " :)";
        return cumle;
    }
}