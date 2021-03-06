package com.xiao.user.api;

import com.xiao.common.vo.JsonView;
import com.xiao.user.dao.model.UserMock;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @desc: 功能描述：（用户服务）
 * @author： jianjun.xiao
 * @E-mail： xiaoxiao65535@163.com
 * @createTime： 2018/9/1 20:10
 */
public interface UserApi {

    @PostMapping("/user/register")
    JsonView register(@RequestBody UserMock userMock);

    @PostMapping("/user/login")
    JsonView login(@RequestParam(value = "username") String username,
                   @RequestParam(value = "password") String password);

    @GetMapping("/user/info")
    JsonView info(@RequestParam(value = "token") String token);

}
