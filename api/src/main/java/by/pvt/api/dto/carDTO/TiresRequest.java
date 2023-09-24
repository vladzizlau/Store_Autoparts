package by.pvt.api.dto.carDTO;


import lombok.Data;

@Data
public class TiresRequest {
    long id;
    String manufacturer;
    String name;
    double profile_width;
    double profile_height;
    int diametr;
    String season;
    double price;


}
