package fooddelivery.domain;

import fooddelivery.domain.StoreChoosed;
import fooddelivery.FrontApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="StoreChoice_table")
@Data

public class StoreChoice  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String storeId;
    
    
    
    
    
    private String storeName;

    @PostPersist
    public void onPostPersist(){


        StoreChoosed storeChoosed = new StoreChoosed(this);
        storeChoosed.publishAfterCommit();

    }

    public static StoreChoiceRepository repository(){
        StoreChoiceRepository storeChoiceRepository = FrontApplication.applicationContext.getBean(StoreChoiceRepository.class);
        return storeChoiceRepository;
    }






}
