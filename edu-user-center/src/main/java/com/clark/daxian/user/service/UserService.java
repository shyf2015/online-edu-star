package com.clark.daxian.user.service;

import com.clark.daxian.entity.user_center.User;

/**
 * 用户业务接口
 * @author 大仙
 */
public interface UserService {

    /**
     * 添加用户
     * @param user
     * @return
     */
    Long insertUser(User user);

    /**
     * 通过ID获取用户
     * @param id
     * @return
     */
    User getById(Long id);

    /**
     * 通过电话
     * @param telephone
     * @return
     */
    User getByTel(String telephone);

    /**
     * 通过邮箱
     * @param email
     * @return
     */
    User getByEmail(String email);
}
