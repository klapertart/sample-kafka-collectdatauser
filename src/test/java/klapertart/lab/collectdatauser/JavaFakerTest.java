package klapertart.lab.collectdatauser;

import com.github.javafaker.Faker;
import klapertart.lab.collectdatauser.data.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.jws.soap.SOAPBinding;
import java.util.Random;

/**
 * @author kurakuraninja
 * @since 12/01/23
 */

@SpringBootTest
@Slf4j
public class JavaFakerTest {

    @Test
    void testRandomData() {
        Faker faker = new Faker();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            User user = User.builder()
                    .name(faker.name().firstName())
                    .address(faker.address().cityName())
                    .phone(faker.phoneNumber().cellPhone())
                    .age(random.nextInt(100)+1)
                    .build();
            log.info("Profile >> {}",user.toString());
        }
    }
}
