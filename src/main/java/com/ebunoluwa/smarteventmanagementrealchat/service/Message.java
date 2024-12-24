package com.ebunoluwa.smarteventmanagementrealchat.service;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Message {
	private MsgType type;

	private String content;

	private String sender;
}
