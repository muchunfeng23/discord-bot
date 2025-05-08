package com.yl.place.controller;

import com.yl.place.service.DiscordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscordController {

    @Autowired
    private DiscordService discordService;

    @PostMapping("/send-message")
    public String sendMessage(@RequestParam String channelId,
                              @RequestParam String message) {
        System.out.println("来了");
        discordService.sendMessage(channelId, message);
        return "消息已发送";
    }

    @GetMapping("/send-message")
    public String sendMessage2(@RequestParam String channelId,
                              @RequestParam String message) {
        System.out.println("来了");
        discordService.sendMessage(channelId, message);
        return "消息已发送";
    }
}
