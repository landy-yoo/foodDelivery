package fooddelivery.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;

@Entity
@Table(name="DeliveryStatus_table")
@Data
public class DeliveryStatus {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private String customerId;
        private String customerName;
        private String storeId;
        private String storeName;
        private String menuId;
        private String menuName;
        private String menuPirce;
        private Boolean startCookYn;
        private Boolean payCancelYn;
        private Boolean orderCancelYn;
        private Boolean deliveryYn;
        private Date orderDt;
        private Date payDt;
        private String payAcceptId;
        private Date startCookDt;
        private Date startDeliveryDt;
        private Date orderCancelDt;
        private Date orderToStoreDt;
        private Date acceptOrderDt;
        private Date cancelStoreDt;
        private String payVanNo;


}