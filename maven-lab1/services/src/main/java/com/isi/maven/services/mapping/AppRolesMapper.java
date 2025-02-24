package com.isi.maven.services.mapping;

import com.isi.maven.services.dto.AppRoles;
import com.isi.maven.services.model.AppRolesEntity;
import org.mapstruct.Mapper;


@Mapper
public interface AppRolesMapper {
    AppRoles toAppRoles(AppRolesEntity appRolesEntity);
    AppRolesEntity fromAppRoles(AppRoles appRoles);
}
