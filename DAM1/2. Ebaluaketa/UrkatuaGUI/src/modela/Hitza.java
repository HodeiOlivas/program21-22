/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modela;

/**
 *
 * @author olivas.hodei
 */
public class Hitza {

    private String hitza; // Arrayean sartu ditgun hitz guztiak

    private String kategoria;

    private char[] hutsuneLibreak; // hitzaren hizkiak

    private char[] letrak; // array bat non hitzaren letrak gordeko diren

    private char[] xLetrak; // array bat non, ez diren hizkiak gordeko diren

    private int kontagailuTxarrak; // zenbat errore doazen kontatzeko

    public void hitzBatAukeratu() {

        String[] hitzak = {"FERNANDO", "PACO", "MARRUBIA", "ESNEA", "IÑIGO", "WHISKYA", "TXORIZOA"}; // hitza desberdinak
        
        int temp = (int) (Math.random() * hitzak.length - 1); // Aukeratzen diren hitzak random aukeratzen dira.

        hitza = hitzak[temp];

        letrak = new char[hitza.length()]; // letrak arraya, random aukeratu den hitzaren tamaina izango du.

        for (int i = 0; i < hitza.length(); i++) {   // hitza bakoitza arrayaren toki batean gordetzeko

            letrak[i] = hitza.charAt(i);

        }

    }

    public void Hitza(String hitza) {

        this.hitza = hitza;

    }

    public String getHitza() {
        return hitza;
    }

    public Hitza() {

        kontagailuTxarrak = 0;          // kontagailuaren erroreak hasieran 0
        xLetrak = new char[10];    // erroreak 8 geheienez

        hitzBatAukeratu();          // hitzBatMetodoari deitu

        hutsuneLibreak = new char[hitza.length()];
        for (int i = 0; i < hutsuneLibreak.length; i++) {

            hutsuneLibreak[i] = '-';      // zenbatzeko zenbat letra dituen hitz bakoitza, hau da "-" kopurua jakitzeko.

        }

    }

    public char[] getAsmatutakoa() {
        return hutsuneLibreak;
    }

    public String getStrAsmatutakoa() {

        String strAsmatutakoa = new String(hutsuneLibreak);
        return strAsmatutakoa;   // asmatutakoaren hitza string bezala agertzeko, hau da char etik stringera pasatu.

    }
    
    public String getStrXLetrak() {

        String strXLetrak = new String(xLetrak);
        return strXLetrak;   // asmatutakoaren hitza string bezala agertzeko, hau da char etik stringera pasatu.

    }

    public boolean egiaztatu(char hizkia) {

        boolean egiaztatu = false;
        
        for (int i = 0; i < hitza.length(); i++) {
            if (hitza.charAt(i) == hizkia) {
                egiaztatu = true;
                break;
            }
        }

        return egiaztatu;
    }

    public void beteHutsuneLibreak(char hizkia) {

        for (int i = 0; i < hitza.length(); i++) {
            if (hitza.charAt(i) == hizkia) {
                hutsuneLibreak[i] = hizkia;
            }
        }
    }

    public void betexLetrak( char hizkia) {

        xLetrak[kontagailuTxarrak] = hizkia;  // hizkia hitzan ez badago, hizki hori xLetrak arryean gordeko da.
        kontagailuTxarrak++;      // kontagailua gero eta ha xLetrak[kontagailuTxarrak] = hizkia;  // hizkia hitzan ez badago, hizki hori xLetrak arryean gordeko da.ndiagoa egingo da 8 ra heldu arte.

    }
}


/* public boolean egiaztatu(char hizkia) {

        boolean aurkituta = false;

        for (int i = 0; i < hitza.length(); i++) {

            if (hizkia - 32 == asmatutakoa[i]) {

                asmatutakoa[i] = hizkia;
                aurkituta = true;
                break;

            } else {

                asmatutakoa[i] = '-';
                aurkituta = false;

            }

        }
        return aurkituta;
    } */
 /*  public void egiaztatu(char hizkia) { // hizkia hitzan dagoen esaten duen metodoa
        boolean egiaztatu = false;
        for (int i = 0; i < hitza.length(); i++) {

            if (hizkia == letrak[i]) {    // hizkia hitzan badago  asmatutako bere posizioan jarriko da hitza adibidez PACO hitzan P letra dagoenez P = P lehenego bueltan "-" P batengatik aldatuko da.

                hutsuneLibreak[i] = hizkia;

            } else {

                xLetrak[kontagailuTxarrak] = hizkia;  // hizkia hitzan ez badago, hizki hori xLetrak arryean gordeko da.
                kontagailuTxarrak++;      // kontagailua gero eta ha xLetrak[kontagailuTxarrak] = hizkia;  // hizkia hitzan ez badago, hizki hori xLetrak arryean gordeko da.ndiagoa egingo da 8 ra heldu arte.

            }
        }

 */
