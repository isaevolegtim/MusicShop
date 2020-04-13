package kz.home.oi.model;

import java.math.BigDecimal;

public abstract class Instrument {
    private BigDecimal price;
    private String firm;
    private String material;

    public abstract void play();

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getMFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "price=" + price +
                ", firm='" + firm + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}

