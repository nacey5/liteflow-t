package com.hzh.liteflowt.flowNode.switch_cmp;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeSwitchComponent;

/**
 * @NAME: ASwitchCmp
 * @USER: DaHuangGO
 * @DATE: 2022/12/21
 * @TIME: 2:07
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 21
 */
@LiteflowComponent("s_c_b")
public class BSwitchCmp extends NodeSwitchComponent {

    /**
     * 返回的结果表示选择了s_c_c节点
     * @return
     * @throws Exception
     */
    @Override
    public String processSwitch() throws Exception {
        System.out.println("s_c_b:exec");
        return "s_c_c";
    }
}
