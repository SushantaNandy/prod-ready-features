package com.nandy.prod_ready_features.prod_ready_features.services;

import com.nandy.prod_ready_features.prod_ready_features.dto.PostDTO;
import com.nandy.prod_ready_features.prod_ready_features.repositories.PostRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService{

    private final PostRepository postRepository;


    @Override
    public List<PostDTO> getAllPosts() {
        return List.of();
    }

    @Override
    public PostDTO createNewPost(PostDTO inputPost) {
        return null;
    }
}
