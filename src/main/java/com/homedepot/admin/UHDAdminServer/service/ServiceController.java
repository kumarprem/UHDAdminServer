package com.homedepot.admin.UHDAdminServer.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by svcUnbundled on 9/6/2017.
 */
@RestController
public class ServiceController {

    @RequestMapping("/appHealth")
    public ResponseEntity<?> getAppHealth(){

        String response = "UHD-Admin-Server Application is Up";
        return new ResponseEntity<String>(response, HttpStatus.OK);
    }
}
