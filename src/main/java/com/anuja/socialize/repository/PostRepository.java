package com.anuja.socialize.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anuja.socialize.payload.PostDto;

import java.util.List;

public interface PostRepository extends JpaRepository<PostDto, Long> {

    List<PostDto> findByCategoryId(Long categoryId);

}
