package net.talkabot.assignment.repository;

import net.talkabot.assignment.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface MessageRepository extends JpaRepository<Message, Long> {

        Message findOneById(@Param("id") int id);

}
