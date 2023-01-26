package pr.jay.main.domain

import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash

@RedisHash(value ="member")
class Member {

    @Id
    var id: String? = null
    var name: String? = null
    var age: Int? = null
}