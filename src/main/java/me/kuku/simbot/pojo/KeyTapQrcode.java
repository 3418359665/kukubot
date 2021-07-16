package me.kuku.simbot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KeyTapQrcode {
	private String url;
	private String deviceId;
	private String qid;
}
