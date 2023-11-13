package by.pvt.api.dto.shopDTO;


import lombok.Data;

@Data
public class OrderRequest {
    private Long id;
    private String status;
    private Double cost;
    private Long userid;
}
