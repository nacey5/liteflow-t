package com.hzh.liteflowt.flowNode;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

/**
 * @NAME: ACmp
 * @USER: DaHuangGO
 * @DATE: 2022/12/20
 * @TIME: 22:57
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 20
 */
@LiteflowComponent("z")
public class ZCmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        System.out.println("exec:Z");
    }
}
