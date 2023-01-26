package pr.jay.main.domain

import org.springframework.data.repository.CrudRepository

interface MemberRepository: CrudRepository<Member, String>{
    
}