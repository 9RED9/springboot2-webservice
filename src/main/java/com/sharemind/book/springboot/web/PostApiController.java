package com.sharemind.book.springboot.web;

import lombok.RequiredArgsConstructor;

import com.sharemind.book.springboot.web.dto.PostsResponseDto;
import com.sharemind.book.springboot.web.dto.PostsUpdateRequestDto;
import com.sharemind.book.springboot.service.posts.PostsService;
import com.sharemind.book.springboot.web.dto.PostsSaveRequestDto;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requesDto) {

        return postsService.update(id, requesDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {

        return postsService.findById(id);
    }
}
