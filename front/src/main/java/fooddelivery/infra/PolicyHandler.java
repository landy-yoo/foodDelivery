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
    @Autowired MenuChoiceRepository menuChoiceRepository;
    @Autowired StoreChoiceRepository storeChoiceRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='StoreChoosed'")
    public void wheneverStoreChoosed_StoreChoice(@Payload StoreChoosed storeChoosed){

        StoreChoosed event = storeChoosed;
        System.out.println("\n\n##### listener StoreChoice : " + storeChoosed + "\n\n");


        

        // Sample Logic //

        

    }

}


