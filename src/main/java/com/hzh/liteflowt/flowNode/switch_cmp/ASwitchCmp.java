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
@LiteflowComponent("s_c_a")
public class ASwitchCmp extends NodeSwitchComponent {
    /**
     * 返回的结果表示选择了s_c_b节点
     * @return
     * @throws Exception
     */
    @Override
    public String processSwitch() throws Exception {
         //直接选择
        /*
        System.out.println("s_c_a:exec");
        return "s_c_c";
        */

        //根据返回id选择
       /*
       System.out.println("s_c_a:exec");
       //todo string 的返回类型能否改成 return Value.id("dog"); 当存在id和tag的时候以id为主
       return "w1";
        */

        //根据返回tag选择
        System.out.println("s_c_a:exec");
        //todo string 的返回类型能否改成 return Value.tag("dog");
        return "tag:dog";

    }
}
