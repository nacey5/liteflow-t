package com.hzh.liteflowt.flowNode.pra_submit_cmp;

import com.yomahub.liteflow.annotation.LiteflowComponent;
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
@LiteflowComponent("submit_a")
public class SubmitACmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        System.out.println("ACmp executed!");
        DefaultContext context = this.getContextBean(DefaultContext.class);
        context.setData("testSet", new HashSet<>());

        for (int i = 0; i < 5; i++) {
            this.sendPrivateDeliveryData("asp_b",i+1);
        }
    }
}
