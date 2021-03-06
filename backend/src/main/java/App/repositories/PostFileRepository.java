package App.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import App.models.PostFile;

@Repository
public interface PostFileRepository extends JpaRepository<PostFile, Long> {

}