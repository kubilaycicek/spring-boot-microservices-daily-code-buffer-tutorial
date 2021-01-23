package com.dailycodebuffer.user.service;

import com.dailycodebuffer.user.VO.ResponseTemplateVO;
import com.dailycodebuffer.user.entity.User;

import java.util.Optional;

public interface UserService {
    User save(User user);
    Optional<User> findUserById(Long userId);

    ResponseTemplateVO getUserWithDepartment(Long userId);
}
