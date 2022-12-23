package com.hzh.liteflowt.flowNode.pre_cmp;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

/**
 * @NAME: PreP1Cmp
 * @USER: DaHuangGO
 * @DATE: 2022/12/22
 * @TIME: 13:35
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 22
 */

@LiteflowComponent("p1")
public class PreP1Cmp extends NodeComponent {

    @Override
    public void process() throws Exception {
        System.out.println("pre:p1:exec");
    }
}
