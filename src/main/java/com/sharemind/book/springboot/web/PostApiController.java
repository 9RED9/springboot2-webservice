package com.sharemind.book.springboot.web;

import lombok.RequiredArgsConstructor;
import com.sharemind.book.springboot.service.posts.PostsService;
import com.sharemind.book.springboot.web.dto.PostsSaveRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }
}
