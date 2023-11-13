package by.pvt.core.repository;


import by.pvt.core.domain.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comments, Long> {

}
