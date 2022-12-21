package com.hzh.liteflowt.de_fcmp;

import com.yomahub.liteflow.annotation.LiteflowCmpDefine;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.annotation.LiteflowMethod;
import com.yomahub.liteflow.core.NodeComponent;
import com.yomahub.liteflow.enums.LiteFlowMethodEnum;
import com.yomahub.liteflow.slot.Slot;

/**
 * @NAME: DefACmp
 * @USER: DaHuangGO
 * @DATE: 2022/12/22
 * @TIME: 1:41
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 22
 */
@LiteflowComponent("a_def")
@LiteflowCmpDefine
public class DefACmp{

    @LiteflowMethod(LiteFlowMethodEnum.PROCESS)
    public void processDefACmp(NodeComponent bindCmp) {
        System.out.println("ACmp executed!");
    }

    @LiteflowMethod(LiteFlowMethodEnum.IS_ACCESS)
    public boolean isDefACmpAccess(NodeComponent bindCmp){
        return true;
    }

    @LiteflowMethod(LiteFlowMethodEnum.BEFORE_PROCESS)
    public void beforeDefACmp(String nodeId, Slot slot){
        System.out.println("before A");
    }

    @LiteflowMethod(LiteFlowMethodEnum.AFTER_PROCESS)
    public void afterDefACmp(String nodeId, Slot slot){
        System.out.println("after A");
    }

    @LiteflowMethod(LiteFlowMethodEnum.ON_SUCCESS)
    public void onDefACmpSuccess(NodeComponent bindCmp){
        System.out.println("DefACmp success");
    }

    @LiteflowMethod(LiteFlowMethodEnum.ON_ERROR)
    public void onDefACmpError(NodeComponent bindCmp){
        System.out.println("DefACmp error");
    }

    @LiteflowMethod(LiteFlowMethodEnum.IS_END)
    public boolean isDefACmpEnd(NodeComponent bindCmp) {
        return false;
    }
}

