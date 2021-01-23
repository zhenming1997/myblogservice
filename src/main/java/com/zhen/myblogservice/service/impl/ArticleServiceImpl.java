package com.zhen.myblogservice.service.impl;

import com.zhen.myblogservice.entity.Article;
import com.zhen.myblogservice.mapper.ArticleMapper;
import com.zhen.myblogservice.service.ArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhen
 * @since 2021-01-23
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

}
