/**
 * @(#)ProFactory
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 *<br> Copyright:  Copyright (c) 2014
 *<br> Company:厦门畅享信息技术有限公司
 *<br> @author ulyn
 *<br> 14-2-5 上午1:42
 *<br> @version 1.0
 *————————————————————————————————
 *修改记录
 *    修改者：
 *    修改时间：
 *    修改原因：
 *————————————————————————————————
 */
package com.sunsharing.eos.common.rpc.protocol;

import org.jboss.netty.buffer.ChannelBuffer;

/**
 * <pre></pre>
 * <br>----------------------------------------------------------------------
 * <br> <b>功能描述:</b>
 * <br>
 * <br> 注意事项:
 * <br>
 * <br>
 * <br>----------------------------------------------------------------------
 * <br>
 */
public class ProFactory {
    public static BaseProtocol createPro(ChannelBuffer buffer) {
        if (buffer.readableBytes() < 1) {
            return null;
        }
        buffer.markReaderIndex();
        byte action = buffer.readByte();
        buffer.resetReaderIndex();
        if (action == BaseProtocol.REQUEST_MSG) {
            return new RequestPro().createFromChannel(buffer);
        } else if (action == BaseProtocol.REQUEST_MSG_RESULT) {
            return new ResponsePro().createFromChannel(buffer);
        } else if (action == BaseProtocol.HEART_BEAT)
        {
            return new HeartPro().createFromChannel(buffer);
        }
        return null;
    }
}

