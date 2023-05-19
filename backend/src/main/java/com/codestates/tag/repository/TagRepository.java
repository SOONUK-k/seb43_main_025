package com.codestates.tag.repository;

import com.codestates.tag.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TagRepository extends JpaRepository<Tag, Long > {
    Optional<Tag> findByName(String name);
    List<Tag> findAllByNameContaining(String query);
}
