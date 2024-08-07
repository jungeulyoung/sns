package com.eulyoung.sns.repository;

import com.eulyoung.sns.model.entity.AlarmEntity;
import com.eulyoung.sns.model.entity.LikeEntity;
import com.eulyoung.sns.model.entity.PostEntity;
import com.eulyoung.sns.model.entity.UserEntity;
import io.lettuce.core.dynamic.annotation.Param;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AlarmEntityRepository extends JpaRepository<AlarmEntity, Integer> {
    Page<AlarmEntity> findAllByUserId(Integer userId, Pageable pageable);
}
