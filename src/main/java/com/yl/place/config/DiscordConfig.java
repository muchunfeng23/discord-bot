package com.yl.place.config;

import com.yl.place.listener.ReadyListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DiscordConfig {
    @Value("${discord.bot.token}")
    private String botToken;

    @Bean
    public JDA jda() throws Exception {
        JDABuilder builder = JDABuilder.createDefault(botToken)
                .setEnabledIntents(GatewayIntent.GUILD_MESSAGES, GatewayIntent.MESSAGE_CONTENT)
                .addEventListeners(new ReadyListener());
        return builder.build()
                .awaitReady();
    }
}
