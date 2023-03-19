package fooddelivery.domain;

import fooddelivery.domain.Payed;
import fooddelivery.domain.OrderCanceled;
import fooddelivery.CustomerApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Pay_table")
@Data

public class Pay  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String storeId;
    
    
    
    
    
    private String menuId;
    
    
    
    
    
    private String menuPrice;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private Date payDate;
    
    
    
    
    
    private String customerName;
    
    
    
    
    
    private String customerAddress;
    
    
    
    
    
    private String customerPhoneNumber;
    
    
    
    
    
    private String payVanNo;

    @PostPersist
    public void onPostPersist(){


        Payed payed = new Payed(this);
        payed.publishAfterCommit();



        OrderCanceled orderCanceled = new OrderCanceled(this);
        orderCanceled.publishAfterCommit();

        // Get request from OrderStatus
        //fooddelivery.external.OrderStatus orderStatus =
        //    Application.applicationContext.getBean(fooddelivery.external.OrderStatusService.class)
        //    .getOrderStatus(/** mapping value needed */);

        // Get request from OrderStatus
        //fooddelivery.external.OrderStatus orderStatus =
        //    Application.applicationContext.getBean(fooddelivery.external.OrderStatusService.class)
        //    .getOrderStatus(/** mapping value needed */);

    }

    public static PayRepository repository(){
        PayRepository payRepository = CustomerApplication.applicationContext.getBean(PayRepository.class);
        return payRepository;
    }






}
