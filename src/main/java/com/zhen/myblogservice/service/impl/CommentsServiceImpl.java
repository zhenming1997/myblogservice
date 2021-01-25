package com.zhen.myblogservice.service.impl;

import com.zhen.myblogservice.entity.Comments;
import com.zhen.myblogservice.mapper.CommentsMapper;
import com.zhen.myblogservice.service.CommentsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhen
 * @since 2021-01-25
 */
@Service
public class CommentsServiceImpl extends ServiceImpl<CommentsMapper, Comments> implements CommentsService {

}
