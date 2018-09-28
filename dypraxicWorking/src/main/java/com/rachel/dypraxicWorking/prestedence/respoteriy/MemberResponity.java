package com.rachel.dypraxicWorking.prestedence.respoteriy;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rachel.dypraxicWorking.prestedence.dormain.Member;;

public interface MemberResponity extends JpaRepository<Member, Long> {
	

}
