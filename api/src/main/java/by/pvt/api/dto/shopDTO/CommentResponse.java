package by.pvt.api.dto.shopDTO;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
@Data
@Builder
public class CommentResponse {
    private Long id;
    private String text;
    private LocalDate dateComment;
}
