package petshop.infra;

import javax.naming.NameParser;

import petshop.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import petshop.domain.*;
import petshop.domain.usecase.*;

@Service
public class PolicyHandler{
    @Autowired PetRepository petRepository;
    @Autowired PetPolicy petPolicy;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}


}


