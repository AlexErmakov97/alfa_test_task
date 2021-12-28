package com.alfa.gif_service.client;

import com.alfa.gif_service.config.RandomGiphyConfig;
import com.alfa.gif_service.model.GifData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "gifRandomClient", url = "${gif.random.url}")
public interface RandomGiphyClient {

    @GetMapping(value = "/random")
    GifData getRandomGifDataByTag(@RequestParam(name = "api_key") String appKey,
                                  @RequestParam String tag);
}
