package com.entrip.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WebController {

    @RequestMapping("/chat")
    public fun main() : String {
        return "index"
    }
}