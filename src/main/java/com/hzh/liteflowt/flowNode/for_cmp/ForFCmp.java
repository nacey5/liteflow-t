package com.hzh.liteflowt.flowNode.for_cmp;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeForComponent;

/**
 * @NAME: ForFCmp
 * @USER: DaHuangGO
 * @DATE: 2022/12/21
 * @TIME: 15:21
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 21
 */
@LiteflowComponent("f_f")
public class ForFCmp extends NodeForComponent {
    /**
     * 你在任意的java组件内部可以通过this.getLoopIndex()来获得下标。
     * @return
     * @throws Exception
     */
    @Override
    public int processFor() throws Exception {
        //根据业务返回for的结果---循环次数
        return 2;
    }
}
