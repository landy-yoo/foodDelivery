package fooddelivery.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;

@Entity
@Table(name="OrderStatus_table")
@Data
public class OrderStatus {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private String customerId;
        private String customerName;
        private String storeId;
        private String storeName;
        private String menuId;
        private String menuName;
        private String menuPrice;
        private Date orderDt;
        private Date cancelOrderDt;
        private Date payDt;
        private Date cancelPayDt;
        private Date acceptOrderDt;
        private Date rejectOrderDt;
        private Date startCookDt;
        private Date finishCookDt;
        private String vanAccpteNo;
        private String vanCancelNo;
        private Date riderPickDt;
        private Date finishDeliveryDt;


}