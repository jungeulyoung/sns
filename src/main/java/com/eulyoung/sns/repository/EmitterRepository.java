package com.eulyoung.sns.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;


// DB 와 REDIS 를 사용 하지 않는다. local cache 를 사용
@Slf4j
@Repository
public class EmitterRepository {
private Map<String, SseEmitter> emitterMap = new HashMap<>();

    public SseEmitter save(Integer userId, SseEmitter sseEmitter) {
        final String key = getKey(userId);
        emitterMap.put(key, sseEmitter);
        log.info("Set sseEmitter {} ", userId);
        return sseEmitter;
    }

    public Optional <SseEmitter> get(Integer userId) {
        final String key = getKey(userId);
        log.info("Get sseEmitter {} ", userId);
        return Optional.ofNullable(emitterMap.get(key));
    }

    public void delete(Integer userId) {
        emitterMap.remove(getKey(userId));
    }


    private  String getKey(Integer userId) {
        return "Emitter:UID:" + userId;
    }

}
