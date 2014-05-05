package com.foxinmy.weixin4j.msg.in;

import com.foxinmy.weixin4j.msg.BaseMessage;
import com.foxinmy.weixin4j.type.MessageType;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 视频消息
 * @className VideoMessage
 * @author jy.hu
 * @date 2014年4月6日
 * @since JDK 1.7
 * @see <a href="http://mp.weixin.qq.com/wiki/index.php?title=%E6%8E%A5%E6%94%B6%E6%99%AE%E9%80%9A%E6%B6%88%E6%81%AF#.E8.A7.86.E9.A2.91.E6.B6.88.E6.81.AF">视频消息</a>
 * @see com.foxinmy.weixin4j.msg.BaseMessage
 * @see com.foxinmy.weixin4j.msg.BaseMessage#toXml()
 */
public class VideoMessage extends BaseMessage {

	private static final long serialVersionUID = -1013075358679078381L;

	public VideoMessage() {
		super(MessageType.video);
	}

	@XStreamAlias("MediaId")
	private String mediaId; // 视频消息媒体id，可以调用多媒体文件下载接口拉取数据。
	@XStreamAlias("ThumbMediaId")
	private String thumbMediaId; // 视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据。

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getThumbMediaId() {
		return thumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[VideoMessage ,toUserName=").append(super.getToUserName());
		sb.append(" ,fromUserName=").append(super.getFromUserName());
		sb.append(" ,msgType=").append(super.getMsgType().name());
		sb.append(" ,mediaId=").append(mediaId);
		sb.append(" ,thumbMediaId=").append(thumbMediaId);
		sb.append(" ,createTime=").append(super.getCreateTime());
		sb.append(" ,msgId=").append(super.getMsgId()).append("]");
		return sb.toString();
	}
}
