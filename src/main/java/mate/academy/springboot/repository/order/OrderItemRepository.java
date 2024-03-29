package mate.academy.springboot.repository.order;

import java.util.List;
import java.util.Optional;
import mate.academy.springboot.model.Order;
import mate.academy.springboot.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    List<OrderItem> findAllByOrder(Order order);

    Optional<OrderItem> findByIdAndOrderId(@Param("itemId") Long itemId,
                                            @Param("orderId") Long orderId);
}
