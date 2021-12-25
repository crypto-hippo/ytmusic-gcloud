package com.ytmusic.ytmusic

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController {

    @GetMapping("/")
    fun index(): String {
        return "Winning with kotlin";
    }

    @GetMapping("**")
    fun catch_all(): String {
        return "catch all"
    }
}