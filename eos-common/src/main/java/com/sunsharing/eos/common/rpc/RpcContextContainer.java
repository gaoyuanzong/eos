/**
 * @(#)RpcServletContext
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 *<br> Copyright:  Copyright (c) 2014
 *<br> Company:厦门畅享信息技术有限公司
 *<br> @author ulyn
 *<br> 14-4-1 上午10:39
 *<br> @version 1.0
 *————————————————————————————————
 *修改记录
 *    修改者：
 *    修改时间：
 *    修改原因：
 *————————————————————————————————
 */
package com.sunsharing.eos.common.rpc;

/**
 * <pre></pre>
 * <br>----------------------------------------------------------------------
 * <br> <b>功能描述:</b>
 * <br>  RpcContext上下文容器
 * <br> 注意事项:
 * <br>
 * <br>
 * <br>----------------------------------------------------------------------
 * <br>
 */
public class RpcContextContainer {

    private static ThreadLocal<RpcContext> rpcContextLocal = new ThreadLocal<RpcContext>();

    public static RpcContext getRpcContext() {
        return rpcContextLocal.get();
    }

    public static void setRpcContext(RpcContext rpcContext) {
        rpcContextLocal.set(rpcContext);
    }
}

