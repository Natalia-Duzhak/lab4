package lpnu.dto;

import lpnu.entity.enumeration.CareProductApplicationTime;
import lpnu.entity.enumeration.CareProductSex;

public class CareProductDTO {
    private Long id;
    private String name;
    private Integer volume;
    private Double price;
    private CareProductApplicationTime applicationTime;
    private CareProductSex sex;


        public CareProductDTO() {

        }

        public CareProductDTO(final Long id, final String name, final Integer volume, final Double price, final CareProductApplicationTime applicationTime, final CareProductSex sex) {
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


}
