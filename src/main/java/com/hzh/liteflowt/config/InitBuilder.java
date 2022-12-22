package com.hzh.liteflowt.config;

import com.yomahub.liteflow.builder.LiteFlowNodeBuilder;
import com.yomahub.liteflow.builder.el.LiteFlowChainELBuilder;
import com.yomahub.liteflow.flow.FlowBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @NAME: InitBuilder
 * @USER: DaHuangGO
 * @DATE: 2022/12/22
 * @TIME: 12:17
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 22
 */
public class InitBuilder {

    @PostConstruct
    private void init(){
        /**
         * 手动构造一个node节点
         */
        LiteFlowNodeBuilder.createCommonNode().setId("builder_common_context_a")
                .setName("普通组件A")
                .setClazz("com.hzh.liteflowt.context.OrderContext")
                .build();

        LiteFlowChainELBuilder.createChain().setChainId("builder_test_chain_1")
                .setEL(
                        "THEN(a,b,WHEN(c,d))"
                );
    }


    @PreDestroy
    private void destroy(){
        //手动销毁
        FlowBus.removeChain("builder_test_chain_1");
    }
}
