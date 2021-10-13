package com.test.member.controller;

import java.util.ArrayList;

import com.test.member.model.vo.Member;

public class MemberControllerImpl implements MemberController {
	
	private ArrayList<Member> list = new ArrayList<Member>();

	@Override
	public boolean insertMember(Member m) {
		
		boolean result = list.add(m);
		return result;

	}

	@Override
	public Member selectOneMember(int numberId) {
		
		Member result = null;
		
		for(Member m : list) {
			if(m.getId() == numberId) {
				result = m;
				break;
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
		
		boolean result = false;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId()== numberId) {
				list.remove(i);
				result = true;
				break;
			}
		}
		return result;
		
		
	}

}
