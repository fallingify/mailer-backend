package com.g25.mailer.gptAi.gpt;

import com.g25.mailer.gptAi.dto.GptResponse;
import com.g25.mailer.config.GptFeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Map;

@FeignClient(
        name = "gptClient",
        url = "${gpt.url}",
        configuration = GptFeignConfig.class
)
public interface GptClient {

    @PostMapping(value = "/v1/chat/completions", consumes = "application/json")
    GptResponse sendMessage(@RequestBody Map<String, Object> request,
                            @RequestHeader("Authorization") String authorization);


}
