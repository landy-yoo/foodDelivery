package fooddelivery.domain;

import fooddelivery.domain.Deliveried;
import fooddelivery.RiderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Delivery_table")
@Data

public class Delivery  {

    
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
    
    
    
    
    
    private Date payVanNo;
    
    
    
    
    
    private String riderInfo;
    
    
    
    
    
    private Date pickDt;
    
    
    
    
    
    private Date finishCookDt;
    
    
    
    
    
    private Date finishDeliveryDt;

    @PostPersist
    public void onPostPersist(){


        Deliveried deliveried = new Deliveried(this);
        deliveried.publishAfterCommit();

    }

    public static DeliveryRepository repository(){
        DeliveryRepository deliveryRepository = RiderApplication.applicationContext.getBean(DeliveryRepository.class);
        return deliveryRepository;
    }






}
