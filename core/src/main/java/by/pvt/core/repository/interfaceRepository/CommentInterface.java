package by.pvt.core.repository.interfaceRepository;


import by.pvt.api.dto.shopDTO.CommentResponse;
import by.pvt.core.domain.Comments;

import java.util.List;

public interface CommentInterface {

    void addcomment(Comments comm);

    List<CommentResponse> getAllComment();

    CommentResponse findById(Long commID);

    void updateComment(Comments comments);

    void delComment(long id);
}
