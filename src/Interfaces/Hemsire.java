package Interfaces;

public class Hemsire implements HastanePersonel {

    private String isim;
    private String soyIsim;
    private String meslek;
    private String gorev;
    private int yas;
    private double maas;

    public Hemsire() {}

    public Hemsire( String isim, String soyIsim, String meslek, String gorev, int yas , double maas )
    {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.meslek = meslek;
        this.gorev = gorev;
        this.yas = yas;
        this.maas = maas;
    }

    @Override
    public String getIsim() {
        return "";
    }

    @Override
    public String getSoyIsim() {
        return "";
    }

    @Override
    public String getMeslek() {
        return "";
    }

    @Override
    public String getGorev() {
        return "";
    }

    @Override
    public int getYas() {
        return 0;
    }

    @Override
    public double getMaas() {
        return 0;
    }
}
