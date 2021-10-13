package com.test.member.controller;

import java.util.ArrayList;

import com.test.member.model.vo.Member;

public interface MemberController {

	boolean insertMember(Member m);

	Member selectOneMember(int numberId);

	ArrayList<Member> selectAllMember();

	boolean deleteMember(int numberId);

}