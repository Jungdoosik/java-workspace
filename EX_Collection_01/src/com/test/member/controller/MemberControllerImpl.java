package com.test.member.controller;

import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import com.test.member.model.vo.Member;

public class MemberControllerImpl implements MemberController {
	private ArrayList<Member>list = new ArrayList<Member>();

	@Override
	public boolean insertMember(Member m) {
		boolean result = list.add(m);
		return result;
	}

	@Override
	public Member selectOneMember(int numberId) {
		
		return null;
	}

	@Override
	public ArrayList<Member> selectAllMember() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteMember(int numberId) {
		// TODO Auto-generated method stub
		return false;
	}

}
