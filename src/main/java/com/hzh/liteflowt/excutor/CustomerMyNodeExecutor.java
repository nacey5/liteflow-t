package com.hzh.liteflowt.excutor;

import com.yomahub.liteflow.core.NodeComponent;
import com.yomahub.liteflow.flow.executor.NodeExecutor;

/**
 * @author DAHUANG
 * @date 2022/12/26
 */
public class CustomerMyNodeExecutor extends NodeExecutor {

    @Override
    public void execute(NodeComponent instance) throws Exception {
        System.out.println("自定义的执行器执行exec:CustomerMyNodeExecutor");
        super.execute(instance);
        //在这里你可以加入自己的代码，包括上面的代码都可以去掉
        //但是要确保至少要调用instance.execute()，否组件就真的无法被正确执行了
    }
}
