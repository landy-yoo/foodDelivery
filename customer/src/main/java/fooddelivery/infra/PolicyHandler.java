package fooddelivery.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import fooddelivery.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import fooddelivery.domain.*;


@Service
@Transactional
public class PolicyHandler{
    @Autowired PayRepository payRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @Autowired
    fooddelivery.external.DeliveryStatusService deliveryStatusService;

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Menuchoosed'")
    public void wheneverMenuchoosed_MenuChoice(@Payload Menuchoosed menuchoosed){

        Menuchoosed event = menuchoosed;
        System.out.println("\n\n##### listener MenuChoice : " + menuchoosed + "\n\n");

        // REST Request Sample
        
        // deliveryStatusService.getDeliveryStatus(/** mapping value needed */);


        

        // Sample Logic //

        

    }

}


