package com.hzh.liteflowt.flowNode.if_cmp;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeIfComponent;

/**
 * @NAME: AIfCmp
 * @USER: DaHuangGO
 * @DATE: 2022/12/21
 * @TIME: 15:14
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 21
 */

@LiteflowComponent("if_x")
public class AIfCmp extends NodeIfComponent {
    @Override
    public boolean processIf() throws Exception {
        // do biz
        return true;
    }
}
