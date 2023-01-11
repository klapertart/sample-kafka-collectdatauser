package klapertart.lab.collectdatauser.kafka;

import klapertart.lab.collectdatauser.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 * @author kurakuraninja
 * @since 12/01/23
 */

@Service
public class KafkaProducer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void sendMessage(User user){
        Message<User> message = MessageBuilder
                .withPayload(user)
                .setHeader(KafkaHeaders.TOPIC, "user-profile")
                .build();

        kafkaTemplate.send(message);
    }
}
