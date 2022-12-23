package com.hzh.liteflowt.flowNode.with_data_cmp;

import com.hzh.liteflowt.entity.User;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

/**
 * @NAME: DataAChain
 * @USER: DaHuangGO
 * @DATE: 2022/12/22
 * @TIME: 14:11
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 22
 */
@LiteflowComponent("data_a")
public class DataACmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        System.out.println("---data_a:exec---");
        User cmpData = this.getCmpData(User.class);
        System.out.println(cmpData);
        System.out.println("------end------");
        System.out.println(this.getTag());
    }

    @Override
    public void onSuccess() throws Exception {
        System.out.println("data_a成功啦！！！");
    }
}
