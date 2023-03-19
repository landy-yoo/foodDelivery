package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Payed extends AbstractEvent {

    private Long id;

    public Payed(Pay aggregate){
        super(aggregate);
    }
    public Payed(){
        super();
    }
}
