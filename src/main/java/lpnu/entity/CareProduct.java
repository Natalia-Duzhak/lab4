package lpnu.entity;

import lpnu.entity.enumeration.CareProductApplicationTime;
import lpnu.entity.enumeration.CareProductSex;

import java.util.Objects;

public class CareProduct {
    private Long id;
    private String name;
    private Integer volume;
    private Double price;
    private CareProductApplicationTime applicationTime;
    private CareProductSex sex;

    public CareProduct() {

    }

    public CareProduct(final Long id, final String name, final Integer volume, final Double price, final CareProductApplicationTime applicationTime, final CareProductSex sex) {
        this.id = id;
        this.name = name;
        this.volume = volume;
        this.price = price;
        this.applicationTime = applicationTime;
        this.sex = sex;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(final Integer volume) {
        this.volume = volume;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(final Double price) {
        this.price = price;
    }

    public CareProductApplicationTime getApplicationTime() {
        return applicationTime;
    }

    public void setApplicationTime(final CareProductApplicationTime applicationTime) {
        this.applicationTime = applicationTime;
    }

    public CareProductSex getSex() {
        return sex;
    }

    public void setSex(final CareProductSex sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final CareProduct that = (CareProduct) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(volume, that.volume) && Objects.equals(price, that.price) && applicationTime == that.applicationTime && sex == that.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, volume, price, applicationTime, sex);
    }

    @Override
    public String toString() {
        return "CareProduct{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                ", price=" + price +
                ", applicationTime=" + applicationTime +
                ", sex=" + sex +
                '}';
    }
}
