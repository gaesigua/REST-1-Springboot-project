package com.tin.REST_1_Springboot_project;

public record OrderRecord(
        String orderId,
        int customerId,
        String customerName,
        String customerAddress,
        String customerPhone
) {

}
