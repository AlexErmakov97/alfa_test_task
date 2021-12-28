package com.alfa.gif_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "gifClient", url = "${gif.url}")
public interface GiphyClient {

    @GetMapping(value = "{gifId}/giphy.gif", produces = MediaType.IMAGE_GIF_VALUE)
    byte[] getBrokeGif(@PathVariable String gifId);

    @GetMapping(value = "{gifId}/giphy.gif", produces = MediaType.IMAGE_GIF_VALUE)
    byte[] getRichGif(@PathVariable String gifId);
}
