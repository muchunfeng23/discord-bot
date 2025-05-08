package com.yl.place.service;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscordService {

    @Autowired
    private JDA jda;

    /**
     * 发送消息到指定频道
     * @param channelId 频道ID
     * @param message 消息内容
     */
    public void sendMessage(String channelId, String message) {
        TextChannel channel = jda.getTextChannelById(channelId);
        if (channel != null) {
            channel.sendMessage(message).queue();
        } else {
            throw new RuntimeException("找不到指定的频道: " + channelId);
        }
    }
}
