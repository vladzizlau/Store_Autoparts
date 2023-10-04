package by.pvt.api.dto.shopDTO;

import lombok.Data;

import java.time.LocalDate;
@Data
public class CommentRequest {
    private Long id;
    private String text;
    private LocalDate dateComment;
}
