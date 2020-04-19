package Member;

import java.util.jar.Attributes.Name;

public class MemberServiceImpl implements MemberService{
	
	private Member[] members;
	private int count;
	public MemberServiceImpl() {
		members = new Member[5];
	}
	@Override
	public void add(Member member) {
		members[count] = member;
		count++;
		
	}
	@Override
	public Member[] list() {
		return members;
	}
	@Override
	public Member[] searchByName(String name) {
		Member[] returnMember =  null;
		int searchMember = count(name);
		if(searchMember != 0 ) {
			returnMember =  new Member[searchMember];
			int j =0;
			for(int i=0; i<count; i++) {
				if(name.equals(members[i].getName())) {
				returnMember[j] =  members[i];
				j++;
					if(searchMember == j);
					break;
				}
			}
		}
		return returnMember;
	}
	@Override
	public Member[] searchByGender(String gender) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Member detail(String userid) {
		Member returnMember = new Member();
		for(int i=0; i<count; i++) {
			if(userid.equals(members[i].getUserid())) {
				returnMember = members[i];
				break;
			}
		}
		
		return returnMember;
	}
	@Override
	public int count() {
		return count;
	}
	@Override
	public int count(String name) {
		int returnCount = 0;
		for(int i=0; i<count;i++) {
			if(name.equals(members[i].getName())) {
				break;
			}
		}
		return returnCount;
	}
	@Override
	public Member login(Member member) {
		Member returnMember =  null;
		for(int i=0; i<count;i++) {
			if(member.getUserid().equals(members[i].getUserid())&&
				member.getPasswd().equals(members[i].getPasswd())) {
				returnMember =  new Member();
				break;
			}
		}
		return returnMember;
	}
	@Override
	public void update(Member member) {
		for(int i=0; i<count; i++) {
			if(member.getUserid().equals(members[i].getUserid()));
				member.setPasswd(members[i].getPasswd());
			break;
		}
	}
	@Override
	public void delete(Member member) {
		for(int i=0; i<count;i++) {
			if(member.getUserid().equals(members[i].getUserid())
				&&member.getPasswd().equals(members[i].getPasswd())) {
				
			}
		}
	}
}
