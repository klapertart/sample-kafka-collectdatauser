package klapertart.lab.collectdatauser.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kurakuraninja
 * @since 12/01/23
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private String phone;
    private String address;
    private int age;
}
