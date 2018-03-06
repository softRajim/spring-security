package com.springsecuirty.springsecurity.controller;

import com.springsecuirty.springsecurity.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rajim on 3/5/18
 */
@RestController
@PreAuthorize("hasAuthority('ROLE_DOMAIN_USER')")
public class SampleController {

    private final SampleService sampleService;

    @Autowired
    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    
}
