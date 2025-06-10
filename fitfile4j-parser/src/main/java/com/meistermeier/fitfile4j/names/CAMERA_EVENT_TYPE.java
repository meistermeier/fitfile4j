// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum CAMERA_EVENT_TYPE {

	_VIDEO_START(0, "video_start"),

	_VIDEO_SPLIT(1, "video_split"),

	_VIDEO_END(2, "video_end"),

	_PHOTO_TAKEN(3, "photo_taken"),

	_VIDEO_SECOND_STREAM_START(4, "video_second_stream_start"),

	_VIDEO_SECOND_STREAM_SPLIT(5, "video_second_stream_split"),

	_VIDEO_SECOND_STREAM_END(6, "video_second_stream_end"),

	_VIDEO_SPLIT_START(7, "video_split_start"),

	_VIDEO_SECOND_STREAM_SPLIT_START(8, "video_second_stream_split_start"),

	_VIDEO_PAUSE(11, "video_pause"),

	_VIDEO_SECOND_STREAM_PAUSE(12, "video_second_stream_pause"),

	_VIDEO_RESUME(13, "video_resume"),

	_VIDEO_SECOND_STREAM_RESUME(14, "video_second_stream_resume");

	private final int messageNumber;

	private final String messageName;

	CAMERA_EVENT_TYPE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static CAMERA_EVENT_TYPE findById(int messageNumber) {
		for (CAMERA_EVENT_TYPE name : CAMERA_EVENT_TYPE.values()) {
			if (name.messageNumber == messageNumber) {
				return name;
			}
		}
		return null;
	}

	public String getMessageName() {
		return this.messageName;
	}

}
