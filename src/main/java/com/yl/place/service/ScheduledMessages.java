package com.yl.place.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledMessages {

    @Autowired
    private DiscordService discordService;

    private static final String CHANNEL_ID = "你的频道ID";

    // 每天上午9点发送消息
    @Scheduled(cron = "0 0 9 * * ?")
    public void sendDailyMessage() {
        discordService.sendMessage(CHANNEL_ID, "早安！这是今天的自动消息。");
    }
}
