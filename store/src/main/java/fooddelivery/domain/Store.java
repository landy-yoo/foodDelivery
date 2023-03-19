package fooddelivery.domain;

import fooddelivery.domain.OrderedToStroe;
import fooddelivery.domain.AcceptOrdered;
import fooddelivery.domain.RejectOrdered;
import fooddelivery.StoreApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Store_table")
@Data

public class Store  {

    
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
    
    
    
    
    
    private Boolean acceptYn;
    
    
    
    
    
    private Date cookStartDt;
    
    
    
    
    
    private String payVanNo;

    @PostPersist
    public void onPostPersist(){

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        fooddelivery.external.OrderStatus orderStatus = new fooddelivery.external.OrderStatus();
        // mappings goes here
        StoreApplication.applicationContext.getBean(fooddelivery.external.OrderStatusService.class)
            .rejectOrder(orderStatus);


        OrderedToStroe orderedToStroe = new OrderedToStroe(this);
        orderedToStroe.publishAfterCommit();



        AcceptOrdered acceptOrdered = new AcceptOrdered(this);
        acceptOrdered.publishAfterCommit();



        RejectOrdered rejectOrdered = new RejectOrdered(this);
        rejectOrdered.publishAfterCommit();

        // Get request from OrderStatus
        //fooddelivery.external.OrderStatus orderStatus =
        //    Application.applicationContext.getBean(fooddelivery.external.OrderStatusService.class)
        //    .getOrderStatus(/** mapping value needed */);

        // Get request from OrderStatus
        //fooddelivery.external.OrderStatus orderStatus =
        //    Application.applicationContext.getBean(fooddelivery.external.OrderStatusService.class)
        //    .getOrderStatus(/** mapping value needed */);

    }

    public static StoreRepository repository(){
        StoreRepository storeRepository = StoreApplication.applicationContext.getBean(StoreRepository.class);
        return storeRepository;
    }






}
