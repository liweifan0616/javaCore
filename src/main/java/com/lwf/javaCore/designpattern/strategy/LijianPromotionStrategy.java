package com.lwf.javaCore.designpattern.strategy;

/**
 * @author <a href="mailto:liweifan@yxt.com">liweifan</a>
 * @date 2021-06-03 20:06
 * @since 1.0.0
 */
public class LijianPromotionStrategy implements PromotionStrategy {
    @Override
    public void operator() {
        System.out.println("立减活动");
    }
}