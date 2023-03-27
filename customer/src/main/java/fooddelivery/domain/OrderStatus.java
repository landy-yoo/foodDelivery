package fooddelivery.domain;

import fooddelivery.CustomerApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "OrderStatus_table")
@Data
public class OrderStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String menuId;

    private String menuPrice;

    private String customerId;

    private Date payDate;

    private String customerName;

    private String customerAddress;

    private String customerPhoneNumber;

    private String payVanNo;

    private String menuName;

    private Date pickDate;

    public static OrderStatusRepository repository() {
        OrderStatusRepository orderStatusRepository = CustomerApplication.applicationContext.getBean(
            OrderStatusRepository.class
        );
        return orderStatusRepository;
    }

    public static void status(DeliveryStatus deliveryStatus) {
        /** Example 1:  new item 
        OrderStatus orderStatus = new OrderStatus();
        repository().save(orderStatus);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryStatus.get???()).ifPresent(orderStatus->{
            
            orderStatus // do something
            repository().save(orderStatus);


         });
        */

    }
}
