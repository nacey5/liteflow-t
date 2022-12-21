package com.hzh.liteflowt.flowNode.break_cmp;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeBreakComponent;

/**
 * @NAME: BreakCCmp
 * @USER: DaHuangGO
 * @DATE: 2022/12/21
 * @TIME: 15:59
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 21
 */
@LiteflowComponent("b_c")
public class BreakCCmp extends NodeBreakComponent {
    private int count=1;
    @Override
    public boolean processBreak() throws Exception {
        //do biz
        if (count==0){
            return true;
        }
        count--;
        return false;
    }
}
