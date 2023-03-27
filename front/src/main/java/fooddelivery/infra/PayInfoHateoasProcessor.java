package fooddelivery.infra;

import fooddelivery.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class PayInfoHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<PayInfo>> {

    @Override
    public EntityModel<PayInfo> process(EntityModel<PayInfo> model) {
        return model;
    }
}
