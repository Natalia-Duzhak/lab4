package lpnu.dto;
import lpnu.entity.CareProduct;
import lpnu.entity.User;
import lpnu.entity.enumeration.OrderPayment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderDTO {
    private Long id;
    private LocalDate orderDate;
    private Double orderPrice;
    private String orderAddress;
    private OrderPayment orderPayment;

    private List<User> orderUser = new ArrayList<>();
    private List<CareProduct> orderCareProducts = new ArrayList<>();


    public OrderDTO(){

    }
    public OrderDTO(final Long id, final LocalDate orderDate, final Double orderPrice, final String orderAddress, final OrderPayment orderPayment, final List<User> orderUser, final List<CareProduct> orderCareProducts){
        this.id = id;
        this.orderDate = orderDate;
        this.orderPrice = orderPrice;
        this.orderAddress = orderAddress;
        this.orderPayment = orderPayment;
        this.orderUser = orderUser;
        this.orderCareProducts = orderCareProducts;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(final LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(final Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(final String orderAddress) {
        this.orderAddress = orderAddress;
    }

    public OrderPayment getOrderPayment() {
        return orderPayment;
    }

    public void setOrderPayment(final OrderPayment orderPayment) {
        this.orderPayment = orderPayment;
    }

    public List<User> getOrderUser() {
        return orderUser;
    }

    public void setOrderUser(final List<User> orderUser) {
        this.orderUser = orderUser;
    }

    public List<CareProduct> getOrderCareProducts() {
        return orderCareProducts;
    }

    public void setOrderCareProducts(final List<CareProduct> orderCareProducts) {
        this.orderCareProducts = orderCareProducts;
    }
}
