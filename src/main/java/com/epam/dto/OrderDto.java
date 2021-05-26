package com.epam.dto;

import java.util.UUID;

public class OrderDto {
    private UUID basketUUID;
    private int vendorCode;

    public UUID getBasketUUID() {
        return basketUUID;
    }

    public void setBasketUUID(UUID basketUUID) {
        this.basketUUID = basketUUID;
    }

    public int getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(int vendorCode) {
        this.vendorCode = vendorCode;
    }
}
