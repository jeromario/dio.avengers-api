package dio.avengers.avengers.resource.avenger

import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AvengerEntityRepository: JpaRepository<AvengerEntity,Long>