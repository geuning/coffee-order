package com.app.domain.menu.repository;

import com.app.domain.menu.entity.Menu;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MenuRepositoryImpl {

    private final MenuJpaRepository menuJpaRepository;

}
