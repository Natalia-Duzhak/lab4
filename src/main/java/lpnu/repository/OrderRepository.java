package lpnu.repository;

import lpnu.entity.Order;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Repository
public class OrderRepository {
        private List<Order> orders;

        private long id = 1;


        @PostConstruct
        public void init(){
            orders = new ArrayList<>();
        }

        public List<Order> getAllUsers() {
            return new ArrayList<>(orders);
        }

        public Order getOrderById(final long id) {
            return orders.stream()
                    .filter(e -> e.getId() == id)
                    .findFirst()
                    .orElse(null);
        }

        public Order saveOrder(final Order order) {
            order.setId(id);

            ++id;

            orders.add(order);
            return order;
        }

        public Order updateOrder(final Order order) {

            final Order savedOrder = getOrderById(order.getId());

            savedOrder.setOrderDate(order.getOrderDate());
            savedOrder.setOrderPrice(order.getOrderPrice());
            savedOrder.setOrderAddress(order.getOrderAddress());
            savedOrder.setOrderPayment(order.getOrderPayment());
            savedOrder.setOrderUser(order.getOrderUser());
            savedOrder.setOrderCareProducts(order.getOrderCareProducts());
            return savedOrder;
        }

        public void deleteOrderById(final long id) {
            orders = orders.stream()
                    .filter(e -> e.getId() != id)
                    .collect(Collectors.toList());
        }

}
