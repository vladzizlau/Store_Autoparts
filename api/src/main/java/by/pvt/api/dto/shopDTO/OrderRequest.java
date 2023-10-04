package by.pvt.api.dto.shopDTO;


import lombok.Data;

@Data

public class OrderRequest {
    private long id;
    private long productId;
    private long userId;
    private double cost;
    private int count;


}
