package com.isi.maven.services.repository;

import com.isi.maven.services.model.AppUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IAppUserRepository extends JpaRepository<AppUserEntity, Integer> {
    AppUserEntity findByEmail(String email);
}
