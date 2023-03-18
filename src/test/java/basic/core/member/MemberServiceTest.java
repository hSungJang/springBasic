package basic.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * packageName    : basic.core.member
 * fileName       : MemberServiceTest
 * author         : janghyoseong
 * date           : 2023/03/18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/18        janghyoseong       최초 생성
 */
public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        // given
        Member member = new Member(1L, "member1", Grade.VIP);

        // when
        memberService.joinMember(member);
        Member findMember = memberService.findMember(1L);

        // then
        Assertions.assertThat(member).isEqualTo(findMember);

    }
}
