package com.hzh.liteflowt.aspect;

import com.yomahub.liteflow.aop.ICmpAroundAspect;
import com.yomahub.liteflow.slot.DefaultContext;
import com.yomahub.liteflow.slot.Slot;
import org.springframework.stereotype.Component;

/**
 * @NAME: CmpAspectFirst
 * @USER: DaHuangGO
 * @DATE: 2022/12/23
 * @TIME: 16:29
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 23
 * 切面工具-----全局切面
 * 这个针对的是所有的组件
 */
@Component
public class CmpAspectFirst implements ICmpAroundAspect {

    @Override
    public void beforeProcess(String s, Slot slot) {
        DefaultContext contextBean = slot.getContextBean(DefaultContext.class);
        //before do your biz
    }

    @Override
    public void afterProcess(String s, Slot slot) {
        DefaultContext contextBean = slot.getContextBean(DefaultContext.class);
        //after do your biz
    }
}
