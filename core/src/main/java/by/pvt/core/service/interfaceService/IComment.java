package by.pvt.core.service.interfaceService;

import by.pvt.api.dto.shopDTO.CommentRequest;
import by.pvt.api.dto.shopDTO.CommentResponse;

import java.util.List;

public interface IComment {
    void addcomment(CommentRequest comm);

    List<CommentResponse> getAllComment();

    CommentResponse findById(Long commID);

    void delComment(long id);

    void editComment(CommentRequest req);
}
