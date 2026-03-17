package object_model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder

public class Contact_model
{
    String name;
    String last_name;
    String phone;
    String email;
    String address;
    String description;

}