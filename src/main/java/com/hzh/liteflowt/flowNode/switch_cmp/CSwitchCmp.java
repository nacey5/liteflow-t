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
@LiteflowComponent("s_c_c")
public class CSwitchCmp extends NodeSwitchComponent {
    @Override
    public String processSwitch() throws Exception {
        System.out.println("s_c_c:exec");
        return "null";//如果要执行，不拿直接赋值为null，否则插槽出错
    }
}
