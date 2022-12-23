package com.hzh.liteflowt.exception;

import com.yomahub.liteflow.exception.LiteFlowException;

/**
 * @NAME: YourExceptionBaseob
 * @USER: DaHuangGO
 * @DATE: 2022/12/23
 * @TIME: 16:44
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 23
 */
public class YourExceptionBaseOnLite extends LiteFlowException {
    // in your exception do your biz
    public YourExceptionBaseOnLite(String code, String message) {
        super(code, message);
    }
}
