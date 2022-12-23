package com.hzh.liteflowt.flowNode.pra_submit_cmp;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.annotation.LiteflowRetry;
import com.yomahub.liteflow.core.NodeComponent;
import com.yomahub.liteflow.slot.DefaultContext;

import java.util.HashSet;

/**
 * @NAME: SubmitACmp
 * @USER: DaHuangGO
 * @DATE: 2022/12/22
 * @TIME: 15:39
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 22
 */
@LiteflowComponent("asp_b")
//重试次数以及捕捉的异常
@LiteflowRetry(retry = 5,forExceptions = {NullPointerException.class,IllegalAccessException.class})
public class AspectBCmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        System.out.println("BCmp executed!");
        Integer value = this.getPrivateDeliveryData();
        //do your biz
        System.out.println(value);
    }
}
