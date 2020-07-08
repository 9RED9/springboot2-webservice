package com.sharemind.book.springboot.service.posts;

import com.sharemind.book.springboot.domain.posts.PostsRepository;
import com.sharemind.book.springboot.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
