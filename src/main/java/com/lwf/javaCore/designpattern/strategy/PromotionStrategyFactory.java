package com.lwf.javaCore.designpattern.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:liweifan@yxt.com">liweifan</a>
 * @date 2021-06-03 20:08
 * @since 1.0.0
 */
public class PromotionStrategyFactory {

    private static Map<String, PromotionStrategy> promotionStrategyMap = new HashMap<>();

    static {
        promotionStrategyMap.put(PromotionKey.LIJIAN, new LijianPromotionStrategy());
        promotionStrategyMap.put(PromotionKey.MANJIAN, new ManjianPromotionStrategy());
    }

    public static PromotionStrategy getPromotionStrategy(String promotionKey) {
        return promotionStrategyMap.get(promotionKey);
    }

    private interface PromotionKey {
        String LIJIAN  = "LIJIAN";
        String MANJIAN = "MANJIAN";
    }

}