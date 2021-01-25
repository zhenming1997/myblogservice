package com.zhen.myblogservice.controller;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.zhen.myblogservice.entity.Article;
import com.zhen.myblogservice.mapper.ArticleMapper;
import com.zhen.myblogservice.service.ArticleService;
import com.zhen.myblogservice.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhen
 * @since 2021-01-23
 */
@RestController
@RequestMapping("/article")
@Slf4j
public class ArticleController {

    @Autowired
    ArticleService articleService;

    //查询所有文章
    @GetMapping("/selectAll")
    public Result selectAll() {
        List<Article> list = articleService.list();
        return Result.succ(list);
    }

    //根据ID查询单篇文章
    @GetMapping("/selectById/{id}")
    public Result selectById(@PathVariable("id") Long id) {
        Article article = articleService.getById(id);
        return Result.succ(article);
    }

    //新增&修改
    @PostMapping("/save")
    public Result updateById(@RequestBody Article article) {
        boolean status;
        if (article.getUserId() == null || article.getArticleContent().equals("") || article.getArticleTitle().equals("")) {
            return Result.fail("信息不完善~~~~~~");
        }
        if (article.getArticleId() == null) {
            //新增
            boolean save = articleService.save(article);
            System.out.println("新闻新增:" + article);
            status = save;
        } else {
            //先要查询出来才能确定启动乐观锁修改
            Article byId = articleService.getById(article.getArticleId());
            if (byId == null) {
                return Result.fail("没有此文章~~~~~~");
            }
            if (byId.getUserId().intValue() != article.getUserId().intValue()) {
                System.out.println(byId.getUserId() + ":" + article.getUserId());
                return Result.fail("文章与作者不匹配~~~~~~");
            }
            byId.setArticleTitle(article.getArticleTitle());
            byId.setArticleContent(article.getArticleContent());
            boolean save = articleService.updateById(byId);
            System.out.println("新闻更新:" + byId);
            status = save;
        }
        return Result.succ(status);
    }

    //删除（逻辑删除）&批量
    @PostMapping("/deleteds")
    public Result deleted(@RequestBody JSONObject jsonObject) {
        log.info(jsonObject.toJSONString());
        String articleIds = (String) jsonObject.get("articleIds");
        String[] split = articleIds.split(",");
        List a = new ArrayList<>();
        for (String s : split) {
            a.add(s);
        }
        Collection<? extends Serializable> idList = a;
        boolean b = articleService.removeByIds(idList);
        if (b != true) {
            return Result.succ("批量删除失败");
        }
        return Result.succ("删除成功");
    }
}
