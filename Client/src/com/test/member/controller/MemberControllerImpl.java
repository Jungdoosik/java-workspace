package com.test.member.controller;

import java.util.ArrayList;

import com.test.member.model.vo.Member;



public class MemberControllerImpl implements MemberController  {
	ArrayList<Member> list = new ArrayList<Member>();
	@Override
	public boolean insertMember(Member m) {
		boolean result = list.add(m);
		return result;
	}

	@Override
	public Member selectOneMember(int numberId) {
		Member result = null;
		
		for(Member m : list) {
			if(m.getNumberId()==numberId) {
				result = m;
			}
			
		}
		return result;
	}

	@Override
	public ArrayList<Member> selectAllMember() {
		
		return list;
	}

	@Override
	public boolean deleteMember(int numberId) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
