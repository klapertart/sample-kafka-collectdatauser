package klapertart.lab.collectdatauser;

import com.github.javafaker.Faker;
import klapertart.lab.collectdatauser.data.User;
import klapertart.lab.collectdatauser.kafka.KafkaProducer;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

/**
 * @author kurakuraninja
 * @since 12/01/23
 */

@SpringBootTest
@Slf4j
public class KafkaProducerTest {

    @Autowired
    private KafkaProducer producer;

    @Test
    void testPublish() {
        Faker faker = new Faker();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            User user = User.builder()
                    .name(faker.name().firstName())
                    .address(faker.address().cityName())
                    .phone(faker.phoneNumber().cellPhone())
                    .age(random.nextInt(100)+1)
                    .build();

            producer.sendMessage(user);
            log.info("PUBLISH User Data >> {}",user.toString());
        }
    }
}
