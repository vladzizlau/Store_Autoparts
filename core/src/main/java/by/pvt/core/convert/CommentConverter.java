package by.pvt.core.convert;

import by.pvt.api.dto.shopDTO.CommentRequest;
import by.pvt.api.dto.shopDTO.CommentResponse;
import by.pvt.core.domain.Comments;

public class CommentConverter {
    public Comments toEntity(CommentRequest req)
    {
        Comments comm = Comments.builder()
                .id(req.getId())
                .text(req.getText())
                .dateComment(req.getDateComment())
                .build();
        return comm;
    }

    public CommentResponse toDTO(Comments comm)
    {
        CommentResponse cr = CommentResponse.builder()
                .id(comm.getId())
                .text(comm.getText())
                .dateComment(comm.getDateComment())
                .build();
        return  cr;
    }
}
