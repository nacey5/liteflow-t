package com.hzh.liteflowt.config;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.annotation.LiteflowMethod;
import com.yomahub.liteflow.core.NodeComponent;
import com.yomahub.liteflow.enums.LiteFlowMethodEnum;
import com.yomahub.liteflow.enums.NodeTypeEnum;

/**
 * @NAME: CmpConfig
 * @USER: DaHuangGO
 * @DATE: 2022/12/22
 * @TIME: 12:02
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 22
 */

@LiteflowComponent
public class CmpConfig {

    //普通组件的定义
    @LiteflowMethod(value = LiteFlowMethodEnum.PROCESS, nodeId = "a",nodeType = NodeTypeEnum.COMMON)
    public void processA(NodeComponent bindCmp) {
        System.out.println("a to config:exec");
    }

    @LiteflowMethod(value = LiteFlowMethodEnum.IS_ACCESS,nodeId = "a",nodeType = NodeTypeEnum.COMMON)
    public boolean isAccess(NodeComponent bindCmp){
        return true;
    }

}
