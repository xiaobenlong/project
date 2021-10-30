package com.jincheng.blog.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogLikedCount {

    private Integer blogId;

    private int addLikedCount;
}
