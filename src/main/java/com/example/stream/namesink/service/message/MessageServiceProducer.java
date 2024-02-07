/*
 * Copyright Notice
 *
 *  © Eutelsat and its subsidiaries and affiliates, 2020.
 *  All Rights Reserved.
 *  Any redistribution or reproduction of part or all of this file in any form is
 *  strictly prohibited.
 *  Proprietary and confidential.
 */

package com.example.stream.namesink.service.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Service
//@Slf4j
public class MessageServiceProducer {

    private final StreamBridge streamBridge;
    @Autowired
    public MessageServiceProducer(StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }

    public void sendMessage(String topic, Object message) {
        streamBridge.send(topic, message);
    }


}
