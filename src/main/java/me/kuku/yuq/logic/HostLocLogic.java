package me.kuku.yuq.logic;

import com.IceCreamQAQ.Yu.annotation.AutoBind;
import me.kuku.pojo.Result;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@AutoBind
public interface HostLocLogic {
	Result<String> login(String username, String password) throws IOException;
	boolean isLogin(String cookie) throws IOException;
	List<Map<String, String>> post();
	String postContent(String url) throws IOException;
}
