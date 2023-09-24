package by.pvt.api.dto.carDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TiresResponse {
    long id;
    String manufacturer;
    String name;
    double profile_width;
    double profile_height;
    int diametr;
    String season;
    double price;

}
