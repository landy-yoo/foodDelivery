package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Deliveried extends AbstractEvent {

    private Long id;

    public Deliveried(Delivery aggregate){
        super(aggregate);
    }
    public Deliveried(){
        super();
    }
}
