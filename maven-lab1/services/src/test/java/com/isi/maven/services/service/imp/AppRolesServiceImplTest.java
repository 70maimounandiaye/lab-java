package com.isi.maven.services.service.imp;

import com.isi.maven.services.mapping.AppRolesMapper;
import com.isi.maven.services.repository.IAppRolesRepository;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.context.MessageSource;

class AppRolesServiceImplTest {

    @Mock
    private MessageSource messageSource;
    @Mock
    private AppRolesMapper appRolesMapper;
    @InjectMocks
    private AppRolesServiceImpl appRolesServiceImpl;
    @Mock
    private IAppRolesRepository appRolesRepository;

}