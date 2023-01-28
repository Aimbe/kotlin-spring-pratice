package pr.jay.main.service

import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service
import pr.jay.main.domain.Member
import pr.jay.main.domain.MemberRepository
import java.util.*

@Service
class MemberService(
        val repository: MemberRepository
) {

    // 조회
    fun getMemberById(id: String): Optional<Member> =
            repository.findById(id)

    // 등록
    fun saveMember(member: Member): Member =
            repository.save(member)


    @Cacheable(value = ["member"], key = "#id", cacheManager = "memberRedisTemplate")
    fun getMember(id: String?): Member? {
        println("getMember!!")
        // Logic
    }

}