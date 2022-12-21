package com.hzh.liteflowt.excutor;

import com.yomahub.liteflow.thread.ExecutorBuilder;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @NAME: CustomThreadBuilder
 * @USER: DaHuangGO
 * @DATE: 2022/12/22
 * @TIME: 0:43
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 22
 */
public class CustomThreadBuilder implements ExecutorBuilder {
    @Override
    public ExecutorService buildExecutor() {
        return Executors.newCachedThreadPool();
    }

    @Override
    public ExecutorService buildDefaultExecutor(int corePoolSize, int maximumPoolSize, int queueCapacity, String threadName) {
        return null;
    }
}
