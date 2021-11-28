package lpnu.entity;

import lpnu.entity.enumeration.OrderPayment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
    private Long id;
    private LocalDate orderDate;
    private Double orderPrice;
    private String orderAddress;
    private OrderPayment orderPayment;
    private List<User> orderUser = new ArrayList<>();
    private List<CareProduct> orderCareProducts = new ArrayList<>();

    public Order(){

    }
    public Order(final Long id, final LocalDate orderDate, final Double orderPrice, final String orderAddress,final OrderPayment orderPayment, final List<User> orderUser, final List<CareProduct> orderCareProducts){
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

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Order order = (Order) o;
        return Objects.equals(id, order.id) && Objects.equals(orderDate, order.orderDate) && Objects.equals(orderPrice, order.orderPrice) && Objects.equals(orderAddress, order.orderAddress) && orderPayment == order.orderPayment && Objects.equals(orderUser, order.orderUser) && Objects.equals(orderCareProducts, order.orderCareProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderDate, orderPrice, orderAddress, orderPayment, orderUser, orderCareProducts);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                ", orderPrice=" + orderPrice +
                ", orderAddress='" + orderAddress + '\'' +
                ", orderPayment=" + orderPayment +
                ", orderUsers=" + orderUser +
                ", orderCareProducts=" + orderCareProducts +
                '}';
    }
}
