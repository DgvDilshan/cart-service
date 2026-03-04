package com.swiftcart.cart_service.client;

public record InventoryResponse(
        Long productId,
        Integer availableQuantity,
        boolean isInStock
) {}