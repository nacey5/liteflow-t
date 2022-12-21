package com.hzh.liteflowt.flowNode.exception_cmp;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

/**
 * @NAME: ExCCmp
 * @USER: DaHuangGO
 * @DATE: 2022/12/21
 * @TIME: 16:26
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 21
 */
@LiteflowComponent("ex_c")
public class ExCCmp extends NodeComponent {

    @Override
    public void process() throws Exception {
        throw new RuntimeException();
    }
}
