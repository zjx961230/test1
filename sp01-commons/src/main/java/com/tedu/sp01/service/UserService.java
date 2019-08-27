package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	//閫氳繃鐢ㄦ埛id鑾峰彇鐢ㄦ埛
	User getUser(Integer id);
	//淇濆瓨鐢ㄦ埛
	void addScore(Integer id,Integer score);
}
