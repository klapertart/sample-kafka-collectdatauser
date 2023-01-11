package klapertart.lab.collectdatauser.kafka;

import klapertart.lab.collectdatauser.data.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author kurakuraninja
 * @since 12/01/23
 */

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "user-profile", groupId = "userdata")
    public void consume(User user){
        if (user.getAge() % 2 != 0){
            log.info("[ SUBSCRIBE ] User Profile >> {}", user.toString());
        }
    }
}
