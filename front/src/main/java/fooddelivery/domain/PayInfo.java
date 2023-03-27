package fooddelivery.domain;

import fooddelivery.FrontApplication;
import fooddelivery.domain.Paid;
import fooddelivery.domain.PayCanceled;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "PayInfo_table")
@Data
public class PayInfo {

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

    private String accountNo;

    @PostPersist
    public void onPostPersist() {
        Paid paid = new Paid(this);
        paid.publishAfterCommit();

        PayCanceled payCanceled = new PayCanceled(this);
        payCanceled.publishAfterCommit();
    }

    public static PayInfoRepository repository() {
        PayInfoRepository payInfoRepository = FrontApplication.applicationContext.getBean(
            PayInfoRepository.class
        );
        return payInfoRepository;
    }

    public static void pay(OrderCancled orderCancled) {
        /** Example 1:  new item 
        PayInfo payInfo = new PayInfo();
        repository().save(payInfo);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCancled.get???()).ifPresent(payInfo->{
            
            payInfo // do something
            repository().save(payInfo);


         });
        */

    }

    public static void pay(OrderChoosed orderChoosed) {
        /** Example 1:  new item 
        PayInfo payInfo = new PayInfo();
        repository().save(payInfo);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderChoosed.get???()).ifPresent(payInfo->{
            
            payInfo // do something
            repository().save(payInfo);


         });
        */

    }
}
