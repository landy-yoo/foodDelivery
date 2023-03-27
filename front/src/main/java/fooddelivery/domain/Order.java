package fooddelivery.domain;

import fooddelivery.FrontApplication;
import fooddelivery.domain.OrderCancled;
import fooddelivery.domain.OrderChoosed;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Order_table")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String menuId;

    private String menuName;

    private String menuPrice;

    private String customerId;

    private String customerName;

    private String customerAddress;

    private String customerPhoneNumber;

    private Date orderDate;

    private Integer qty;

    private String status;

    @PostPersist
    public void onPostPersist() {
        OrderChoosed orderChoosed = new OrderChoosed(this);
        orderChoosed.publishAfterCommit();

        OrderCancled orderCancled = new OrderCancled(this);
        orderCancled.publishAfterCommit();
    }

    public static OrderRepository repository() {
        OrderRepository orderRepository = FrontApplication.applicationContext.getBean(
            OrderRepository.class
        );
        return orderRepository;
    }
}
