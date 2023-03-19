package fooddelivery.domain;

import fooddelivery.domain.OrderedToStroe;
import fooddelivery.domain.AcceptOrdered;
import fooddelivery.domain.CancelOrdered;
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


        fooddelivery.external.Store store = new fooddelivery.external.Store();
        // mappings goes here
        StoreApplication.applicationContext.getBean(fooddelivery.external.StoreService.class)
            .cancelOrder(store);


        OrderedToStroe orderedToStroe = new OrderedToStroe(this);
        orderedToStroe.publishAfterCommit();



        AcceptOrdered acceptOrdered = new AcceptOrdered(this);
        acceptOrdered.publishAfterCommit();



        CancelOrdered cancelOrdered = new CancelOrdered(this);
        cancelOrdered.publishAfterCommit();

    }

    public static StoreRepository repository(){
        StoreRepository storeRepository = StoreApplication.applicationContext.getBean(StoreRepository.class);
        return storeRepository;
    }






}
