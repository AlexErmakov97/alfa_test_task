package com.alfa.gif_service.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class GifData {
    private DataInto data;

    @Getter
    @Setter
    @JsonIgnoreProperties(ignoreUnknown = true)
    public class DataInto {
        private String id;
    }
}
