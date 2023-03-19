package fooddelivery.domain;

import fooddelivery.domain.Menuchoosed;
import fooddelivery.FrontApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="MenuChoice_table")
@Data

public class MenuChoice  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String storeId;
    
    
    
    
    
    private String storeName;
    
    
    
    
    
    private String menuId;
    
    
    
    
    
    private String menuName;
    
    
    
    
    
    private String menuPrice;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private String customerName;
    
    
    
    
    
    private String customerAddress;
    
    
    
    
    
    private String customerPhoneNumber;
    
    
    
    
    
    private Date orderDate;

    @PostPersist
    public void onPostPersist(){


        Menuchoosed menuchoosed = new Menuchoosed(this);
        menuchoosed.publishAfterCommit();

    }

    public static MenuChoiceRepository repository(){
        MenuChoiceRepository menuChoiceRepository = FrontApplication.applicationContext.getBean(MenuChoiceRepository.class);
        return menuChoiceRepository;
    }






}
