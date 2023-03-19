package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class StoreChoosed extends AbstractEvent {

    private Long id;

    public StoreChoosed(StoreChoice aggregate){
        super(aggregate);
    }
    public StoreChoosed(){
        super();
    }
}
