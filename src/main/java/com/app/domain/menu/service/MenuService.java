package com.app.domain.menu.service;

import com.app.domain.menu.entity.Menu;
import com.app.domain.menu.repository.MenuJpaRepository;
import com.app.domain.menu.repository.MenuRepository;
import com.app.global.error.ErrorCode;
import com.app.global.error.exception.BusinessException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MenuService {

    private final MenuJpaRepository menuJpaRepository;

    public List<Menu> searchAllMenu(){
        List<Menu> menuList = menuJpaRepository.findAll();
        if (menuList.isEmpty()){
            throw new BusinessException(ErrorCode.NOT_EXIST_MENU);
        }
        return menuList;
    }

}
