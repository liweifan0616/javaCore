package com.lwf.javaCore.designpattern.strategy;

/**
 * @author <a href="mailto:liweifan@yxt.com">liweifan</a>
 * @date 2021-06-03 20:07
 * @since 1.0.0
 */
public class Test {
    
    public static void main(String[] args) {
        String promotionKey = "LIJIAN";
        PromotionStrategy promotionStrategy = PromotionStrategyFactory.getPromotionStrategy(promotionKey);
        promotionStrategy.operator();
    }
}