package com.hzh.liteflowt.flowNode.after_cmp;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

/**
 * @NAME: AfterF1Cmp
 * @USER: DaHuangGO
 * @DATE: 2022/12/22
 * @TIME: 13:47
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 22
 */

@LiteflowComponent("f1")
public class AfterF1Cmp extends NodeComponent {

    @Override
    public void process() throws Exception {
        System.out.println("after:f1:exec");
    }
}
