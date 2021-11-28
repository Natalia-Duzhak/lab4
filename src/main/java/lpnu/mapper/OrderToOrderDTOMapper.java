package lpnu.mapper;


import lpnu.dto.OrderDTO;
import lpnu.dto.UserDTO;
import lpnu.entity.Order;
import org.springframework.stereotype.Component;


@Component
public class OrderToOrderDTOMapper {


        public Order toEntity(final OrderDTO orderDTO){
            final Order order = new Order();

            order.setId(orderDTO.getId());
            order.setOrderDate(orderDTO.getOrderDate());
            order.setOrderPrice(orderDTO.getOrderPrice());
            order.setOrderAddress(orderDTO.getOrderAddress());
            order.setOrderPayment(orderDTO.getOrderPayment());
            order.setOrderUser(orderDTO.getOrderUser());
            order.setOrderCareProducts(orderDTO.getOrderCareProducts());




            return order;
        }
        public OrderDTO toDTO(final Order order){
            final OrderDTO orderDTO = new OrderDTO();

            orderDTO.setId(order.getId());
            orderDTO.setOrderDate(order.getOrderDate());
            orderDTO.setOrderPrice(order.getOrderPrice());
            orderDTO.setOrderAddress(order.getOrderAddress());
            orderDTO.setOrderPayment(order.getOrderPayment());
            orderDTO.setOrderUser(order.getOrderUser());
            orderDTO.setOrderCareProducts(order.getOrderCareProducts());




            return orderDTO;
        }


}
