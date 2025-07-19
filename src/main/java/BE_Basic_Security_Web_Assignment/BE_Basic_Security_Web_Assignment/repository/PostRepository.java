package BE_Basic_Security_Web_Assignment.BE_Basic_Security_Web_Assignment.repository;

import BE_Basic_Security_Web_Assignment.BE_Basic_Security_Web_Assignment.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
