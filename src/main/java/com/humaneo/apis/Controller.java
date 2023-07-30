package com.humaneo.apis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@RestController
public class Controller {
    Logger log = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/md5-hash")
    String md5hash(@RequestParam(name = "name") String name) throws NoSuchAlgorithmException {
        log.info("Generating hash of name {}", name);
        BigInteger number = new BigInteger(1, MessageDigest.getInstance("MD5").digest(name.getBytes()));
        return number.toString();
    }
}
