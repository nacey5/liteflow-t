package com.hzh.liteflowt.flowNode.context_cmp;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

/**
 * @NAME: AContextCmp
 * @USER: DaHuangGO
 * @DATE: 2022/12/22
 * @TIME: 0:46
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 22
 */
@LiteflowComponent("context_a")
public class AContextCmp extends NodeComponent {

    @Override
    public void process() throws Exception {
        Object requestData = this.getRequestData();
    }
}
