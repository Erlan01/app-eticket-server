package ai.ecma.appeticketserver.repository;

import ai.ecma.appeticketserver.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author Murtazayev Muhammad
 * @since 19.12.2021
 */
@Repository
public interface AttachmentRepo extends JpaRepository<Attachment, UUID> {
}
