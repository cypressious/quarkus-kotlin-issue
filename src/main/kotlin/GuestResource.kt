package quarkus.issue

import io.quarkus.mongodb.panache.MongoEntity
import io.quarkus.mongodb.panache.PanacheMongoRepository
import io.quarkus.mongodb.rest.data.panache.PanacheMongoRepositoryResource
import org.bson.types.ObjectId
import javax.enterprise.context.ApplicationScoped

@MongoEntity(collection = "guests")
class GuestEntity(
    var id: ObjectId? = null,
    var name: String? = null
)

@ApplicationScoped
class GuestRepository : PanacheMongoRepository<GuestEntity> {
}

@Suppress("unused")
interface GuestResource : PanacheMongoRepositoryResource<GuestRepository, GuestEntity, ObjectId>
