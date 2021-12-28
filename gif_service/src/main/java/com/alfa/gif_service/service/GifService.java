package com.alfa.gif_service.service;

import com.alfa.gif_service.client.GiphyClient;
import com.alfa.gif_service.client.RandomGiphyClient;
import com.alfa.gif_service.model.GifData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GifService {

    @Value(value = "${api.key}")
    private String appKey;

    @Autowired
    GiphyClient giphyClient;

    @Autowired
    RandomGiphyClient randomGiphyClient;

    public byte[] getBrokeGif() {
        return giphyClient.getBrokeGif(getRandomGifId("broke"));
    }

    public byte[] getRichGif() {
        return giphyClient.getRichGif(getRandomGifId("rich"));
    }

    private String getRandomGifId(String tag) {
        GifData gifData = randomGiphyClient.getRandomGifDataByTag(this.appKey, tag);
        return gifData.getData().getId();
    }
}
