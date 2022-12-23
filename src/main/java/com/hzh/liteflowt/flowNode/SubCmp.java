package com.hzh.liteflowt.flowNode;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

/**
 * @NAME: SubCmp
 * @USER: DaHuangGO
 * @DATE: 2022/12/22
 * @TIME: 13:55
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 22
 * 替补组件
 */
@LiteflowComponent
public class SubCmp extends NodeComponent {

    @Override
    public void process() throws Exception {
        System.out.println("subComp:exec");
    }
}
