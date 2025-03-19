package com.toanyone.order.application.dto.message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDeliveryMessage {
    private Long orderId;
    private Long supplyStoreId;
    private Long receiveStoreId;
    private Long supplyHubId;
    private Long receiveId;
    private String recipient;
}
